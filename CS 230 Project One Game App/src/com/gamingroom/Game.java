package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	long id;
	String name;
	
	List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		super.id = id;
		super.name = name;
	}

	public Team getTeam(int index) {
		return teams.get(index);
	}
	
	public Team getTeam(String name) {
		Team team = null;
		Iterator<Team> teamIterator = teams.iterator();
		
		
		while (teamIterator.hasNext()) {
//			if (teamIterator.next().getName().equals(name))
//				team = teamIterator.next();
			
			Team temp = (Team)teamIterator.next();
			if (temp.getName().equalsIgnoreCase(name))
				team = temp;
		}
			
		return team;
	}
	
	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		// FIXME: Use iterator to look for existing team with same name
		// if found, simply assign that instance to the local variable
		/**
		 * Here we create the Iterator using iterator pattern. A
		 * container that implements the Iterator interface is able
		 * to use the iterator pattern.
		 * We create the iterator object, and use it to go through
		 * each element in the list using the .hasNext() interface method.
		 * This loops through the List until the end of the List or until we
		 * meet the conditions of the loop. 
		 */
		Iterator<Team> teamIterator = teams.iterator();
		while (teamIterator.hasNext()) {
			
			/**
			 * If the name is found, then we have a duplicate. So
			 * don't create a new object. Just set the local ref
			 * to the object we found.
			 */
			if (teamIterator.next().getName().equalsIgnoreCase(name))
				team = teamIterator.next();
			
			

		}		

		// if not found, make a new player instance and add to list of games
		if (team == null) {
			team = new Team(GameService.getInstance().getNextTeamId(), name);
			teams.add(team);
		}
		
		return team;
	}

	
	
	@Override
	public String toString() {
		
		// Print the game id and name
		String teamName = "Game [id=" + super.getId() + ", name=" + super.getName() + "]";

		// Print the teams in this game
		for (Team t : teams) {
			teamName += "\n\t" + t;
		}
		
		teamName += "\n";
		
		return teamName;
	}

}
