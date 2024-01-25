package com.example;

import java.util.ArrayList;

public class Machine {
    private int usageHours;
    private String name;
    private ArrayList<String> suggestedUsage;

    public Machine(){

    }
    public Machine(String name){
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void addUsageHours(int usageHours) {
        this.usageHours = +usageHours;
    }
    public void removeUsageHours(int usageHours) {
        this.usageHours = -usageHours;
    }

    public int getUsageHours() {
        return usageHours;
    }

    public ArrayList<String> getSuggestedUsage() {
        return suggestedUsage;
    }

  
    public void setSuggestedUsage(ArrayList<String> suggestedUsage) {
        this.suggestedUsage = suggestedUsage;
    }

    public void setUsageHours(int usageHours) {
        this.usageHours = usageHours;
    }


    public void setName(String name) {
        this.name = name;
    }
}
