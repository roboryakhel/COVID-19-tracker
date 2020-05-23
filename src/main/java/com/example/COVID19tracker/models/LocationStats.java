package com.example.COVID19tracker.models;

import java.util.ArrayList;

public class LocationStats {

    private String State;
    private String Country;
    private int latestTotalCases;
    private int prevDayDiff;
    private ArrayList<Integer> points;

    public LocationStats() {
        points = new ArrayList<Integer>();
    }
    public String getState() {
        return State;
    }
    public String getCountry() {
        return Country;
    }
    public int getLatestTotalCases() { return latestTotalCases; }
    public void printPoints() {
        for (int i : points)
            System.out.print( " " + i);
    }

    public void addPoint(int p) { points.add(p); }
    public void setState(String state) {
        State = state;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public int getPrevDayDiff() {
        return prevDayDiff;
    }
    public void setPrevDayDiff(int prevDayDiff) {
        this.prevDayDiff = prevDayDiff;
    }
    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }



}
