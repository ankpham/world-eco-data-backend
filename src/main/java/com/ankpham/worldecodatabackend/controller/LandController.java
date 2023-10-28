package com.ankpham.worldecodatabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ankpham.worldecodatabackend.object.Land;
import com.ankpham.worldecodatabackend.object.LandRequest;
import com.ankpham.worldecodatabackend.repository.LandRepository;
import com.ankpham.worldecodatabackend.service.LandService;

@RestController
public class LandController {
    @Autowired
    LandService service;

    @Autowired
    LandRepository repository;

    @PostMapping(value="/get/land/desc")
    public List<Land> getPSADbyDesc(@RequestBody LandRequest land) {
        return repository.getByDesc(land.getDesc());
    }

    @PostMapping(value="/get/land/desc-year")
    public List<Land> getPSADbyDescYear(@RequestBody LandRequest land) {
        return repository.getByDescYear(land.getDesc(), land.getYear());
    }

        @PostMapping(value="/get/land/desc-year-high-low")
    public Land[] getCO2byDescYearSortHighToLow(@RequestBody LandRequest land) {
        return service.sortHighLow(land.getDesc(), land.getYear());
    }
}
