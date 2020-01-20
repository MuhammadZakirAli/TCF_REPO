package com.example.tcfapplication;

public class PlumbingData {

    String id,Basins,Taps,WC_Flush,Plumbing_fixtures,Septic_Tank,Soak_pit,UGW_Tank,
            OHW_Tank,Drainage,Manhole;

    public void setId(String id) {
        this.id = id;
    }

    public void setBasins(String basins) {
        Basins = basins;
    }

    public void setTaps(String taps) {
        Taps = taps;
    }

    public void setWC_Flush(String WC_Flush) {
        this.WC_Flush = WC_Flush;
    }

    public void setPlumbing_fixtures(String plumbing_fixtures) {
        Plumbing_fixtures = plumbing_fixtures;
    }

    public void setSeptic_Tank(String septic_Tank) {
        Septic_Tank = septic_Tank;
    }

    public void setSoak_pit(String soak_pit) {
        Soak_pit = soak_pit;
    }

    public void setUGW_Tank(String UGW_Tank) {
        this.UGW_Tank = UGW_Tank;
    }

    public void setOHW_Tank(String OHW_Tank) {
        this.OHW_Tank = OHW_Tank;
    }

    public void setDrainage(String drainage) {
        Drainage = drainage;
    }

    public void setManhole(String manhole) {
        Manhole = manhole;
    }

    public String getId() {
        return id;
    }

    public String getBasins() {
        return Basins;
    }

    public String getTaps() {
        return Taps;
    }

    public String getWC_Flush() {
        return WC_Flush;
    }

    public String getPlumbing_fixtures() {
        return Plumbing_fixtures;
    }

    public String getSeptic_Tank() {
        return Septic_Tank;
    }

    public String getSoak_pit() {
        return Soak_pit;
    }

    public String getUGW_Tank() {
        return UGW_Tank;
    }

    public String getOHW_Tank() {
        return OHW_Tank;
    }

    public String getDrainage() {
        return Drainage;
    }

    public String getManhole() {
        return Manhole;
    }

    public PlumbingData(String id, String basins, String taps, String WC_Flush, String plumbing_fixtures, String septic_Tank, String soak_pit, String UGW_Tank, String OHW_Tank, String drainage, String manhole) {
        this.id = id;
        Basins = basins;
        Taps = taps;
        this.WC_Flush = WC_Flush;
        Plumbing_fixtures = plumbing_fixtures;
        Septic_Tank = septic_Tank;
        Soak_pit = soak_pit;
        this.UGW_Tank = UGW_Tank;
        this.OHW_Tank = OHW_Tank;
        Drainage = drainage;
        Manhole = manhole;
    }
}
