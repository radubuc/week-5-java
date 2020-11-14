package com.reneedubuc.weekfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Player p1 = new Player("Thomas", "Fullback", "Running fast");
//		Player p2 = new Player("Sally", "Quarterback", "Throwing far");
//		
//		Team team = new Team("Really Good Football Team!!!");
//		team.addPlayer(p1);
//		team.addPlayer(p2);
//		team.describe();
//		
//		System.out.println("\n");
//		
//		team.removePlayer("Thomas");
//		team.describe();
		
//		Menu Driven
		System.out.println("Welcome to the Gay-tabase!");
		int decision = 0;
		
		while(true) {
			printOptions();
			decision = scanner.nextInt();
			if(decision == 1) {
				teams.add(createNewTeam());
			} else if(decision == 2) {
				addPlayerToTeam();
			} else if(decision == 3) {
				removePlayerFromTeam();
			} else if(decision == 4) {
				describeTeam();
			} else {
				System.out.println("Please pick a valid option.");
			}
		}
		
	}

	private static void printOptions() {
		System.out.println("1) Create new team");
		System.out.println("2) Add new player to team");
		System.out.println("3) Remove player from team");
		System.out.println("4) View team info");	
	}
	
	private static void describeTeam() {
		printTeamNames();
		System.out.print("Which team do you wish to see the info for? ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

	private static Team createNewTeam() {
		System.out.print("Enter name of the team you wish to create: ");
		String name = scanner.next();
		return new Team(name);		
	}
	
	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.print("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static void removePlayerFromTeam() {
		printTeamNames();
		System.out.print("Enter the name of the team you wish to remove a player from: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.println("Which player do you wish to remove? ");
			String playerName = scanner.next();
			foundTeam.removePlayer(playerName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static Player createNewPlayer() {
		System.out.print("Enter player name: ");
		String name = scanner.next();
		System.out.print("Enter player position: ");
		String position = scanner.next();
		System.out.print("Enter player specialty: ");
		String specialty = scanner.next();
		return new Player(name, position, specialty);
	}
	
	private static void printTeamNames() {
		for(Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for(Team team : teams) {
			if(team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team not found: " + name);
	}
}


