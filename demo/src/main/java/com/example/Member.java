package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Member extends Employees implements Comparable<Integer>{
    private ArrayList<Integer> workHours = new ArrayList<>();
    private ArrayList<String> intrests = new ArrayList<>();
    private boolean isLeader = false;
    private ArrayList<Team> teams = new ArrayList<>();

    public Member(String name, int ID){
        super(name, ID);
    }

    public void setLeader(){
        isLeader = true;
    }

    public void desetLeader(){
        isLeader = false;
    }
    public void addToTeam(Team t, int hours){
        teams.add(t);
        workHours.add(hours);
        t.addMember(this);
    }

    public void viewTeams(){
        System.out.println(teams);
    }

    public Machine showMachine(Team t){
        return t.getMachine();
    }

    public Project viewProject(Team t){
        return t.getProject();
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    //public void requestReservation(Machine m){
        //Scanner scanner = new Scanner(System.in);
    //}


    public ArrayList<Integer> getWorkHours() {
        return workHours;
    }
    public void addIntrest(String s){
        intrests.add(s);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    public ArrayList<String> getIntrests() {
        return intrests;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        String s = "";
        s = s + "Name: " + getName() + "\nID: " + getID();
        return s;
    }



}
