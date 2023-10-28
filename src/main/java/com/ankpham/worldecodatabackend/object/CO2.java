package com.ankpham.worldecodatabackend.object;

public class CO2 {
    private String country;
    private int year;
    private String desc;
    private String value;
    
    public CO2() {
    }

    public CO2(String country, int year, String desc, String value) {
        this.country = country;
        this.year = year;
        this.desc = desc;
        this.value = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    
}
