package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	long id;
	String name;
	
	List<Player> players = new ArrayList<Player>();
	
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	public Player addPlayer(String name) {
		
		// a local player instance
		Player player = null;

		// FIXME: Use iterator to look for existing player with same name
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
		Iterator<Player> playerIterator = players.iterator();
		while (playerIterator.hasNext()) {
			
			
			/**
			 * Store the iterator in base Object for further processing
			 * so we don't tamper with underlying data
			 */
			Object element = playerIterator.next();
			
			/**
			 * Here we can cast it to a Game object so that we can
			 * access the name, and then compare it to the name
			 * that we are searching for.
			 */
			Player temp = (Player)element;
			
			/**
			 * If the name is found, then player already exists.
			 * Set it to local instance and just return it.
			 */
			if (temp.getName() == name)
				player = temp;
		}		

		// if not found, make a new player instance and add to list of games
		if (player == null) {
			player = new Player(GameService.getInstance().getNextPlayerId(), name);
			players.add(player);
		}
		
		return player;
	}
	

	@Override
	public String toString() {
		String outString = "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
		
		for (Player x : players) {
			outString += "\n\t\t" + x;
		}
		
		outString += "\n";
		
		return outString;
	}
}
