package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        System.out.println(randomTeams());
    }

    public static ArrayList<Team> randomTeams(){
        Random random = new Random();
        int num = random.nextInt(1, 10);
        int num2 = random.nextInt(10, 20);
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Project> projects = new ArrayList<>();
        ArrayList<Machine> machines = new ArrayList<>();


        for (int i = 0; i < num2; i ++){
            Member member = new Member("Name" + i, random.nextInt(10000, 20000));
            members.add(member);
        }

        for (int i = 0; i < num; i ++){
            Team team = new Team("Team" + i);
            teams.add(team);

            Project project = new Project("Project" + i);
            projects.add(project);

            Machine machine = new Machine("Machine" + i);
            machines.add(machine);
        }

        Collections.shuffle(members);
        Collections.shuffle(teams);
        Collections.shuffle(machines);
        Collections.shuffle(projects);

        for (int i = 0; i < num; i ++) {
            teams.get(i).setMachine(machines.get(i));
            teams.get(i).setProject(projects.get(i));
        }

        for (int i = 0; i < num2; i ++){
            members.get(i).addToTeam(teams.get(random.nextInt( num)), random.nextInt( 5));
        }

        for (int i = 0; i < num; i ++) {
            if (!teams.get(i).getMembers().isEmpty()) {
                teams.get(i).setLeader(members.get(random.nextInt( teams.get(i).getMembers().size())));
            }
        }

            return teams;
    }
}
