package com.example.tcfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PlumbingForm extends AppCompatActivity {

    EditText Basins_dis,Taps_dis,WC_Flush_dis,Plumbing_fixtures_dis,Septic_Tank_dis,Soak_pit_dis,UGW_Tank_dis,
    OHW_Tank_dis,Drainage_dis,Manhole_dis;

    CheckBox BasinsCB,TapsCB,WC_FlushCB,Plumbing_fixturesCB,Septic_TankCB,Soak_pitCB,UGW_TankCB,
            OHW_TankCB,DrainageCB,ManholeCB;
    CheckBox Basins_f,Basins_s,Basins_t,Taps_f,Taps_s,Taps_t,WC_Flush_f,WC_Flush_s,WC_Flush_t,
            Plumbing_fixtures_f,Plumbing_fixtures_s,Plumbing_fixtures_t,
            Septic_Tank_f,Septic_Tank_s,Septic_Tank_t,Soak_pit_f,Soak_pit_s,Soak_pit_t,
            UGW_Tank_f,UGW_Tank_s,UGW_Tank_t,OHW_Tank_f,OHW_Tank_s,OHW_Tank_t,
            Drainage_f,Drainage_s,Drainage_t,
            Manhole_f,Manhole_s,Manhole_t;
    Spinner Basins_sf,Basins_ss,Basins_st,Basins_pri,
            Taps_sf,Taps_ss,Taps_st,Taps_pri,
            WC_Flush_sf,WC_Flush_ss,WC_Flush_st,WC_Flush_pri,
            Plumbing_fixtures_sf,Plumbing_fixtures_ss,Plumbing_fixtures_st,Plumbing_fixtures_pri,
            Septic_Tank_sf,Septic_Tank_ss,Septic_Tank_st,Septic_Tank_pri,
            Soak_pit_sf,Soak_pit_ss,Soak_pit_st,Soak_pit_pri,
            UGW_Tank_sf,UGW_Tank_ss,UGW_Tank_st,UGW_Tank_pri,
            OHW_Tank_sf,OHW_Tank_ss,OHW_Tank_st,OHW_Tank_pri,
            Drainage_sf,Drainage_ss,Drainage_st,Drainage_pri,
            Manhole_sf,Manhole_ss,Manhole_st,Manhole_pri;
    Button btnplumbingSubmit;
    DatabaseReference dbPlumbingform;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumbing_form);

        dbPlumbingform= FirebaseDatabase.getInstance().getReference("inspectionform/Plumbing");

        BasinsCB=findViewById(R.id.Basins_1);
        TapsCB=findViewById(R.id.Taps_1);
        WC_FlushCB=findViewById(R.id.WC_Flush);
        Plumbing_fixturesCB=findViewById(R.id.Plumbing_fixtures);
        Septic_TankCB=findViewById(R.id.Septic_Tank);
        Soak_pitCB=findViewById(R.id.Soak_pit);
        UGW_TankCB=findViewById(R.id.UGW_Tank);
        OHW_TankCB=findViewById(R.id.OHW_Tank);
        DrainageCB=findViewById(R.id.Drainage);
        ManholeCB=findViewById(R.id.Manhole);

        btnplumbingSubmit=findViewById(R.id.plumbingSubmit);

        Basins_f=findViewById(R.id.Basins_1f);
        Basins_s=findViewById(R.id.Basins_1s);
        Basins_t=findViewById(R.id.Basins_1t);
        Basins_dis=findViewById(R.id.Basins_1dis);
        Taps_f=findViewById(R.id.Taps_1_f);
        Taps_s=findViewById(R.id.Taps_1_s);
        Taps_t=findViewById(R.id.Taps_1_t);
        Taps_dis=findViewById(R.id.Taps_1_dis);
        WC_Flush_f=findViewById(R.id.WC_Flush_f);
        WC_Flush_s=findViewById(R.id.WC_Flush_s);
        WC_Flush_t=findViewById(R.id.WC_Flush_t);
        WC_Flush_dis=findViewById(R.id.WC_Flush_dis);
        Plumbing_fixtures_f=findViewById(R.id.Plumbing_fixtures_f);
        Plumbing_fixtures_s=findViewById(R.id.Plumbing_fixtures_s);
        Plumbing_fixtures_t=findViewById(R.id.Plumbing_fixtures_t);
        Plumbing_fixtures_dis=findViewById(R.id.Plumbing_fixtures_dis);
        Septic_Tank_f=findViewById(R.id.Septic_Tank_f);
        Septic_Tank_s=findViewById(R.id.Septic_Tank_s);
        Septic_Tank_t=findViewById(R.id.Septic_Tank_t);
        Septic_Tank_dis=findViewById(R.id.Septic_Tank_dis);
        Soak_pit_f=findViewById(R.id.Soak_pit_f);
        Soak_pit_s=findViewById(R.id.Soak_pit_s);
        Soak_pit_t=findViewById(R.id.Soak_pit_t);
        Soak_pit_dis=findViewById(R.id.Soak_pit_dis);
        UGW_Tank_f=findViewById(R.id.UGW_Tank_f);
        UGW_Tank_s=findViewById(R.id.UGW_Tank_s);
        UGW_Tank_t=findViewById(R.id.UGW_Tank_t);
        UGW_Tank_dis=findViewById(R.id.UGW_Tank_dis);
        OHW_Tank_f=findViewById(R.id.OHW_Tank_f);
        OHW_Tank_s=findViewById(R.id.OHW_Tank_s);
        OHW_Tank_t=findViewById(R.id.OHW_Tank_t);
        OHW_Tank_dis=findViewById(R.id.OHW_Tank_dis);
        Drainage_f=findViewById(R.id.Drainage_f);
        Drainage_s=findViewById(R.id.Drainage_s);
        Drainage_t=findViewById(R.id.Drainage_t);
        Drainage_dis=findViewById(R.id.Drainage_dis);
        Manhole_f=findViewById(R.id.Manhole_f);
        Manhole_s=findViewById(R.id.Manhole_s);
        Manhole_t=findViewById(R.id.Manhole_t);
        Manhole_dis=findViewById(R.id.Manhole_dis);

        //Basins_sf
        ArrayAdapter<String> adpt_Basins_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Basins_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Basins_sf=findViewById(R.id.Basins_1_sf);
        Basins_sf.setAdapter(adpt_Basins_sf);

        //Basins_ss
        ArrayAdapter<String> adpt_Basins_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Basins_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Basins_ss=findViewById(R.id.Basins_1_ss);
        Basins_ss.setAdapter(adpt_Basins_ss);

        //Basins_st
        ArrayAdapter<String> adpt_Basins_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Basins_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Basins_st=findViewById(R.id.Basins_1_st);
        Basins_st.setAdapter(adpt_Basins_st);

        //Basins_pri
        ArrayAdapter<String> adpt_Basins_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Basins_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Basins_pri=findViewById(R.id.Basins_1_pri);
        Basins_pri.setAdapter(adpt_Basins_pri);

        //Taps_sf
        ArrayAdapter<String> adpt_Taps_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Taps_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Taps_sf=findViewById(R.id.Taps_1_sf);
        Taps_sf.setAdapter(adpt_Taps_sf);

        //Taps_ss
        ArrayAdapter<String> adpt_Taps_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Taps_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Taps_ss=findViewById(R.id.Taps_1_ss);
        Taps_ss.setAdapter(adpt_Taps_ss);

        //Taps_st
        ArrayAdapter<String> adpt_Taps_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Taps_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Taps_st=findViewById(R.id.Taps_1_st);
        Taps_st.setAdapter(adpt_Taps_st);

        //Taps_pri
        ArrayAdapter<String> adpt_Taps_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Taps_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Taps_pri=findViewById(R.id.Taps_1_pri);
        Taps_pri.setAdapter(adpt_Taps_pri);

        //WC_Flush_sf
        ArrayAdapter<String> adpt_WC_Flush_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_WC_Flush_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        WC_Flush_sf=findViewById(R.id.WC_Flush_sf);
        WC_Flush_sf.setAdapter(adpt_WC_Flush_sf);

        //WC_Flush_ss
        ArrayAdapter<String> adpt_WC_Flush_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_WC_Flush_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        WC_Flush_ss=findViewById(R.id.WC_Flush_ss);
        WC_Flush_ss.setAdapter(adpt_WC_Flush_ss);

        //WC_Flush_st
        ArrayAdapter<String> adpt_WC_Flush_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_WC_Flush_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        WC_Flush_st=findViewById(R.id.WC_Flush_st);
        WC_Flush_st.setAdapter(adpt_WC_Flush_st);

        //WC_Flush_sf
        ArrayAdapter<String> adpt_WC_Flush_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_WC_Flush_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        WC_Flush_pri=findViewById(R.id.WC_Flush_pri);
        WC_Flush_pri.setAdapter(adpt_WC_Flush_pri);

        //Plumbing_fixtures_sf
        ArrayAdapter<String> adpt_Plumbing_fixtures_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Plumbing_fixtures_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Plumbing_fixtures_sf=findViewById(R.id.Plumbing_fixtures_sf);
        Plumbing_fixtures_sf.setAdapter(adpt_Plumbing_fixtures_sf);

        //Plumbing_fixtures_ss
        ArrayAdapter<String> adpt_Plumbing_fixtures_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Plumbing_fixtures_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Plumbing_fixtures_ss=findViewById(R.id.Plumbing_fixtures_ss);
        Plumbing_fixtures_ss.setAdapter(adpt_Plumbing_fixtures_ss);

        //Plumbing_fixtures_st
        ArrayAdapter<String> adpt_Plumbing_fixtures_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Plumbing_fixtures_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Plumbing_fixtures_st=findViewById(R.id.Plumbing_fixtures_st);
        Plumbing_fixtures_st.setAdapter(adpt_Plumbing_fixtures_st);

        //Plumbing_fixtures_pri
        ArrayAdapter<String> adpt_Plumbing_fixtures_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Plumbing_fixtures_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Plumbing_fixtures_pri=findViewById(R.id.Plumbing_fixtures_pri);
        Plumbing_fixtures_pri.setAdapter(adpt_Plumbing_fixtures_pri);

        //Septic_Tank_sf
        ArrayAdapter<String> adpt_Septic_Tank_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Septic_Tank_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Septic_Tank_sf=findViewById(R.id.Septic_Tank_sf);
        Septic_Tank_sf.setAdapter(adpt_Septic_Tank_sf);

        //Septic_Tank_ss
        ArrayAdapter<String> adpt_Septic_Tank_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Septic_Tank_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Septic_Tank_ss=findViewById(R.id.Septic_Tank_ss);
        Septic_Tank_ss.setAdapter(adpt_Septic_Tank_ss);

        //Septic_Tank_st
        ArrayAdapter<String> adpt_Septic_Tank_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Septic_Tank_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Septic_Tank_st=findViewById(R.id.Septic_Tank_st);
        Septic_Tank_st.setAdapter(adpt_Septic_Tank_st);

        //Septic_Tank_pri
        ArrayAdapter<String> adpt_Septic_Tank_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Septic_Tank_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Septic_Tank_pri=findViewById(R.id.Septic_Tank_pri);
        Septic_Tank_pri.setAdapter(adpt_Septic_Tank_pri);

        //Soak_pit_sf
        ArrayAdapter<String> adpt_Soak_pit_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Soak_pit_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Soak_pit_sf=findViewById(R.id.Soak_pit_sf);
        Soak_pit_sf.setAdapter(adpt_Soak_pit_sf);

        //Soak_pit_ss
        ArrayAdapter<String> adpt_Soak_pit_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Soak_pit_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Soak_pit_ss=findViewById(R.id.Soak_pit_ss);
        Soak_pit_ss.setAdapter(adpt_Soak_pit_ss);

        //Soak_pit_st
        ArrayAdapter<String> adpt_Soak_pit_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Soak_pit_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Soak_pit_st=findViewById(R.id.Soak_pit_st);
        Soak_pit_st.setAdapter(adpt_Soak_pit_st);

        //Soak_pit_pri
        ArrayAdapter<String> adpt_Soak_pit_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Soak_pit_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Soak_pit_pri=findViewById(R.id.Soak_pit_pri);
        Soak_pit_pri.setAdapter(adpt_Soak_pit_pri);

       // UGW_Tank_sf
        ArrayAdapter<String> adpt_UGW_Tank_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UGW_Tank_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UGW_Tank_sf=findViewById(R.id.UGW_Tank_sf);
        UGW_Tank_sf.setAdapter(adpt_UGW_Tank_sf);

        // UGW_Tank_ss
        ArrayAdapter<String> adpt_UGW_Tank_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UGW_Tank_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UGW_Tank_ss=findViewById(R.id.UGW_Tank_ss);
        UGW_Tank_ss.setAdapter(adpt_UGW_Tank_ss);

        // UGW_Tank_st
        ArrayAdapter<String> adpt_UGW_Tank_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UGW_Tank_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UGW_Tank_st=findViewById(R.id.UGW_Tank_st);
        UGW_Tank_st.setAdapter(adpt_UGW_Tank_st);

        // UGW_Tank_pri
        ArrayAdapter<String> adpt_UGW_Tank_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_UGW_Tank_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UGW_Tank_pri=findViewById(R.id.UGW_Tank_pri);
        UGW_Tank_pri.setAdapter(adpt_UGW_Tank_pri);

        //OHW_Tank_sf
        ArrayAdapter<String> adpt_OHW_Tank_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_OHW_Tank_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        OHW_Tank_sf=findViewById(R.id.OHW_Tank_sf);
        OHW_Tank_sf.setAdapter(adpt_OHW_Tank_sf);

        //OHW_Tank_ss
        ArrayAdapter<String> adpt_OHW_Tank_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_OHW_Tank_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        OHW_Tank_ss=findViewById(R.id.OHW_Tank_ss);
        OHW_Tank_ss.setAdapter(adpt_OHW_Tank_ss);

        //OHW_Tank_st
        ArrayAdapter<String> adpt_OHW_Tank_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_OHW_Tank_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        OHW_Tank_st=findViewById(R.id.OHW_Tank_st);
        OHW_Tank_st.setAdapter(adpt_OHW_Tank_st);

        //OHW_Tank_pri
        ArrayAdapter<String> adpt_OHW_Tank_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_OHW_Tank_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        OHW_Tank_pri=findViewById(R.id.OHW_Tank_pri);
        OHW_Tank_pri.setAdapter(adpt_OHW_Tank_pri);

        //Drainage_sf
        ArrayAdapter<String> adpt_Drainage_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Drainage_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Drainage_sf=findViewById(R.id.Drainage_sf);
        Drainage_sf.setAdapter(adpt_Drainage_sf);

        //Drainage_ss
        ArrayAdapter<String> adpt_Drainage_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Drainage_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Drainage_ss=findViewById(R.id.Drainage_ss);
        Drainage_ss.setAdapter(adpt_Drainage_ss);

        //Drainage_st
        ArrayAdapter<String> adpt_Drainage_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Drainage_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Drainage_st=findViewById(R.id.Drainage_st);
        Drainage_st.setAdapter(adpt_Drainage_st);

        //Drainage_pri
        ArrayAdapter<String> adpt_Drainage_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Drainage_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Drainage_pri=findViewById(R.id.Drainage_pri);
        Drainage_pri.setAdapter(adpt_Drainage_pri);

        //Manhole_sf
        ArrayAdapter<String> adpt_Manhole_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Manhole_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Manhole_sf=findViewById(R.id.Manhole_sf);
        Manhole_sf.setAdapter(adpt_Manhole_sf);

        //Manhole_ss
        ArrayAdapter<String> adpt_Manhole_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Manhole_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Manhole_ss=findViewById(R.id.Manhole_ss);
        Manhole_ss.setAdapter(adpt_Manhole_ss);

        //Manhole_st
        ArrayAdapter<String> adpt_Manhole_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Manhole_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Manhole_st=findViewById(R.id.Manhole_st);
        Manhole_st.setAdapter(adpt_Manhole_st);

        //Manhole_pri
        ArrayAdapter<String> adpt_Manhole_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Manhole_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Manhole_pri=findViewById(R.id.Manhole_pri);
        Manhole_pri.setAdapter(adpt_Manhole_pri);

        btnplumbingSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Plumbing_checked();
            }
        });

    }

    public void Plumbing_checked()
    {
        String Basins,Taps,WC_Flush,Plumbing_fixtures,Septic_Tank,Soak_pit,UGW_Tank,
                OHW_Tank,Drainage,Manhole;

        Basins=Taps=WC_Flush=Plumbing_fixtures=Septic_Tank=Soak_pit=UGW_Tank=OHW_Tank=Drainage=Manhole="";
        if(BasinsCB.isChecked())
        {
            Basins=BasinsCB.getText().toString();
            if(Basins_f.isChecked())
            {
                Basins+=Basins_f.getText().toString()+", SCORE = "+Basins_sf.getSelectedItem().toString();
            }
            if(Basins_s.isChecked())
            {
                Basins+=Basins_s.getText().toString()+", SCORE = "+Basins_ss.getSelectedItem().toString();
            }
            if(Basins_t.isChecked())
            {
                Basins+=Basins_t.getText().toString()+", SCORE = "+Basins_st.getSelectedItem().toString();
            }
            Basins+=", DESCRIPTION ("+Basins_dis.getText().toString()+")";
            Basins+=", PRIORITY ="+Basins_pri.getSelectedItem().toString();
        }
        if(TapsCB.isChecked())
        {
            Taps=TapsCB.getText().toString();
            if(Taps_f.isChecked())
            {
                Taps+=Taps_f.getText().toString()+", SCORE = "+Taps_sf.getSelectedItem().toString();
            }
            if(Taps_s.isChecked())
            {
                Taps+=Taps_s.getText().toString()+", SCORE = "+Taps_ss.getSelectedItem().toString();
            }
            if(Taps_t.isChecked())
            {
                Taps+=Taps_t.getText().toString()+", SCORE = "+Taps_st.getSelectedItem().toString();
            }
            Taps+=", DESCRIPTION ("+Taps_dis.getText().toString()+")";
            Taps+=", PRIORITY ="+Taps_pri.getSelectedItem().toString();
        }
        if(WC_FlushCB.isChecked())
        {
            WC_Flush=WC_FlushCB.getText().toString();
            if(WC_Flush_f.isChecked())
            {
                WC_Flush+=WC_Flush_f.getText().toString()+", SCORE = "+WC_Flush_sf.getSelectedItem().toString();
            }
            if(WC_Flush_s.isChecked())
            {
                WC_Flush+=WC_Flush_s.getText().toString()+", SCORE = "+WC_Flush_ss.getSelectedItem().toString();
            }
            if(WC_Flush_t.isChecked())
            {
                WC_Flush+=WC_Flush_t.getText().toString()+", SCORE = "+WC_Flush_st.getSelectedItem().toString();
            }
            WC_Flush+=", DESCRIPTION ("+WC_Flush_dis.getText().toString()+")";
            WC_Flush+=", PRIORITY ="+WC_Flush_pri.getSelectedItem().toString();
        }
        if(Plumbing_fixturesCB.isChecked())
        {
            Plumbing_fixtures=Plumbing_fixturesCB.getText().toString();
            if(Plumbing_fixtures_f.isChecked())
            {
                Plumbing_fixtures+=Plumbing_fixtures_f.getText().toString()+", SCORE = "+Plumbing_fixtures_sf.getSelectedItem().toString();
            }
            if(Plumbing_fixtures_s.isChecked())
            {
                Plumbing_fixtures+=Plumbing_fixtures_s.getText().toString()+", SCORE = "+Plumbing_fixtures_ss.getSelectedItem().toString();
            }
            if(Plumbing_fixtures_t.isChecked())
            {
                Plumbing_fixtures+=Plumbing_fixtures_t.getText().toString()+", SCORE = "+Plumbing_fixtures_st.getSelectedItem().toString();
            }
            Plumbing_fixtures+=", DESCRIPTION ("+Plumbing_fixtures_dis.getText().toString()+")";
            Plumbing_fixtures+=", PRIORITY ="+Plumbing_fixtures_pri.getSelectedItem().toString();
        }
        if(Septic_TankCB.isChecked())
        {
            Septic_Tank=Septic_TankCB.getText().toString();
            if(Septic_Tank_f.isChecked())
            {
                Septic_Tank+=Septic_Tank_f.getText().toString()+", SCORE = "+Septic_Tank_sf.getSelectedItem().toString();
            }
            if(Septic_Tank_s.isChecked())
            {
                Septic_Tank+=Septic_Tank_s.getText().toString()+", SCORE = "+Septic_Tank_ss.getSelectedItem().toString();
            }
            if(Septic_Tank_t.isChecked())
            {
                Septic_Tank+=Septic_Tank_t.getText().toString()+", SCORE = "+Septic_Tank_st.getSelectedItem().toString();
            }
            Septic_Tank+=", DESCRIPTION ("+Septic_Tank_dis.getText().toString()+")";
            Septic_Tank+=", PRIORITY ="+Septic_Tank_pri.getSelectedItem().toString();
        }
        if(Soak_pitCB.isChecked())
        {
            Soak_pit=Soak_pitCB.getText().toString();
            if(Soak_pit_f.isChecked())
            {
                Soak_pit+=Soak_pit_f.getText().toString()+", SCORE = "+Soak_pit_sf.getSelectedItem().toString();
            }
            if(Soak_pit_s.isChecked())
            {
                Soak_pit+=Soak_pit_s.getText().toString()+", SCORE = "+Soak_pit_ss.getSelectedItem().toString();
            }
            if(Soak_pit_t.isChecked())
            {
                Soak_pit+=Soak_pit_t.getText().toString()+", SCORE = "+Soak_pit_st.getSelectedItem().toString();
            }
            Soak_pit+=", DESCRIPTION ("+Soak_pit_dis.getText().toString()+")";
            Soak_pit+=", PRIORITY ="+Soak_pit_pri.getSelectedItem().toString();
        }
        if(UGW_TankCB.isChecked())
        {
            UGW_Tank=UGW_TankCB.getText().toString();
            if(UGW_Tank_f.isChecked())
            {
                UGW_Tank+=UGW_Tank_f.getText().toString()+", SCORE = "+UGW_Tank_sf.getSelectedItem().toString();
            }
            if(UGW_Tank_s.isChecked())
            {
                UGW_Tank+=UGW_Tank_s.getText().toString()+", SCORE = "+UGW_Tank_ss.getSelectedItem().toString();
            }
            if(UGW_Tank_t.isChecked())
            {
                UGW_Tank+=UGW_Tank_t.getText().toString()+", SCORE = "+UGW_Tank_st.getSelectedItem().toString();
            }
            UGW_Tank+=", DESCRIPTION ("+UGW_Tank_dis.getText().toString()+")";
            UGW_Tank+=", PRIORITY ="+UGW_Tank_pri.getSelectedItem().toString();
        }

        if(OHW_TankCB.isChecked())
        {
            OHW_Tank=OHW_TankCB.getText().toString();
            if(OHW_Tank_f.isChecked())
            {
                OHW_Tank+=OHW_Tank_f.getText().toString()+", SCORE = "+OHW_Tank_sf.getSelectedItem().toString();
            }
            if(OHW_Tank_s.isChecked())
            {
                OHW_Tank+=OHW_Tank_s.getText().toString()+", SCORE = "+OHW_Tank_ss.getSelectedItem().toString();
            }
            if(OHW_Tank_t.isChecked())
            {
                OHW_Tank+=OHW_Tank_t.getText().toString()+", SCORE = "+OHW_Tank_st.getSelectedItem().toString();
            }
            OHW_Tank+=", DESCRIPTION ("+OHW_Tank_dis.getText().toString()+")";
            OHW_Tank+=", PRIORITY ="+OHW_Tank_pri.getSelectedItem().toString();
        }
        if(DrainageCB.isChecked())
        {
            Drainage=DrainageCB.getText().toString();
            if(Drainage_f.isChecked())
            {
                Drainage+=Drainage_f.getText().toString()+", SCORE = "+Drainage_sf.getSelectedItem().toString();
            }
            if(Drainage_s.isChecked())
            {
                Drainage+=Drainage_s.getText().toString()+", SCORE = "+Drainage_ss.getSelectedItem().toString();
            }
            if(Drainage_t.isChecked())
            {
                Drainage+=Drainage_t.getText().toString()+", SCORE = "+Drainage_st.getSelectedItem().toString();
            }
            Drainage+=", DESCRIPTION ("+Drainage_dis.getText().toString()+")";
            Drainage+=", PRIORITY ="+Drainage_pri.getSelectedItem().toString();
        }
        if(ManholeCB.isChecked())
        {
            Manhole=ManholeCB.getText().toString();
            if(Manhole_f.isChecked())
            {
                Manhole+=Manhole_f.getText().toString()+", SCORE = "+Manhole_sf.getSelectedItem().toString();
            }
            if(Manhole_s.isChecked())
            {
                Manhole+=Manhole_s.getText().toString()+", SCORE = "+Manhole_ss.getSelectedItem().toString();
            }
            if(Manhole_t.isChecked())
            {
                Manhole+=Manhole_t.getText().toString()+", SCORE = "+Manhole_st.getSelectedItem().toString();
            }
            Manhole+=", DESCRIPTION ("+Manhole_dis.getText().toString()+")";
            Manhole+=", PRIORITY ="+Manhole_pri.getSelectedItem().toString();
        }
        try {
            String id=dbPlumbingform.push().getKey();
            PlumbingData Plumbing_Data=new PlumbingData(id,Basins,Taps,WC_Flush,Plumbing_fixtures,Septic_Tank,Soak_pit,UGW_Tank,
                    OHW_Tank,Drainage,Manhole);
            dbPlumbingform.child(id).setValue(Plumbing_Data);
            Toast.makeText(this,"Form Submit Successfully",Toast.LENGTH_SHORT).show();
        }
        catch (Exception exception){
            Toast.makeText(this, "Cannot Submited", Toast.LENGTH_SHORT).show();
        }



    }


}
