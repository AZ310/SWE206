package com.example;

import java.util.ArrayList;

public class Team {
    private String name;
    private Member leader;
    private ArrayList<Member> members = new ArrayList<>();

    private Project project;

    private Machine machine;

    public Team() {

    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Machine getMachine() {
        return machine;
    }

    public Member getLeader() {
        return leader;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addMember(Member m) {
        members.add(m);
    }


    @Override
    public String toString() {
        String s = "";

        s = s + "Name: " + name + "\nLeader: " + getLeader() + "\nMembers: " + members + "\nMachine: " + getMachine().getName();
        return s;
    }

    public void setLeader(Member leader) {
        this.leader = leader;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public void setName(String name) {
        this.name = name;
    }

}
