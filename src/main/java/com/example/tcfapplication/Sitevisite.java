package com.example.tcfapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;
public class Sitevisite extends AppCompatActivity {

    private static int RESULT_LOAD_IMAGE = 1;
    ImageView imageView;
    private StorageReference storageReference;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    ProgressBar progressBar;
    Uri selectedImage;
    String Location,Region,UploadFor,uploadby;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitevisite);
        storageReference= FirebaseStorage.getInstance().getReference("SiteVisit");
        databaseReference= FirebaseDatabase.getInstance().getReference("SiteVisit");
        uploadby=FirebaseAuth.getInstance().getCurrentUser().getEmail().toString();
        imageView = findViewById(R.id.image_view);
        progressBar = findViewById(R.id.progressBar);
        Spinner spinner = findViewById(R.id.selregdrop);
        ArrayAdapter<String> regionadapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.Region));
        regionadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(regionadapter);
        Region=spinner.getSelectedItem().toString();

        Spinner spinner1 = findViewById(R.id.sellocdrop);
        ArrayAdapter<String> locdrop = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.Location));
        regionadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(locdrop);
        Location=spinner1.getSelectedItem().toString();


        Spinner spinner2 = findViewById(R.id.browsimage);
        ArrayAdapter<String> browsimagedrop = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.Images));
        regionadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(browsimagedrop);
        UploadFor=spinner2.getSelectedItem().toString();

        Button buttonLoadImage = (Button) findViewById(R.id.chosefile);
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
            }
        });

        Button buttonUpload = (Button) findViewById(R.id.Upload);
        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadImage();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
             selectedImage = data.getData();

            Picasso.get().load(selectedImage).into(imageView);
        }
    }

    private  String getFileExtention(Uri uri){
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    private void UploadImage(){

        if(selectedImage!=null){
            StorageReference filereference =storageReference.child(System.currentTimeMillis()+"."+getFileExtention(selectedImage));
            storageReference.putFile(selectedImage).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                                progressBar.setProgress(0);
                        }
                    },5000);
                    Toast.makeText(Sitevisite.this, "Upload Successs", Toast.LENGTH_SHORT).show();
                    Task<Uri> uri=taskSnapshot.getStorage().getDownloadUrl();
                    SiteVisitData siteVisitData = new SiteVisitData(uri.toString()
                            );
                            String UploadId=databaseReference.push().getKey();
                            databaseReference.child(UploadId).setValue(siteVisitData);

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Sitevisite.this,e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                double progress =(100.0*taskSnapshot.getBytesTransferred()/taskSnapshot.getTotalByteCount());
                progressBar.setProgress((int) progress);
                }
            });
        }
        else {

            Toast.makeText(this, "No Image Is Selected", Toast.LENGTH_SHORT).show();
        }
    }
}



