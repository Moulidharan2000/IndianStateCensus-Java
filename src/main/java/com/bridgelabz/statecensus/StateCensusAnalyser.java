package com.bridgelabz.statecensus;

import java.io.IOException;
import java.util.List;

public class StateCensusAnalyser {

	public static void main(String[] args) {
       
		CSVStateCensus csvStateCensus = new CSVStateCensus();
		try {
			List<String[]> censusData = csvStateCensus.loadCensusData("IndianStateCensus.csv");
            for (String[] row : censusData) {
            	System.out.println(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
