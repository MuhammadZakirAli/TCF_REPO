package com.example.tcfapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FillForm extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String value ;
    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_form);

//        dbref= FirebaseDatabase.getInstance().getReference();
//        dbref.child("CreateProject").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                final List<String> cname=new ArrayList<String>();
//                for(DataSnapshot cnameSnapshot: dataSnapshot.getChildren())
//                {
//                    String campusname=cnameSnapshot.child("campusnametxt").getValue(String.class);
//                    cname.add(campusname);
//                }
//                Spinner cnameSpinner=(Spinner)findViewById(R.id.browsimage);
//                ArrayAdapter<String> cnameAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cname);
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

        Button btn = findViewById(R.id.viewformtypebtn);
        final Spinner spinner = findViewById(R.id.formtype);



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.FormType));
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:
                        value="Painting";
                        break;

                        case 1:
                            value="Electrical";
                            break;
                        case 2:
                            value="Window";
                            break;
                        case 3:
                            value="Finishing";
                            break;
                        case 4:
                            value="Plumbing";
                            break;
                        case 5:
                            value="Woodwork";
                            break;
                        case 6:
                            value="Civil";
                            break;
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                  switch (value)
                  {
                      case "Civil":
                      Intent intent = new Intent(FillForm.this,Civilform.class);
                      startActivity(intent);
                          break;
                      case "Electrical":
                          Intent electrical = new Intent(FillForm.this,ElectricalFrom.class);
                          startActivity(electrical);
                          break;
                      case "Window":
                          Intent Window = new Intent(FillForm.this,WindowsForm.class);
                          startActivity(Window);
                          break;
                      case "Finishing":
                          Intent Finishing = new Intent(FillForm.this,FinishingForm.class);
                          startActivity(Finishing);
                          break;
                      case "Plumbing":
                          Intent Plumbing = new Intent(FillForm.this,PlumbingForm.class);
                          startActivity(Plumbing);
                          break;
                      case "Woodwork":
                          Intent Woodwork = new Intent(FillForm.this,WoodworkForm.class);
                          startActivity(Woodwork);
                          break;
                      case "Painting":
                          Intent painting = new Intent(FillForm.this,PaintingForm.class);
                          startActivity(painting);
                          break;

                  }




                }
                catch (Exception ex){

                    Toast.makeText(FillForm.this, "something wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
