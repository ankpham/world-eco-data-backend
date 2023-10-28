package com.ankpham.worldecodatabackend.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankpham.worldecodatabackend.object.CO2;
import com.ankpham.worldecodatabackend.repository.CO2Repository;

@Service
public class CO2Service {

    @Autowired
    CO2Repository repo;

    public CO2[] sortHighLow(String desc, int year) {

        List<CO2> list = repo.getByDescYear(desc, year);

        CO2[] arr = new CO2[list.size()];

        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        Arrays.sort(arr, new Comparator<CO2>() {
            @Override
            public int compare(CO2 a, CO2 b) {
                return Integer.parseInt(b.getValue()) - Integer.parseInt(a.getValue());
        }});

        return arr;
    }
}
