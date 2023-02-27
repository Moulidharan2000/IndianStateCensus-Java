package com.bridgelabz.statecensus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVStateCensus {
	
	private static final String CSV_DELIMITER = ",";

    public List<String[]> loadCensusData(String csvFilePath) throws IOException {
        List<String[]> censusData = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProjects\\Eclipse\\com.bridgelabz.statecensus\\IndianStateCensus.csv"))) {
            Iterator<String> iter = br.lines().iterator();
            if (iter.hasNext()) {
                iter.next(); 
            }
            while (iter.hasNext()) {
                String[] rowData = iter.next().split(CSV_DELIMITER);
                censusData.add(rowData);
            }
        }
        return censusData;
    }
}
