package com.example.tcfapplication;

public class ElectricData {
    String id,Lighting_Fixtures,Computer_outlets,Telephone_set,PTCL_line,fan,Switches_Sockets,
            Main_DB,DB_for_each_floor,UPS_for_computer_lab_1,Generator_1,Electrical_motor;

    public void setId(String id) {
        this.id = id;
    }

    public void setLighting_Fixtures(String lighting_Fixtures) {
        Lighting_Fixtures = lighting_Fixtures;
    }

    public void setComputer_outlets(String computer_outlets) {
        Computer_outlets = computer_outlets;
    }

    public void setTelephone_set(String telephone_set) {
        Telephone_set = telephone_set;
    }

    public void setPTCL_line(String PTCL_line) {
        this.PTCL_line = PTCL_line;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public void setSwitches_Sockets(String switches_Sockets) {
        Switches_Sockets = switches_Sockets;
    }

    public void setMain_DB(String main_DB) {
        Main_DB = main_DB;
    }

    public void setDB_for_each_floor(String DB_for_each_floor) {
        this.DB_for_each_floor = DB_for_each_floor;
    }

    public void setUPS_for_computer_lab_1(String UPS_for_computer_lab_1) {
        this.UPS_for_computer_lab_1 = UPS_for_computer_lab_1;
    }

    public void setGenerator_1(String generator_1) {
        Generator_1 = generator_1;
    }

    public void setElectrical_motor(String electrical_motor) {
        Electrical_motor = electrical_motor;
    }

    public String getId() {
        return id;
    }

    public String getLighting_Fixtures() {
        return Lighting_Fixtures;
    }

    public String getComputer_outlets() {
        return Computer_outlets;
    }

    public String getTelephone_set() {
        return Telephone_set;
    }

    public String getPTCL_line() {
        return PTCL_line;
    }

    public String getFan() {
        return fan;
    }

    public String getSwitches_Sockets() {
        return Switches_Sockets;
    }

    public String getMain_DB() {
        return Main_DB;
    }

    public String getDB_for_each_floor() {
        return DB_for_each_floor;
    }

    public String getUPS_for_computer_lab_1() {
        return UPS_for_computer_lab_1;
    }

    public String getGenerator_1() {
        return Generator_1;
    }

    public String getElectrical_motor() {
        return Electrical_motor;
    }

    public ElectricData(String id, String lighting_Fixtures, String computer_outlets, String telephone_set, String PTCL_line, String fan, String switches_Sockets, String main_DB, String DB_for_each_floor, String UPS_for_computer_lab_1, String generator_1, String electrical_motor) {
        this.id = id;
        Lighting_Fixtures = lighting_Fixtures;
        Computer_outlets = computer_outlets;
        Telephone_set = telephone_set;
        this.PTCL_line = PTCL_line;
        this.fan = fan;
        Switches_Sockets = switches_Sockets;
        Main_DB = main_DB;
        this.DB_for_each_floor = DB_for_each_floor;
        this.UPS_for_computer_lab_1 = UPS_for_computer_lab_1;
        Generator_1 = generator_1;
        Electrical_motor = electrical_motor;
    }
}
