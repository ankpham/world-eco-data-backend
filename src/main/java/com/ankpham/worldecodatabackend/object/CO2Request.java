package com.ankpham.worldecodatabackend.object;

public class CO2Request {
    private String desc;
    private int year;

    
    public CO2Request(String desc, int year) {
        this.desc = desc;
        this.year = year;
    }
    public CO2Request() {
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
