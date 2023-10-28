package com.ankpham.worldecodatabackend.object;

public class LandRequest {
    private String desc;
    private int year;

    
    public LandRequest(String desc, int year) {
        this.desc = desc;
        this.year = year;
    }
    public LandRequest() {
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}
