package com.company;

import java.util.ArrayList;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> listOfteams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addTeam(T squad) {
        if(listOfteams.contains(squad)) {
            System.out.println("This team is already added to League.");
            return false;
        } else {
            listOfteams.add(squad);
            return true;
        }
    }



//    public void showTeams() {
//        for (int i=0; i<listOfteams.size(); i++) {
//            System.out.println(listOfteams.get(i).getName());
//        }
//    }


    public void showTeams() {
        for(T t : listOfteams) {
            System.out.println(t.getName());
        }
    }
}





