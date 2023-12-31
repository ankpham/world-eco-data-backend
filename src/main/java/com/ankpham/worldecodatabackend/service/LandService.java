package com.ankpham.worldecodatabackend.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankpham.worldecodatabackend.object.Land;
import com.ankpham.worldecodatabackend.repository.LandRepository;

@Service
public class LandService {
    
    @Autowired
    LandRepository repo;

    public Land[] sortHighLow(String desc, int year) {

        List<Land> list = repo.getByDescYear(desc, year);

        Land[] arr = new Land[list.size()];

        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        Arrays.sort(arr, new Comparator<Land>() {
            @Override
            public int compare(Land a, Land b) {
                return Integer.parseInt(b.getValue()) - Integer.parseInt(a.getValue());
        }});

        return arr;
    }
}
