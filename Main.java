package com.company;

public class Main {

    public static void main(String[] args) {

	 FootballTeam chi = new FootballTeam("Bears");
	 FootballTeam phi = new FootballTeam("Eagles");
	 League<FootballTeam> nfl = new League<>("NFL");
	 nfl.addTeam(chi);
	 nfl.addTeam(phi);
	 nfl.showTeams();

	 HockeyTeam chiH = new HockeyTeam("Black-hawks");
	 HockeyTeam russ = new HockeyTeam("Russia");
	 HockeyTeam usa = new HockeyTeam("USA");
	 League<HockeyTeam> nhl = new League<>("NHL");
	 nhl.addTeam(chiH);
	 nhl.addTeam(russ);
	 nhl.addTeam(usa);
	 nhl.showTeams();




    }
}
