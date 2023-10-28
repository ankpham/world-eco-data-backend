package com.ankpham.worldecodatabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ankpham.worldecodatabackend.object.CO2;
import com.ankpham.worldecodatabackend.object.CO2Request;
import com.ankpham.worldecodatabackend.repository.CO2Repository;
import com.ankpham.worldecodatabackend.service.CO2Service;

@RestController
public class CO2Controller {
    @Autowired
    CO2Service service;

    @Autowired
    CO2Repository repository;

    @PostMapping(value="/get/co2/desc")
    public List<CO2> getCO2byDesc(@RequestBody CO2Request co2) {
        return repository.getByDesc(co2.getDesc());
    }

    @PostMapping(value="/get/co2/desc-year")
    public List<CO2> getCO2byDescYear(@RequestBody CO2Request co2) {
        return repository.getByDescYear(co2.getDesc(), co2.getYear());
    }

    @PostMapping(value="/get/co2/desc-year-high-low")
    public CO2[] getCO2byDescYearSortHighToLow(@RequestBody CO2Request co2) {
        return service.sortHighLow(co2.getDesc(), co2.getYear());
    }
}

