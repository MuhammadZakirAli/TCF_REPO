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

public class Civilform extends AppCompatActivity {



   EditText cc_jali_dis,low_wall_dis,staircase_dis,parapet_wall_dis,boundry_wall_dis,drive_way_dis,walk_way_dis,roof_dis,
            column_dis,beam_dis,wall_dis,wood_trusses_dis,steel_trusses_dis;
   CheckBox cc_jali,low_wall,staircase,parapet_wall,boundry_wall,drive_way,walk_way,roof,column,beam,wall,wood_trusses,steel_trusses;
   CheckBox cc_jali_f,cc_jali_s,cc_jali_t
            ,low_wall_f,low_wall_s,low_wall_t,
            staircase_f,staircase_s,staircase_t,
            parapet_wall_f,parapet_wall_s,parapet_wall_t,
            boundry_wall_f,boundry_wall_s,boundry_wall_t,
            drive_way_f,drive_way_s,drive_way_t,
            walk_way_f,walk_way_s,walk_way_t,
            roof_f,roof_s,roof_t,
            column_f,column_s,column_t,
            beam_f,beam_s,beam_t,
            wall_f,wall_s,wall_t,
            wood_trusses_f,wood_trusses_s,wood_trusses_t,
            steel_trusses_f,steel_trusses_s,steel_trusses_t;
    Spinner cc_jali_sf,cc_jali_ss,cc_jali_st,cc_jali_pri,
            low_wall_sf,low_wall_ss,low_wall_st,low_wall_pri,
            staircase_sf,staircase_ss,staircase_st,staircase_pri,
            parapet_wall_sf,parapet_wall_ss,parapet_wall_st,parapet_wall_pri,
            boundry_wall_sf,boundry_wall_ss,boundry_wall_st,boundry_wall_pri,
            drive_way_sf,drive_way_ss,drive_way_st,drive_way_pri,
            walk_way_sf,walk_way_ss,walk_way_st,walk_way_pri,
            roof_sf,roof_ss,roof_st,roof_pri,
            column_sf,column_ss,column_st,column_pri,
            beam_sf,beam_ss,beam_st,beam_pri,
            wall_sf,wall_ss,wall_st,wall_pri,
            wood_trusses_sf,wood_trusses_ss,wood_trusses_st,wood_trusses_pri,
            steel_trusses_sf,steel_trusses_ss,steel_trusses_st,steel_trusses_pri;

    Button btnSubmitCivil;
    DatabaseReference dbCivilForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilform);

        dbCivilForm= FirebaseDatabase.getInstance().getReference("inspectionform/Civil");

        cc_jali=findViewById(R.id.c_cc_jali);
        low_wall=findViewById(R.id.cLowWall);
        staircase=findViewById(R.id.cstaircase);
        parapet_wall=findViewById(R.id.cparapetWall);
        boundry_wall=findViewById(R.id.cBoundaryWall);
        drive_way=findViewById(R.id.cDriveWay);
        walk_way=findViewById(R.id.cWalkWay);
        roof=findViewById(R.id.cRoof);
        column=findViewById(R.id.cColumn);
        beam=findViewById(R.id.cBeam);
        wall=findViewById(R.id.cWall);
        wood_trusses=findViewById(R.id.cWoodTrusses);
        steel_trusses=findViewById(R.id.p_steel_trusses);

        btnSubmitCivil= findViewById(R.id.CivilSubmit);

        cc_jali_f=findViewById(R.id.cccjali_f);
        cc_jali_s=findViewById(R.id.cccjali_s);
        cc_jali_t=findViewById(R.id.cccjali_t);
        low_wall_f=findViewById(R.id.cLowWall_f);
        low_wall_s=findViewById(R.id.cLowWall_s);
        low_wall_t=findViewById(R.id.cLowWall_t);
        staircase_f=findViewById(R.id.cstaircase_f);
        staircase_s=findViewById(R.id.cstaircase_s);
        staircase_t=findViewById(R.id.cstaircase_t);
        parapet_wall_f=findViewById(R.id.cparapetWall_f);
        parapet_wall_s=findViewById(R.id.cparapetWall_s);
        parapet_wall_t=findViewById(R.id.cparapetWall_t);
        boundry_wall_f=findViewById(R.id.cBoundaryWall_f);
        boundry_wall_s=findViewById(R.id.cBoundaryWall_s);
        boundry_wall_t=findViewById(R.id.cBoundaryWall_t);
        drive_way_f=findViewById(R.id.cDriveWay_f);
        drive_way_s=findViewById(R.id.cDriveWay_s);
        drive_way_t=findViewById(R.id.cDriveWay_t);
        walk_way_f=findViewById(R.id.cWalkWay_f);
        walk_way_s=findViewById(R.id.cWalkWay_s);
        walk_way_t=findViewById(R.id.cWalkWay_t);
        roof_f=findViewById(R.id.cRoof_f);
        roof_s=findViewById(R.id.cRoof_s);
        roof_t=findViewById(R.id.cRoof_t);
        column_f=findViewById(R.id.cColumn_f);
        column_s=findViewById(R.id.cColumn_s);
        column_t=findViewById(R.id.cColumn_t);
        beam_f=findViewById(R.id.cBeam_f);
        beam_s=findViewById(R.id.cBeam_s);
        beam_t=findViewById(R.id.cBeam_t);
        wall_f=findViewById(R.id.cWall_f);
        wall_s=findViewById(R.id.cWall_s);
        wall_t=findViewById(R.id.cWall_t);
        wood_trusses_f=findViewById(R.id.cWoodTrusses_f);
        wood_trusses_s=findViewById(R.id.cWoodTrusses_s);
        wood_trusses_t=findViewById(R.id.cWoodTrusses_t);
        steel_trusses_f=findViewById(R.id.cSteelTrusses_f);
        steel_trusses_s=findViewById(R.id.cSteelTrusses_s);
        steel_trusses_t=findViewById(R.id.cSteelTrusses_t);
        cc_jali_dis=findViewById(R.id.cccjali_dis);
        low_wall_dis=findViewById(R.id.cLowWall_dis);
        staircase_dis=findViewById(R.id.cstaircase_dis);
        parapet_wall_dis=findViewById(R.id.cparapetWall_dis);
        boundry_wall_dis=findViewById(R.id.cBoundaryWall_dis);
        drive_way_dis=findViewById(R.id.cDriveWay_dis);
        walk_way_dis=findViewById(R.id.cWalkWay_dis);
        roof_dis=findViewById(R.id.cRoof_dis);
        column_dis=findViewById(R.id.cColumn_dis);
        beam_dis=findViewById(R.id.cBeam_dis);
        wall_dis=findViewById(R.id.cWall_dis);
        wood_trusses_dis=findViewById(R.id.cWoodTrusses_dis);
        steel_trusses_dis=findViewById(R.id.cSteelTrusses_dis);

        //assignning ccjali_sf spinner
        ArrayAdapter<String> adpt_ccjali_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_ccjali_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        cc_jali_sf=findViewById(R.id.cccjali_sf);
        cc_jali_sf.setAdapter(adpt_ccjali_sf);

        //assigning ccjali_ss spinner
        ArrayAdapter<String> adpt_ccjali_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_ccjali_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        cc_jali_ss=findViewById(R.id.cccjali_ss);
        cc_jali_ss.setAdapter(adpt_ccjali_ss);

        //assigning ccjali_st spinner
        ArrayAdapter<String> adpt_ccjali_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_ccjali_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        cc_jali_st=findViewById(R.id.cccjali_st);
        cc_jali_st.setAdapter(adpt_ccjali_st);

        //assigning ccjali_pri spinner
        ArrayAdapter<String> adpt_ccjali_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_ccjali_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        cc_jali_pri=findViewById(R.id.cccjali_pri);
        cc_jali_pri.setAdapter(adpt_ccjali_pri);

        //assigning low_wall_sf spinner
        ArrayAdapter<String> adpt_low_wall_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_low_wall_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        low_wall_sf=findViewById(R.id.cLowWall_sf);
        low_wall_sf.setAdapter(adpt_low_wall_sf);

        //assigning low_wall_ss spinner
        ArrayAdapter<String> adpt_low_wall_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_low_wall_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        low_wall_ss=findViewById(R.id.cLowWall_ss);
        low_wall_ss.setAdapter(adpt_low_wall_ss);

        //assigning low_wall_st spinner
        ArrayAdapter<String> adpt_low_wall_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_low_wall_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        low_wall_st=findViewById(R.id.cLowWall_st);
        low_wall_st.setAdapter(adpt_low_wall_st);

        //assigning low_wall_pri spinner
        ArrayAdapter<String> adpt_low_wall_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_low_wall_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        low_wall_pri=findViewById(R.id.cLowWall_pri);
        low_wall_pri.setAdapter(adpt_low_wall_pri);

        //assigning staircase_sf spinner
        ArrayAdapter<String> adpt_staircase_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_staircase_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        staircase_sf=findViewById(R.id.cstaircase_sf);
        staircase_sf.setAdapter(adpt_staircase_sf);

        //assigning staircase_ss spinner
        ArrayAdapter<String> adpt_staircase_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_staircase_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        staircase_ss=findViewById(R.id.cstaircase_ss);
        staircase_ss.setAdapter(adpt_staircase_ss);

        //assigning staircase_st spinner
        ArrayAdapter<String> adpt_staircase_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_staircase_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        staircase_st=findViewById(R.id.cstaircase_st);
        staircase_st.setAdapter(adpt_staircase_st);

        //assigning staircase_pri spinner
        ArrayAdapter<String> adpt_staircase_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_staircase_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        staircase_pri=findViewById(R.id.cstaircase_pri);
        staircase_pri.setAdapter(adpt_staircase_pri);

        // assigning parapet_wall_sf spinner
        ArrayAdapter<String> adpt_parapet_wall_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_parapet_wall_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        parapet_wall_sf=findViewById(R.id.cparapetWall_sf);
        parapet_wall_sf.setAdapter(adpt_parapet_wall_sf);

        // assigning parapet_wall_ss spinner
        ArrayAdapter<String> adpt_parapet_wall_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_parapet_wall_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        parapet_wall_ss=findViewById(R.id.cparapetWall_ss);
        parapet_wall_ss.setAdapter(adpt_parapet_wall_ss);

        // assigning parapet_wall_st spinner
        ArrayAdapter<String> adpt_parapet_wall_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_parapet_wall_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        parapet_wall_st=findViewById(R.id.cparapetWall_st);
        parapet_wall_st.setAdapter(adpt_parapet_wall_st);

        // assigning parapet_wall_pri spinner
        ArrayAdapter<String> adpt_parapet_wall_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_parapet_wall_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        parapet_wall_pri=findViewById(R.id.cparapetWall_pri);
        parapet_wall_pri.setAdapter(adpt_parapet_wall_pri);

        // assigning boundry_wall_sf spinner
        ArrayAdapter<String> adpt_boundry_wall_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_boundry_wall_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        boundry_wall_sf=findViewById(R.id.cBoundaryWall_sf);
        boundry_wall_sf.setAdapter(adpt_boundry_wall_sf);

        // assigning boundry_wall_ss spinner
        ArrayAdapter<String> adpt_boundry_wall_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_boundry_wall_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        boundry_wall_ss=findViewById(R.id.cBoundaryWall_ss);
        boundry_wall_ss.setAdapter(adpt_boundry_wall_ss);

        // assigning adpt_boundry_wall_st spinner
        ArrayAdapter<String> adpt_boundry_wall_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_boundry_wall_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        boundry_wall_st=findViewById(R.id.cBoundaryWall_st);
        boundry_wall_st.setAdapter(adpt_boundry_wall_st);

        // assigning adpt_boundry_wall_pri spinner
        ArrayAdapter<String> adpt_boundry_wall_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_boundry_wall_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        boundry_wall_pri=findViewById(R.id.cBoundaryWall_pri);
        boundry_wall_pri.setAdapter(adpt_boundry_wall_pri);

        // assigning adpt_drive_way_sf spinner
        ArrayAdapter<String> adpt_drive_way_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_drive_way_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        drive_way_sf=findViewById(R.id.cDriveWay_sf);
        drive_way_sf.setAdapter(adpt_drive_way_sf);

        // assigning adpt_drive_way_ss spinner
        ArrayAdapter<String> adpt_drive_way_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_drive_way_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        drive_way_ss=findViewById(R.id.cDriveWay_ss);
        drive_way_ss.setAdapter(adpt_drive_way_ss);

        // assigning adpt_drive_way_st spinner
        ArrayAdapter<String> adpt_drive_way_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_drive_way_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        drive_way_st=findViewById(R.id.cDriveWay_st);
        drive_way_st.setAdapter(adpt_drive_way_st);

        // assigning adpt_drive_way_pri spinner
        ArrayAdapter<String> adpt_drive_way_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_drive_way_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        drive_way_pri=findViewById(R.id.cDriveWay_pri);
        drive_way_pri.setAdapter(adpt_drive_way_pri);

        // assigning adpt_walk_way_sf spinner
        ArrayAdapter<String> adpt_walk_way_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_walk_way_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        walk_way_sf=findViewById(R.id.cWalkWay_sf);
        walk_way_sf.setAdapter(adpt_walk_way_sf);

        // assigning adpt_walk_way_ss spinner
        ArrayAdapter<String> adpt_walk_way_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_walk_way_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        walk_way_ss=findViewById(R.id.cWalkWay_ss);
        walk_way_ss.setAdapter(adpt_walk_way_ss);

        // assigning adpt_walk_way_st spinner
        ArrayAdapter<String> adpt_walk_way_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_walk_way_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        walk_way_st=findViewById(R.id.cWalkWay_st);
        walk_way_st.setAdapter(adpt_walk_way_st);

        // assigning adpt_walk_way_pri spinner
        ArrayAdapter<String> adpt_walk_way_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_walk_way_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        walk_way_pri=findViewById(R.id.cWalkWay_pri);
        walk_way_pri.setAdapter(adpt_walk_way_pri);


        //assigning adpt_roof_sf spinner
        ArrayAdapter<String> adpt_roof_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_roof_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        roof_sf=findViewById(R.id.cRoof_sf);
        roof_sf.setAdapter(adpt_roof_sf);

        //assigning adpt_roof_ss spinner
        ArrayAdapter<String> adpt_roof_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_roof_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        roof_ss=findViewById(R.id.cRoof_ss);
        roof_ss.setAdapter(adpt_roof_ss);

        //assigning adpt_roof_st spinner
        ArrayAdapter<String> adpt_roof_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_roof_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        roof_st=findViewById(R.id.cRoof_st);
        roof_st.setAdapter(adpt_roof_st);

        //assigning adpt_roof_pri spinner
        ArrayAdapter<String> adpt_roof_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_roof_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        roof_pri=findViewById(R.id.cRoof_pri);
        roof_pri.setAdapter(adpt_roof_pri);


        //assigning adpt_column_sf spinner
        ArrayAdapter<String> adpt_column_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_column_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        column_sf=findViewById(R.id.cColumn_sf);
        column_sf.setAdapter(adpt_column_sf);

        //assigning adpt_column_ss spinner
        ArrayAdapter<String> adpt_column_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_column_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        column_ss=findViewById(R.id.cColumn_ss);
        column_ss.setAdapter(adpt_column_ss);

        //assigning adpt_column_st spinner
        ArrayAdapter<String> adpt_column_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_column_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        column_st=findViewById(R.id.cColumn_st);
        column_st.setAdapter(adpt_column_st);

        //assigning adpt_column_pri spinner
        ArrayAdapter<String> adpt_column_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_column_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        column_pri=findViewById(R.id.cColumn_pri);
        column_pri.setAdapter(adpt_column_pri);


        //assigning adpt_beam_sf spinner
        ArrayAdapter<String> adpt_beam_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_beam_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        beam_sf=findViewById(R.id.cBeam_sf);
        beam_sf.setAdapter(adpt_beam_sf);

        //assigning adpt_beam_ss spinner
        ArrayAdapter<String> adpt_beam_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_beam_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        beam_ss=findViewById(R.id.cBeam_ss);
        beam_ss.setAdapter(adpt_beam_ss);

        //assigning adpt_beam_st spinner
        ArrayAdapter<String> adpt_beam_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_beam_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        beam_st=findViewById(R.id.cBeam_st);
        beam_st.setAdapter(adpt_beam_st);

        //assigning adpt_beam_pri spinner
        ArrayAdapter<String> adpt_beam_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_beam_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        beam_pri=findViewById(R.id.cBeam_pri);
        beam_pri.setAdapter(adpt_beam_pri);


        //assigning adpt_wall_sf spinner
        ArrayAdapter<String> adpt_wall_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wall_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wall_sf=findViewById(R.id.cWall_sf);
        wall_sf.setAdapter(adpt_wall_sf);

        //assigning adpt_wall_ss spinner
        ArrayAdapter<String> adpt_wall_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wall_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wall_ss=findViewById(R.id.cWall_ss);
        wall_ss.setAdapter(adpt_wall_ss);

        //assigning adpt_wall_st spinner
        ArrayAdapter<String> adpt_wall_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wall_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wall_st=findViewById(R.id.cWall_st);
        wall_st.setAdapter(adpt_wall_st);

        //assigning adpt_wall_pri spinner
        ArrayAdapter<String> adpt_wall_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_wall_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wall_pri=findViewById(R.id.cWall_pri);
        wall_pri.setAdapter(adpt_wall_pri);


        //assigning adpt_wood_trusses_sf spinner
        ArrayAdapter<String> adpt_wood_trusses_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wood_trusses_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wood_trusses_sf=findViewById(R.id.cWoodTrusses_sf);
        wood_trusses_sf.setAdapter(adpt_wood_trusses_sf);

        //assigning adpt_wood_trusses_ss spinner
        ArrayAdapter<String> adpt_wood_trusses_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wood_trusses_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wood_trusses_ss=findViewById(R.id.cWoodTrusses_ss);
        wood_trusses_ss.setAdapter(adpt_wood_trusses_ss);

        //assigning adpt_wood_trusses_st spinner
        ArrayAdapter<String> adpt_wood_trusses_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_wood_trusses_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wood_trusses_st=findViewById(R.id.cWoodTrusses_st);
        wood_trusses_st.setAdapter(adpt_wood_trusses_st);

        //assigning adpt_wood_trusses_pri spinner
        ArrayAdapter<String> adpt_wood_trusses_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_wood_trusses_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wood_trusses_pri=findViewById(R.id.cWoodTrusses_pri);
        wood_trusses_pri.setAdapter(adpt_wood_trusses_pri);


        //assigning adpt_steel_trusses_sf spinner
        ArrayAdapter<String> adpt_steel_trusses_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_steel_trusses_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        steel_trusses_sf=findViewById(R.id.cSteelTrusses_sf);
        steel_trusses_sf.setAdapter(adpt_steel_trusses_sf);

        //assigning adpt_steel_trusses_ss spinner
        ArrayAdapter<String> adpt_steel_trusses_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_steel_trusses_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        steel_trusses_ss=findViewById(R.id.cSteelTrusses_ss);
        steel_trusses_ss.setAdapter(adpt_steel_trusses_ss);

        //assigning adpt_steel_trusses_st spinner
        ArrayAdapter<String> adpt_steel_trusses_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_steel_trusses_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        steel_trusses_st=findViewById(R.id.cSteelTrusses_st);
        steel_trusses_st.setAdapter(adpt_steel_trusses_st);

        //assigning adpt_steel_trusses_pri spinner
        ArrayAdapter<String> adpt_steel_trusses_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_steel_trusses_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        steel_trusses_pri=findViewById(R.id.cSteelTrusses_pri);
        steel_trusses_pri.setAdapter(adpt_steel_trusses_pri);


        btnSubmitCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Civil_checked();
            }
        });
    }


    public void Civil_checked()
    {
        String ccjali,slow_wall,sstaircase,sparapet_wall,sboundry_wall,sdrive_way,swalk_way,sroof,scolumn,sbeam,swall,swood_trusses ,ssteel_trusses;
//        String scc_jali_dis,slow_wall_dis,sstaircase_dis,sparapet_wall_dis,sboundry_wall_dis,sdrive_way_dis,swalk_way_dis,sroof_dis,
//                scolumn_dis,sbeam_dis,swall_dis,swood_trusses_dis,ssteel_trusses_dis;
//        String spcc_jali_sf,spcc_jali_ss,spcc_jali_st,spcc_jali_pri,
//                splow_wall_sf,splow_wall_ss,splow_wall_st,splow_wall_pri,
//                sp_staircase_sf,sp_staircase_ss,sp_staircase_st,sp_staircase_pri,
//                sp_parapet_wall_sf,sp_parapet_wall_ss,sp_parapet_wall_st,sp_parapet_wall_pri,
//                sp_boundry_wall_sf,sp_boundry_wall_ss,sp_boundry_wall_st,sp_boundry_wall_pri,
//                sp_drive_way_sf,sp_drive_way_ss,sp_drive_way_st,sp_drive_way_pri,
//                sp_walk_way_sf,sp_walk_way_ss,sp_walk_way_st,sp_walk_way_pri,
//                sp_roof_sf,sp_roof_ss,sp_roof_st,sp_roof_pri,
//                sp_column_sf,sp_column_ss,sp_column_st,sp_column_pri,
//                sp_beam_sf,sp_beam_ss,sp_beam_st,sp_beam_pri,
//                sp_wall_sf,sp_wall_ss,sp_wall_st,sp_wall_pri,
//                sp_wood_trusses_sf,sp_wood_trusses_ss,sp_wood_trusses_st,sp_wood_trusses_pri,
//                sp_steel_trusses_sf,sp_steel_trusses_ss,sp_steel_trusses_st,sp_steel_trusses_pri;

        ccjali=slow_wall=sstaircase=sparapet_wall=sboundry_wall=sdrive_way=swalk_way=sroof=scolumn=sbeam=swall=swood_trusses =ssteel_trusses="";


        if(cc_jali.isChecked())
        {
            ccjali=cc_jali.getText().toString();
            if(cc_jali_f.isChecked())
            {
                ccjali=ccjali+","+cc_jali_f.getText().toString()+" , ";
                ccjali+="Score ="+cc_jali_sf.getSelectedItem().toString();
            }

            if(cc_jali_s.isChecked())
            {
                ccjali=ccjali+","+cc_jali_s.getText().toString()+" , ";
                ccjali+="Score ="+cc_jali_ss.getSelectedItem().toString();
            }
            if(cc_jali_t.isChecked())
            {
                ccjali=ccjali+","+cc_jali_t.getText().toString();
                ccjali+="Score ="+cc_jali_st.getSelectedItem().toString();
            }
            ccjali+=", Discription"+cc_jali_dis.getText().toString();
            ccjali+=", Priority "+cc_jali_pri.getSelectedItem().toString();
        }
        //low wall row
        if(low_wall.isChecked())
        {
            slow_wall=low_wall.getText().toString();
            if(low_wall_f.isChecked())
            {
                slow_wall=slow_wall+" , "+low_wall_f.getText().toString();
                slow_wall+="Score = "+low_wall_sf.getSelectedItem().toString();
            }
            if(low_wall_s.isChecked())
            {
                slow_wall=low_wall+" , "+low_wall_s.getText().toString();
                slow_wall+="Score = "+low_wall_ss.getSelectedItem().toString();
            }
            if(low_wall_t.isChecked())
            {
                slow_wall=slow_wall+" , "+low_wall_t.getText().toString();
                slow_wall+="Score = "+low_wall_st.getSelectedItem().toString();
            }
            slow_wall+=" , Discription ("+low_wall_dis.getText().toString()+" )";
            slow_wall+="Priority = "+low_wall_pri.getSelectedItem().toString();

        }
        //staircase row
        if(staircase.isChecked())
        {
            sstaircase=staircase.getText().toString();
            if(staircase_f.isChecked())
            {
                sstaircase+=staircase_f.getText().toString()+" SCORE = "+staircase_sf.getSelectedItem().toString();
            }
            if(staircase_s.isChecked())
            {
                sstaircase+=staircase_s.getText().toString()+" SCORE = "+staircase_ss.getSelectedItem().toString();
            }
            if(staircase_t.isChecked())
            {
                sstaircase+=staircase_t.getText().toString()+" SCORE = "+staircase_st.getSelectedItem().toString();
            }
            sstaircase+=", DESCRIPTION ("+staircase_dis.getText().toString()+")";
            sstaircase+="PRIORITY = "+staircase_pri.getSelectedItem().toString();
        }


        if(parapet_wall.isChecked())
        {
            sparapet_wall=parapet_wall.getText().toString();
            if(parapet_wall_f.isChecked())
            {
                sparapet_wall+=parapet_wall_f.getText().toString()+" SCORE = "+staircase_sf.getSelectedItem().toString();
            }
            if(parapet_wall_s.isChecked())
            {
                sparapet_wall+=parapet_wall_s.getText().toString()+" SCORE = "+staircase_sf.getSelectedItem().toString();
            }
            if(parapet_wall_t.isChecked())
            {
                sparapet_wall+=parapet_wall_t.getText().toString()+" SCORE = "+staircase_st.getSelectedItem().toString();
            }
            sparapet_wall+=" , DESCRIPTION ("+staircase_dis.getText().toString()+")";
            sparapet_wall+=" , PRIORITY = "+staircase_pri.getSelectedItem().toString();
        }
        if(boundry_wall.isChecked())
        {
            sboundry_wall=boundry_wall.getText().toString();
            if(boundry_wall_f.isChecked())
            {
                sboundry_wall+=" "+boundry_wall_f.getText().toString()+" SCORE = "+boundry_wall_sf.getSelectedItem().toString();
            }
            if(boundry_wall_s.isChecked())
            {
                sboundry_wall+=" "+boundry_wall_s.getText().toString()+" SCORE = "+boundry_wall_ss.getSelectedItem().toString();
            }
            if(boundry_wall_t.isChecked())
            {
                sboundry_wall+=" "+boundry_wall_t.getText().toString()+" SCORE = "+boundry_wall_st.getSelectedItem().toString();
            }
            sboundry_wall+=" , DISCRIPTION ("+boundry_wall_dis.getText().toString()+")";
            sboundry_wall+=" , PRIORITY = "+boundry_wall_pri.getSelectedItem().toString();
        }
        if(drive_way.isChecked())
        {
            sdrive_way=drive_way.getText().toString();
            if(drive_way_f.isChecked())
            {
                sdrive_way+=" "+drive_way_f.getText().toString()+" SCORE = "+drive_way_sf.getSelectedItem().toString();
            }
            if(drive_way_s.isChecked())
            {
                sdrive_way+=" "+drive_way_s.getText().toString()+" SCORE ="+drive_way_ss.getSelectedItem().toString();
            }
            if(drive_way_t.isChecked())
            {
                sdrive_way+=" "+drive_way_t.getText().toString()+" SCORE ="+ drive_way_st.getSelectedItem().toString();
            }
            sdrive_way+=", DESCRIPTION ("+drive_way_dis.getText().toString()+")";
            sdrive_way+=", PRIORITY = "+drive_way_pri.getSelectedItem().toString();
        }
        if(walk_way.isChecked())
        {
            swalk_way=walk_way.getText().toString();
            if(walk_way_f.isChecked())
            {
                swalk_way+=" "+walk_way_f.getText().toString()+", SCORE = "+walk_way_sf.getSelectedItem().toString();
            }
            if(walk_way_s.isChecked())
            {
                swalk_way+=" "+walk_way_s.getText().toString()+", SCORE = "+walk_way_ss.getSelectedItem().toString();
            }
            if(walk_way_t.isChecked())
            {
                swalk_way+=" "+walk_way_t.getText().toString()+", SCORE = "+walk_way_st.getSelectedItem().toString();
            }
            swalk_way+=", DESCRIPTION ("+walk_way_dis.getText().toString()+")";
            swalk_way+=", PRIORITY = "+walk_way_pri.getSelectedItem().toString();
        }
        if(roof.isChecked())
        {
            sroof=roof.getText().toString();
            if(roof_f.isChecked())
            {
                sroof+=" "+roof_f.getText().toString()+", SCORE = "+roof_sf.getSelectedItem().toString();
            }
            if(roof_s.isChecked())
            {
                sroof+=" "+roof_s.getText().toString()+", SCORE = "+roof_ss.getSelectedItem().toString();
            }
            if(roof_t.isChecked())
            {
                sroof+=" "+roof_t.getText().toString()+", SCORE = "+roof_st.getSelectedItem().toString();
            }
            sroof+=", DESCRIPTION ("+roof_dis.getText().toString()+")";
            sroof+=", PRIORITY = "+roof_pri.getSelectedItem().toString();
        }
        if(column.isChecked())
        {
            scolumn=column.getText().toString();
            if(column_f.isChecked())
            {
                scolumn+=" "+column_f.getText().toString()+", SCORE = "+column_sf.getSelectedItem().toString();
            }
            if(column_s.isChecked())
            {
                scolumn+=" "+column_s.getText().toString()+", SCORE = "+column_ss.getSelectedItem().toString();
            }
            if(column_t.isChecked())
            {
                scolumn+=" "+column_t.getText().toString()+", SCORE = "+column_st.getSelectedItem().toString();
            }
            scolumn+=", DESCRIPTION ("+column_dis.getText().toString()+")";
            scolumn+=", PRIORITY = "+column_pri.getSelectedItem().toString();
        }
        if(beam.isChecked())
        {
            sbeam=beam.getText().toString();
            if(beam_f.isChecked())
            {
                sbeam+=" "+beam_f.getText().toString()+", SCORE = "+beam_sf.getSelectedItem().toString();
            }
            if(beam_s.isChecked())
            {
                sbeam+=" "+beam_s.getText().toString()+", SCORE = "+beam_ss.getSelectedItem().toString();
            }
            if(beam_t.isChecked())
            {
                sbeam+=" "+beam_t.getText().toString()+", SCORE = "+beam_st.getSelectedItem().toString();
            }
            sbeam+=", DESCRIPTION ("+beam_dis.getText().toString()+")";
            sbeam+=", PRIORITY = "+beam_pri.getSelectedItem().toString();
        }
        if(wall.isChecked())
        {
            swall=wall.getText().toString();
            if(wall_f.isChecked())
            {
                swall+=" "+wall_f.getText().toString()+", SCORE = "+wall_sf.getSelectedItem().toString();
            }
            if(wall_s.isChecked())
            {
                swall+=" "+wall_s.getText().toString()+", SCORE = "+wall_ss.getSelectedItem().toString();
            }
            if(wall_t.isChecked())
            {
                swall+=" "+wall_t.getText().toString()+", SCORE = "+wall_st.getSelectedItem().toString();
            }
            swall+=", DESCRIPTION ("+wall_dis.getText().toString()+")";
            swall+=", PRIORITY = "+wall_pri.getSelectedItem().toString();
        }
        if(wood_trusses.isChecked())
        {
            swood_trusses=wood_trusses.getText().toString();
            if(wood_trusses_f.isChecked())
            {
                swood_trusses+=" "+wood_trusses_f.getText().toString()+", SCORE = "+wood_trusses_sf.getSelectedItem().toString();
            }
            if(wood_trusses_s.isChecked())
            {
                swood_trusses+=" "+wood_trusses_s.getText().toString()+", SCORE = "+wood_trusses_ss.getSelectedItem().toString();
            }
            if(wood_trusses_t.isChecked())
            {
                swood_trusses+=" "+wood_trusses_t.getText().toString()+", SCORE = "+wood_trusses_st.getSelectedItem().toString();
            }
            swood_trusses+=", DESCRIPTION ("+wood_trusses_dis.getText().toString()+")";
            swood_trusses+=", PRIORITY = "+wood_trusses_pri.getSelectedItem().toString();
        }
        if(steel_trusses.isChecked())
        {
            ssteel_trusses=steel_trusses.getText().toString();
            if(steel_trusses_f.isChecked())
            {
                ssteel_trusses+=" "+steel_trusses_f.getText().toString()+", SCORE = "+steel_trusses_sf.getSelectedItem().toString();
            }
            if(steel_trusses_s.isChecked())
            {
                ssteel_trusses+=" "+steel_trusses_s.getText().toString()+", SCORE = "+steel_trusses_ss.getSelectedItem().toString();
            }
            if(steel_trusses_t.isChecked())
            {
                ssteel_trusses+=" "+steel_trusses_t.getText().toString()+", SCORE = "+steel_trusses_st.getSelectedItem().toString();
            }
            ssteel_trusses+=", DESCRIPTION ("+steel_trusses_dis.getText().toString()+")";
            ssteel_trusses+=", PRIORITY = "+steel_trusses_pri.getSelectedItem().toString();
        }
        try {
            String id=dbCivilForm.push().getKey();
            CivilFormData CivilData=new CivilFormData(id,ccjali,slow_wall,sstaircase,sparapet_wall,sboundry_wall,sdrive_way,swalk_way,sroof,scolumn,sbeam,swall,swood_trusses,ssteel_trusses);
            dbCivilForm.child(id).setValue(CivilData);
            Toast.makeText(this,"Form Submit Successfully",Toast.LENGTH_SHORT).show();
        }
        catch (Exception exception){
            Toast.makeText(this, "Cannot Submited", Toast.LENGTH_SHORT).show();
        }

    }


    }

