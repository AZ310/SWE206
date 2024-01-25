package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    private String name;
    private String email;
    private int ID;
    public Employees(){
    }

    public Employees(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public Employees(String name, int ID, String email){
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    public Project addProject(Team team) throws Exception{
        Project project = new Project();
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Enter name");
        project.setName(name);


        return project;

    }

    public void assignTeam(Team t, Project p){
        t.setProject(p);
    }

    public void addMember(Team t, Member m){
        t.addMember(m);
    }
    public void addMachines(ArrayList<Machine> machines){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the machine/s, enter Exit when you are finished");
        while (true){
            String name = scanner.next();
            Machine machine = new Machine(name);
            machines.add(machine);

            if (name.equals("Exit")){
                break;
            }
        }

    }

    public String viewTeamDetails(Team t){
        return t.toString();
    }

    public Member viewMostActiveMember(Team t){
        ArrayList<Member> members = t.getMembers();
        Member mostActive = members.get(0);

        for (int i = 1; i < members.size(); i++){
            if (mostActive.getWorkHours().get(0) < members.get(i).getWorkHours().get(0)){
                mostActive = members.get(i);
            }
        }
        return mostActive;
    }

    public Machine mostUsedMachine(ArrayList<Machine> machines){
        Machine mostActive = machines.get(0);

        for (int i = 1; i < machines.size(); i++){
            if (mostActive.getUsageHours() < machines.get(i).getUsageHours()){
                mostActive = machines.get(i);
            }
        }
        return mostActive;
    }


    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getID() {
        return ID;
    }

}
