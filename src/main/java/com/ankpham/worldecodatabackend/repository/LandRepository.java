package com.ankpham.worldecodatabackend.repository;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.ankpham.worldecodatabackend.object.Land;
import com.google.gson.Gson;

public class LandRepository {
    
    public Land[] get() {
        String DataPath = "../map-demo-backend/src/main/resources/land-data.json";
		Gson gson = new Gson();

		try (
			Reader reader = new FileReader(DataPath)
			)
		{
			Land[] data = gson.fromJson(reader, Land[].class);

			return data;
        }
		catch (IOException e) {
			return new Land[0];
		}
    }

    public List<Land> getByDesc(String desc) {
		try 
		{
			Land[] data = get();

            List<Land> returnData = new ArrayList<>();

            for (Land i : data) {
                if (i.getDesc().equals(desc)) {
                    returnData.add(i);
                }
            }

			return returnData;
        }
		catch (Exception e) {
			return new ArrayList<Land>();
		}
    }

    public List<Land> getByDescYear(String desc, int year) {
		try 
		{
			Land[] data = get();

            List<Land> returnData = new ArrayList<>();

            for (Land i : data) {
                if (i.getDesc().equals(desc) && i.getYear() == year) {
                    returnData.add(i);
                }
            }

			return returnData;
        }
		catch (Exception e) {
			return new ArrayList<Land>();
		}
    }
}
