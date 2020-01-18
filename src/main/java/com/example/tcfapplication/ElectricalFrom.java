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

public class ElectricalFrom extends AppCompatActivity {

    EditText Lighting_Fixtures_dis,Computer_outlets_dis,Telephone_set_dis,PTCL_line_dis,fan_dis,Switches_Sockets_dis,
    Main_DB_dis,DB_for_each_floor_dis,UPS_for_computer_lab_1_dis,Generator_1_dis,Electrical_motor_dis;
    CheckBox Lighting_FixturesCB,Computer_outletsCB,Telephone_setCB,PTCL_lineCB,fanCB,Switches_SocketsCB,
            Main_DBCB,DB_for_each_floorCB,UPS_for_computer_lab_1CB,Generator_1CB,Electrical_motorCB;
    CheckBox Lighting_Fixtures_f,Lighting_Fixtures_s,Lighting_Fixtures_t,
            Computer_outlets_f,Computer_outlets_s,Computer_outlets_t,
            Telephone_set_f,Telephone_set_s,Telephone_set_t,
            PTCL_line_f,PTCL_line_s,PTCL_line_t,
            fan_f,fan_s,fan_t,
            Switches_Sockets_f,Switches_Sockets_s,Switches_Sockets_t,
            Main_DB_f,Main_DB_s,Main_DB_t,
            DB_for_each_floor_f,DB_for_each_floor_s,DB_for_each_floor_t,
            UPS_for_computer_lab_1_f,UPS_for_computer_lab_1_s,UPS_for_computer_lab_1_t,
            Generator_1_f,Generator_1_s,Generator_1_t,
            Electrical_motor_f,Electrical_motor_s,Electrical_motor_t;
    Spinner Lighting_Fixtures_sf,Lighting_Fixtures_ss,Lighting_Fixtures_st,
            Computer_outlets_sf,Computer_outlets_ss,Computer_outlets_st,
            Telephone_set_sf,Telephone_set_ss,Telephone_set_st,
            PTCL_line_sf,PTCL_line_ss,PTCL_line_st,
            fan_sf,fan_ss,fan_st,
            Switches_Sockets_sf,Switches_Sockets_ss,Switches_Sockets_st,
            Main_DB_sf,Main_DB_ss,Main_DB_st,
            DB_for_each_floor_sf,DB_for_each_floor_ss,DB_for_each_floor_st,
            UPS_for_computer_lab_1_sf,UPS_for_computer_lab_1_ss,UPS_for_computer_lab_1_st,
            Generator_1_sf,Generator_1_ss,Generator_1_st,
            Electrical_motor_sf,Electrical_motor_ss,Electrical_motor_st,Lighting_Fixtures_pri,
            Computer_outlets_pri,Telephone_set_pri,PTCL_line_pri,fan_pri,Switches_Sockets_pri,
            Main_DB_pri,DB_for_each_floor_pri,UPS_for_computer_lab_1_pri,Generator_1_pri,Electrical_motor_pri;

    Button btnSubmitElectrical;
    DatabaseReference dbElectricalform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_from);

        dbElectricalform= FirebaseDatabase.getInstance().getReference("inspectionform/Electrical");

        Lighting_FixturesCB =findViewById(R.id.elecLighting);
        Computer_outletsCB=findViewById(R.id.elec_Computer_outlets);
        Telephone_setCB=findViewById(R.id.elec_Telephone_set);
        PTCL_lineCB=findViewById(R.id.elec_PTCL_line);
        fanCB=findViewById(R.id.elec_fan);
        Switches_SocketsCB=findViewById(R.id.elec_Switches_Sockets);
        Main_DBCB=findViewById(R.id.elec_Main_DB);
        DB_for_each_floorCB=findViewById(R.id.elec_DB_for_each_floor);
        UPS_for_computer_lab_1CB=findViewById(R.id.elec_UPS_for_computer_lab_1);
        Generator_1CB=findViewById(R.id.elec_Generator_1);
        Electrical_motorCB=findViewById(R.id.elec_Electrical_motor);

        btnSubmitElectrical=findViewById(R.id.elecbtn);

        Lighting_Fixtures_f=findViewById(R.id.elecLighting_f);
        Lighting_Fixtures_s=findViewById(R.id.elecLighting_s);
        Lighting_Fixtures_t=findViewById(R.id.elecLighting_t);
        Computer_outlets_f=findViewById(R.id.elec_Computer_outlets_f);
        Computer_outlets_s=findViewById(R.id.elec_Computer_outlets_s);
        Computer_outlets_t=findViewById(R.id.elec_Computer_outlets_t);
        Telephone_set_f=findViewById(R.id.elec_Telephone_set_f);
        Telephone_set_s=findViewById(R.id.elec_Telephone_set_s);
        Telephone_set_t=findViewById(R.id.elec_Telephone_set_t);
        PTCL_line_f=findViewById(R.id.elec_PTCL_line_f);
        PTCL_line_s=findViewById(R.id.elec_PTCL_line_s);
        PTCL_line_t=findViewById(R.id.elec_PTCL_line_t);
        fan_f=findViewById(R.id.elec_fan_f);
        fan_s=findViewById(R.id.elec_fan_s);
        fan_t=findViewById(R.id.elec_fan_t);
        Switches_Sockets_f=findViewById(R.id.elec_Switches_Sockets_f);
        Switches_Sockets_s=findViewById(R.id.elec_Switches_Sockets_s);
        Switches_Sockets_t=findViewById(R.id.elec_Switches_Sockets_t);
        Main_DB_f=findViewById(R.id.Main_DB_f);
        Main_DB_s=findViewById(R.id.Main_DB_s);
        Main_DB_t=findViewById(R.id.Main_DB_t);
        DB_for_each_floor_f=findViewById(R.id.DB_for_each_floor_f);
        DB_for_each_floor_s=findViewById(R.id.DB_for_each_floor_s);
        DB_for_each_floor_t=findViewById(R.id.DB_for_each_floor_t);
        UPS_for_computer_lab_1_f=findViewById(R.id.UPS_for_computer_lab_1_f);
        UPS_for_computer_lab_1_s=findViewById(R.id.UPS_for_computer_lab_1_s);
        UPS_for_computer_lab_1_t=findViewById(R.id.UPS_for_computer_lab_1_t);
        Generator_1_f=findViewById(R.id.Generator_1_f);
        Generator_1_s=findViewById(R.id.Generator_1_s);
        Generator_1_t=findViewById(R.id.Generator_1_t);
        Electrical_motor_f=findViewById(R.id.Electrical_motor_f);
        Electrical_motor_s=findViewById(R.id.Electrical_motor_s);
        Electrical_motor_t=findViewById(R.id.Electrical_motor_t);

        //assignning Lighting_Fixtures_sf spinner
        ArrayAdapter<String> adpt_Lighting_Fixtures_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Lighting_Fixtures_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Lighting_Fixtures_sf=findViewById(R.id.elecLighting_sf);
        Lighting_Fixtures_sf.setAdapter(adpt_Lighting_Fixtures_sf);

        //assignning Lighting_Fixtures_ss spinner
        ArrayAdapter<String> adpt_Lighting_Fixtures_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Lighting_Fixtures_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Lighting_Fixtures_ss=findViewById(R.id.elecLighting_ss);
        Lighting_Fixtures_ss.setAdapter(adpt_Lighting_Fixtures_ss);

        //assignning Lighting_Fixtures_st spinner
        ArrayAdapter<String> adpt_Lighting_Fixtures_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Lighting_Fixtures_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Lighting_Fixtures_st=findViewById(R.id.elecLighting_st);
        Lighting_Fixtures_st.setAdapter(adpt_Lighting_Fixtures_st);

        //assignning Lighting_Fixtures_pri spinner
        ArrayAdapter<String> adpt_Lighting_Fixtures_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Lighting_Fixtures_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Lighting_Fixtures_pri=findViewById(R.id.elecLighting_pri);
        Lighting_Fixtures_pri.setAdapter(adpt_Lighting_Fixtures_pri);

        //assignning Computer_outlets_sf spinner
        ArrayAdapter<String> adpt_Computer_outlets_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Computer_outlets_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Computer_outlets_sf=findViewById(R.id.elec_Computer_outlets_sf);
        Computer_outlets_sf.setAdapter(adpt_Computer_outlets_sf);

        //assignning Computer_outlets_ss spinner
        ArrayAdapter<String> adpt_Computer_outlets_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Computer_outlets_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Computer_outlets_ss=findViewById(R.id.elec_Computer_outlets_ss);
        Computer_outlets_ss.setAdapter(adpt_Computer_outlets_ss);

        //assignning Computer_outlets_st spinner
        ArrayAdapter<String> adpt_Computer_outlets_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Computer_outlets_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Computer_outlets_st=findViewById(R.id.elec_Computer_outlets_st);
        Computer_outlets_st.setAdapter(adpt_Computer_outlets_st);

        //assignning Computer_outlets_pri spinner
        ArrayAdapter<String> adpt_Computer_outlets_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Computer_outlets_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Computer_outlets_pri=findViewById(R.id.elec_Computer_outlets_pri);
        Computer_outlets_pri.setAdapter(adpt_Computer_outlets_pri);


        //assignning Telephone_set_sf spinner
        ArrayAdapter<String> adpt_Telephone_set_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Telephone_set_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Telephone_set_sf=findViewById(R.id.elec_Telephone_set_sf);
        Telephone_set_sf.setAdapter(adpt_Telephone_set_sf);


        //assignning Telephone_set_ss spinner
        ArrayAdapter<String> adpt_Telephone_set_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Telephone_set_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Telephone_set_ss=findViewById(R.id.elec_Telephone_set_ss);
        Telephone_set_ss.setAdapter(adpt_Telephone_set_ss);

        //assignning Telephone_set_st spinner
        ArrayAdapter<String> adpt_Telephone_set_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Telephone_set_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Telephone_set_st=findViewById(R.id.elec_Telephone_set_st);
        Telephone_set_st.setAdapter(adpt_Telephone_set_st);

        //assignning Telephone_set_pri spinner
        ArrayAdapter<String> adpt_Telephone_set_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Telephone_set_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Telephone_set_pri=findViewById(R.id.elec_Telephone_set_pri);
        Telephone_set_pri.setAdapter(adpt_Telephone_set_pri);


        //assignning PTCL_line_sf spinner
        ArrayAdapter<String> adpt_PTCL_line_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_PTCL_line_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        PTCL_line_sf=findViewById(R.id.elec_PTCL_line_sf);
        PTCL_line_sf.setAdapter(adpt_PTCL_line_sf);

        //assignning PTCL_line_ss spinner
        ArrayAdapter<String> adpt_PTCL_line_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_PTCL_line_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        PTCL_line_ss=findViewById(R.id.elec_PTCL_line_ss);
        PTCL_line_ss.setAdapter(adpt_PTCL_line_ss);

        //assignning PTCL_line_st spinner
        ArrayAdapter<String> adpt_PTCL_line_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_PTCL_line_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        PTCL_line_st=findViewById(R.id.elec_PTCL_line_st);
        PTCL_line_st.setAdapter(adpt_PTCL_line_st);

        //assignning PTCL_line_sf spinner
        ArrayAdapter<String> adpt_PTCL_line_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_PTCL_line_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        PTCL_line_pri=findViewById(R.id.elec_PTCL_line_pri);
        PTCL_line_pri.setAdapter(adpt_PTCL_line_pri);


        //assignning fan_sf spinner
        ArrayAdapter<String> adpt_fan_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_fan_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        fan_sf=findViewById(R.id.elec_fan_sf);
        fan_sf.setAdapter(adpt_fan_sf);

        //assignning fan_ss spinner
        ArrayAdapter<String> adpt_fan_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_fan_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        fan_ss=findViewById(R.id.elec_fan_ss);
        fan_ss.setAdapter(adpt_fan_ss);

        //assignning fan_st spinner
        ArrayAdapter<String> adpt_fan_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_fan_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        fan_st=findViewById(R.id.elec_fan_st);
        fan_st.setAdapter(adpt_fan_st);

        //assignning fan_pri spinner
        ArrayAdapter<String> adpt_fan_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_fan_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        fan_pri=findViewById(R.id.elec_fan_pri);
        fan_pri.setAdapter(adpt_fan_pri);


        //assignning Switches_Sockets_sf spinner
        ArrayAdapter<String> adpt_Switches_Sockets_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Switches_Sockets_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Switches_Sockets_sf=findViewById(R.id.elec_Switches_Sockets_sf);
        Switches_Sockets_sf.setAdapter(adpt_Switches_Sockets_sf);

        //assignning Switches_Sockets_ss spinner
        ArrayAdapter<String> adpt_Switches_Sockets_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Switches_Sockets_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Switches_Sockets_ss=findViewById(R.id.elec_Switches_Sockets_ss);
        Switches_Sockets_ss.setAdapter(adpt_Switches_Sockets_ss);

        //assignning Switches_Sockets_st spinner
        ArrayAdapter<String> adpt_Switches_Sockets_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Switches_Sockets_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Switches_Sockets_st=findViewById(R.id.elec_Switches_Sockets_st);
        Switches_Sockets_st.setAdapter(adpt_Switches_Sockets_st);

        //assignning Switches_Sockets_pri spinner
        ArrayAdapter<String> adpt_Switches_Sockets_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Switches_Sockets_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Switches_Sockets_pri=findViewById(R.id.elec_Switches_Sockets_pri);
        Switches_Sockets_pri.setAdapter(adpt_Switches_Sockets_pri);

        //assignning Main_DB_sf spinner
        ArrayAdapter<String> adpt_Main_DB_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Main_DB_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Main_DB_sf=findViewById(R.id.Main_DB_sf);
        Main_DB_sf.setAdapter(adpt_Main_DB_sf);

        //assignning Main_DB_ss spinner
        ArrayAdapter<String> adpt_Main_DB_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Main_DB_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Main_DB_ss=findViewById(R.id.Main_DB_ss);
        Main_DB_ss.setAdapter(adpt_Main_DB_ss);

        //assignning Main_DB_sf spinner
        ArrayAdapter<String> adpt_Main_DB_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Main_DB_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Main_DB_st=findViewById(R.id.Main_DB_st);
        Main_DB_st.setAdapter(adpt_Main_DB_st);

        //assignning Main_DB_sf spinner
        ArrayAdapter<String> adpt_Main_DB_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Main_DB_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Main_DB_pri=findViewById(R.id.Main_DB_pri);
        Main_DB_pri.setAdapter(adpt_Main_DB_pri);


        //assignning Main_DB_sf spinner
        ArrayAdapter<String> adpt_DB_for_each_floor_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_DB_for_each_floor_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        DB_for_each_floor_sf=findViewById(R.id.DB_for_each_floor_sf);
        DB_for_each_floor_sf.setAdapter(adpt_DB_for_each_floor_sf);

        //assignning Main_DB_ss spinner
        ArrayAdapter<String> adpt_DB_for_each_floor_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_DB_for_each_floor_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        DB_for_each_floor_ss=findViewById(R.id.DB_for_each_floor_ss);
        DB_for_each_floor_ss.setAdapter(adpt_DB_for_each_floor_ss);

        //assignning Main_DB_st spinner
        ArrayAdapter<String> adpt_DB_for_each_floor_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_DB_for_each_floor_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        DB_for_each_floor_st=findViewById(R.id.DB_for_each_floor_st);
        DB_for_each_floor_st.setAdapter(adpt_DB_for_each_floor_st);

        //assignning Main_DB_pri spinner
        ArrayAdapter<String> adpt_DB_for_each_floor_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_DB_for_each_floor_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        DB_for_each_floor_pri=findViewById(R.id.DB_for_each_floor_pri);
        DB_for_each_floor_pri.setAdapter(adpt_DB_for_each_floor_pri);


        //assignning UPS_for_computer_lab_1_sf spinner
        ArrayAdapter<String> adpt_UPS_for_computer_lab_1_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UPS_for_computer_lab_1_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UPS_for_computer_lab_1_sf=findViewById(R.id.UPS_for_computer_lab_1_sf);
        UPS_for_computer_lab_1_sf.setAdapter(adpt_UPS_for_computer_lab_1_sf);

        //assignning UPS_for_computer_lab_1_ss spinner
        ArrayAdapter<String> adpt_UPS_for_computer_lab_1_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UPS_for_computer_lab_1_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UPS_for_computer_lab_1_ss=findViewById(R.id.UPS_for_computer_lab_1_ss);
        UPS_for_computer_lab_1_ss.setAdapter(adpt_UPS_for_computer_lab_1_ss);

        //assignning UPS_for_computer_lab_1_st spinner
        ArrayAdapter<String> adpt_UPS_for_computer_lab_1_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_UPS_for_computer_lab_1_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UPS_for_computer_lab_1_st=findViewById(R.id.UPS_for_computer_lab_1_st);
        UPS_for_computer_lab_1_st.setAdapter(adpt_UPS_for_computer_lab_1_st);

        //assignning UPS_for_computer_lab_1_pri spinner
        ArrayAdapter<String> adpt_UPS_for_computer_lab_1_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_UPS_for_computer_lab_1_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        UPS_for_computer_lab_1_pri=findViewById(R.id.UPS_for_computer_lab_1_pri);
        UPS_for_computer_lab_1_pri.setAdapter(adpt_UPS_for_computer_lab_1_pri);


        //assignning Generator_1_sf spinner
        ArrayAdapter<String> adpt_Generator_1_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Generator_1_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Generator_1_sf=findViewById(R.id.Generator_1_sf);
        Generator_1_sf.setAdapter(adpt_Generator_1_sf);

        //assignning Generator_1_ss spinner
        ArrayAdapter<String> adpt_Generator_1_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Generator_1_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Generator_1_ss=findViewById(R.id.Generator_1_ss);
        Generator_1_ss.setAdapter(adpt_Generator_1_ss);

        //assignning Generator_1_st spinner
        ArrayAdapter<String> adpt_Generator_1_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Generator_1_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Generator_1_st=findViewById(R.id.Generator_1_st);
        Generator_1_st.setAdapter(adpt_Generator_1_st);

        //assignning Generator_1_pri spinner
        ArrayAdapter<String> adpt_Generator_1_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Generator_1_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Generator_1_pri=findViewById(R.id.Generator_1_pri);
        Generator_1_pri.setAdapter(adpt_Generator_1_pri);


        //assignning Electrical_motor_sf spinner
        ArrayAdapter<String> adpt_Electrical_motor_sf = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Electrical_motor_sf.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Electrical_motor_sf=findViewById(R.id.Electrical_motor_sf);
        Electrical_motor_sf.setAdapter(adpt_Electrical_motor_sf);

        //assignning Electrical_motor_ss spinner
        ArrayAdapter<String> adpt_Electrical_motor_ss = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Electrical_motor_ss.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Electrical_motor_ss=findViewById(R.id.Electrical_motor_ss);
        Electrical_motor_ss.setAdapter(adpt_Electrical_motor_ss);

        //assignning Electrical_motor_st spinner
        ArrayAdapter<String> adpt_Electrical_motor_st = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.score));
        adpt_Electrical_motor_st.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Electrical_motor_st=findViewById(R.id.Electrical_motor_st);
        Electrical_motor_st.setAdapter(adpt_Electrical_motor_st);

        //assignning Electrical_motor_pri spinner
        ArrayAdapter<String> adpt_Electrical_motor_pri = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.priority));
        adpt_Electrical_motor_pri.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Electrical_motor_pri=findViewById(R.id.Electrical_motor_pri);
        Electrical_motor_pri.setAdapter(adpt_Electrical_motor_pri);


       btnSubmitElectrical.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ElectricClick();
           }
       });

    }

    public void ElectricClick()
    {
        String Lighting_Fixtures,Computer_outlets,Telephone_set,PTCL_line,fan,Switches_Sockets,
                Main_DB,DB_for_each_floor,UPS_for_computer_lab_1,Generator_1,Electrical_motor;
        Lighting_Fixtures=Computer_outlets=Telephone_set=PTCL_line=fan=Switches_Sockets=
                Main_DB=DB_for_each_floor=UPS_for_computer_lab_1=Generator_1=Electrical_motor=" ";

        if(Lighting_FixturesCB.isChecked())
        {
            Lighting_Fixtures=Lighting_FixturesCB.getText().toString();
            if(Lighting_Fixtures_f.isChecked())
            {
                Lighting_Fixtures+=Lighting_Fixtures_f.getText().toString()+", SCORE = "+Lighting_Fixtures_sf.getSelectedItem().toString();
            }
            if(Lighting_Fixtures_s.isChecked())
            {
                Lighting_Fixtures+=Lighting_Fixtures_s.getText().toString()+", SCORE = "+Lighting_Fixtures_ss.getSelectedItem().toString();
            }
            if(Lighting_Fixtures_t.isChecked())
            {
                Lighting_Fixtures+=Lighting_Fixtures_t.getText().toString()+", SCORE = "+Lighting_Fixtures_st.getSelectedItem().toString();
            }
            Lighting_Fixtures+=", DISCRIPTION ("+Lighting_Fixtures_dis.getText().toString()+")";
            Lighting_Fixtures+=", PRIORITY = "+Lighting_Fixtures_pri.getSelectedItem().toString();
        }
        if(Computer_outletsCB.isChecked())
        {
            Computer_outlets=Computer_outletsCB.getText().toString();
            if(Computer_outlets_f.isChecked())
            {
                Computer_outlets+=Computer_outlets_f.getText().toString()+", SCORE = "+Computer_outlets_sf.getSelectedItem().toString();
            }
            if(Computer_outlets_s.isChecked())
            {
                Computer_outlets+=Computer_outlets_s.getText().toString()+", SCORE = "+Computer_outlets_ss.getSelectedItem().toString();
            }
            if(Computer_outlets_t.isChecked())
            {
                Computer_outlets+=Computer_outlets_t.getText().toString()+", SCORE = "+Computer_outlets_st.getSelectedItem().toString();
            }
            Computer_outlets+=", DESCRIPTION ("+Computer_outlets_dis.getText().toString()+")";
            Computer_outlets+=", PRIORITY = "+Computer_outlets_pri.getSelectedItem().toString();
        }
        if(Telephone_setCB.isChecked())
        {
            Telephone_set=Telephone_setCB.getText().toString();
            if(Telephone_set_f.isChecked())
            {
                Telephone_set+=Telephone_set_f.getText().toString()+", SCORE = "+Telephone_set_sf.getSelectedItem().toString();
            }
            if(Telephone_set_s.isChecked())
            {
                Telephone_set+=Telephone_set_s.getText().toString()+", SCORE = "+Telephone_set_ss.getSelectedItem().toString();
            }
            if(Telephone_set_t.isChecked())
            {
                Telephone_set+=Telephone_set_t.getText().toString()+", SCORE = "+Telephone_set_st.getSelectedItem().toString();
            }
            Telephone_set+=", DESCRIPTION ("+Telephone_set_dis.getText().toString()+")";
            Telephone_set+=", PRIORITY = "+Telephone_set_pri.getSelectedItem().toString();
        }
        if(PTCL_lineCB.isChecked())
        {
            PTCL_line=PTCL_lineCB.getText().toString();
            if(PTCL_line_f.isChecked())
            {
                PTCL_line+=PTCL_line_f.getText().toString()+", SCORE = "+PTCL_line_sf.getSelectedItem().toString();
            }
            if(PTCL_line_s.isChecked())
            {
                PTCL_line+=PTCL_line_s.getText().toString()+", SCORE = "+PTCL_line_ss.getSelectedItem().toString();
            }
            if(PTCL_line_t.isChecked())
            {
                PTCL_line+=PTCL_line_t.getText().toString()+", SCORE = "+PTCL_line_st.getSelectedItem().toString();
            }
            PTCL_line+=", DESCRIPTION ("+PTCL_line_dis.getText().toString()+")";
            PTCL_line+=", PRIORITY = "+PTCL_line_pri.getSelectedItem().toString();
        }
        if(fanCB.isChecked())
        {
            fan=fanCB.getText().toString();
            if(fan_f.isChecked())
            {
                fan+=fan_f.getText().toString()+", SCORE = "+fan_sf.getSelectedItem().toString();
            }
            if(fan_s.isChecked())
            {
                fan+=fan_s.getText().toString()+", SCORE = "+fan_ss.getSelectedItem().toString();
            }
            if(fan_t.isChecked())
            {
                fan+=fan_t.getText().toString()+", SCORE ="+fan_st.getSelectedItem().toString();
            }
            fan+=", DESCRIPTION ("+fan_dis.getText().toString()+")";
            fan+=", PRIORITY = "+fan_pri.getSelectedItem().toString();
        }
        if(Switches_SocketsCB.isChecked())
        {
            Switches_Sockets=Switches_SocketsCB.getText().toString();
            if(Switches_Sockets_f.isChecked())
            {
                Switches_Sockets+=Switches_Sockets_f.getText().toString()+", SCORE = "+Switches_Sockets_sf.getSelectedItem().toString();
            }
            if(Switches_Sockets_s.isChecked())
            {
                Switches_Sockets+=Switches_Sockets_s.getText().toString()+", SCORE = "+Switches_Sockets_ss.getSelectedItem().toString();
            }
            if(Switches_Sockets_t.isChecked())
            {
                Switches_Sockets+=Switches_Sockets_t.getText().toString()+", SCORE = "+Switches_Sockets_st.getSelectedItem().toString();
            }
            Switches_Sockets+=", DESCRIPTION ("+Switches_Sockets_dis.getText().toString()+")";
            Switches_Sockets+=", PRIORITY = "+Switches_Sockets_pri.getSelectedItem().toString();
        }
        if(Main_DBCB.isChecked())
        {
            Main_DB=Main_DBCB.getText().toString();
            if(Main_DB_f.isChecked())
            {
                Main_DB+=Main_DB_f.getText().toString()+", SCORE = "+Main_DB_sf.getSelectedItem().toString();
            }
            if(Main_DB_s.isChecked())
            {
                Main_DB+=Main_DB_s.getText().toString()+", SCORE = "+Main_DB_ss.getSelectedItem().toString();
            }
            if(Main_DB_t.isChecked())
            {
                Main_DB+=Main_DB_t.getText().toString()+", SCORE = "+Main_DB_st.getSelectedItem().toString();
            }
            Main_DB+=", DESCRIPTION ("+Main_DB_dis.getText().toString()+")";
            Main_DB+=", PRIORITY = "+Main_DB_pri.getSelectedItem().toString();
        }
        if(DB_for_each_floorCB.isChecked())
        {
            DB_for_each_floor=DB_for_each_floorCB.getText().toString();
            if(DB_for_each_floor_f.isChecked())
            {
                DB_for_each_floor+=DB_for_each_floor_f.getText().toString()+", SCORE = "+DB_for_each_floor_sf.getSelectedItem().toString();
            }
            if(DB_for_each_floor_s.isChecked())
            {
                DB_for_each_floor+=DB_for_each_floor_s.getText().toString()+", SCORE = "+DB_for_each_floor_ss.getSelectedItem().toString();
            }
            if(DB_for_each_floor_t.isChecked())
            {
                DB_for_each_floor+=DB_for_each_floor_t.getText().toString()+", SCORE = "+DB_for_each_floor_st.getSelectedItem().toString();
            }
            DB_for_each_floor+=", DESCRIPTION ("+DB_for_each_floor_dis.getText().toString()+")";
            DB_for_each_floor+=", PRIORITY = "+DB_for_each_floor_pri.getSelectedItem().toString();
        }
        if(UPS_for_computer_lab_1CB.isChecked())
        {
            UPS_for_computer_lab_1=UPS_for_computer_lab_1CB.getText().toString();
            if(UPS_for_computer_lab_1_f.isChecked())
            {
                UPS_for_computer_lab_1+=UPS_for_computer_lab_1_f.getText().toString()+", SCORE = "+UPS_for_computer_lab_1_sf.getSelectedItem().toString();
            }
            if(UPS_for_computer_lab_1_s.isChecked())
            {
                UPS_for_computer_lab_1+=UPS_for_computer_lab_1_s.getText().toString()+", SCORE = "+UPS_for_computer_lab_1_ss.getSelectedItem().toString();
            }
            if(UPS_for_computer_lab_1_t.isChecked())
            {
                UPS_for_computer_lab_1+=UPS_for_computer_lab_1_t.getText().toString()+", SCORE = "+UPS_for_computer_lab_1_st.getSelectedItem().toString();
            }
            UPS_for_computer_lab_1+=", DESCRIPTION ("+UPS_for_computer_lab_1_dis.getText().toString()+")";
            UPS_for_computer_lab_1+=", PRIORITY = "+UPS_for_computer_lab_1_pri.getSelectedItem().toString();
        }
        if(Generator_1CB.isChecked())
        {
            Generator_1=Generator_1CB.getText().toString();
            if(Generator_1_f.isChecked())
            {
                Generator_1+=Generator_1_f.getText().toString()+", SCORE = "+Generator_1_sf.getSelectedItem().toString();
            }
            if(Generator_1_s.isChecked())
            {
                Generator_1+=Generator_1_s.getText().toString()+", SCORE = "+Generator_1_ss.getSelectedItem().toString();
            }
            if (Generator_1_t.isChecked())
            {
                Generator_1+=Generator_1_t.getText().toString()+", SCORE = "+Generator_1_st.getSelectedItem().toString();
            }
            Generator_1+=", DESCRIPTION ("+Generator_1_dis.getText().toString()+")";
            Generator_1+=", PRIORITY = "+Generator_1_pri.getSelectedItem().toString();
        }
        if(Electrical_motorCB.isChecked())
        {
            Electrical_motor=Electrical_motorCB.getText().toString();
            if(Electrical_motor_f.isChecked())
            {
                Electrical_motor+=Electrical_motor_f.getText().toString()+", SCORE = "+Electrical_motor_sf.getSelectedItem().toString();
            }
            if(Electrical_motor_s.isChecked())
            {
                Electrical_motor+=Electrical_motor_s.getText().toString()+", SCORE = "+Electrical_motor_ss.getSelectedItem().toString();
            }
            if(Electrical_motor_t.isChecked())
            {
                Electrical_motor+=Electrical_motor_t.getText().toString()+", SCORE = "+Electrical_motor_st.getSelectedItem().toString();
            }
            Electrical_motor+=", DESCRIPTION ("+Electrical_motor_dis.getText().toString()+")";
            Electrical_motor+=", PRIORITY = "+Electrical_motor_pri.getSelectedItem().toString();
        }

        try {
            String id=dbElectricalform.push().getKey();
            ElectricData ElectricData=new ElectricData(id,Lighting_Fixtures,Computer_outlets,Telephone_set,PTCL_line,fan,Switches_Sockets,
                    Main_DB,DB_for_each_floor,UPS_for_computer_lab_1,Generator_1,Electrical_motor);
            dbElectricalform.child(id).setValue(ElectricData);
            Toast.makeText(this,"Form Submit Successfully",Toast.LENGTH_SHORT).show();
        }
        catch (Exception exception){
            Toast.makeText(this, "Cannot Submited", Toast.LENGTH_SHORT).show();
        }



    }
}
