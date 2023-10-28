package com.ankpham.worldecodatabackend.repository;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ankpham.worldecodatabackend.object.CO2;
import com.google.gson.Gson;

@Repository
public class CO2Repository {
    
    public CO2[] get() {
        String DataPath = "../world-eco-data-backend/src/main/resources/data/co2-data.json";
		Gson gson = new Gson();

		try (
			Reader reader = new FileReader(DataPath)
			)
		{
			CO2[] data = gson.fromJson(reader, CO2[].class);

			return data;
        }
		catch (IOException e) {
			return new CO2[0];
		}
    }

    public List<CO2> getByDesc(String desc) {
		try 
		{
			CO2[] data = get();

            List<CO2> returnData = new ArrayList<>();

            for (CO2 i : data) {
                if (i.getDesc().equals(desc)) {
                    returnData.add(i);
                }
            }

			return returnData;
        }
		catch (Exception e) {
			return new ArrayList<CO2>();
		}
    }

    public List<CO2> getByDescYear(String desc, int year) {
		try 
		{
			CO2[] data = get();

            List<CO2> returnData = new ArrayList<>();

			for (CO2 i : data) {
                if (i.getDesc().equals(desc) && i.getYear() == year) {
                    returnData.add(i);
                }
            }

			return returnData;
        }
		catch (Exception e) {
			return new ArrayList<CO2>();
		}
    }
}
