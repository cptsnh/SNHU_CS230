package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

// import Iterator module so we can implement Iterator pattern
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * Singleton discussion:
 * The singleton design pattern is catergorized as a Creational Design
 * Pattern. As defined in our text, Hands-On Design Patters with Java 
 * by Lavieri (2019), "Creational design patterns
 * are used to manage the objects as they are instantiated (created)."
 * One of the goals in this process is to separate the concern of
 * object creation from the actual system. 
 * The purpose of the singleton pattern is to ensure that "there is 
 * only one instance of the class" (Lavieri, 2019). This is carried
 *  out by only allowing static access for creating the object of the
 *  class. The object is created within the class itself, and then
 *  accessed by the caller via a static method. I have specific
 *  comments in the code where this pattern is implemented.
 * 
 * Iterator discussion:
 * The iterator pattern is categorized as a behavioral design pattern.
 * Behavioral design patterns are "focused on the interaction of objects 
 * and classes in a system" (Lavieri, 2019). The goal of the iterator
 * pattern is to "grant access to an object's members without sharing
 * the encapsulated data structures" (Lavieri, 2019). We implement 
 * this using the java.util.Iterator package. Basically, an iterator
 * is a way to access objects in a collection without intruding on
 * the object itself or caring about the structure of the underlying
 * container. Key aspects of this pattern is that the iterator
 * need not be concerned with the data of the object, and the 
 * iterator is container agnostic because it is implemented as an
 * interface (we can traverse a List, ArrayList, and any other collection 
 * that implements the interface). I have specific comments in the code
 * where this pattern is implemented.
 * 
 * @author coce@snhu.edu, and additional comments by Chris Trimmer (7/12/2022)
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;

	/**
	 * The is the where the actual GameService object is created
	 * It is stored as a static object that is being
	 * being returned to the caller. It is a private
	 * member so the caller cannot access it
	 * directly.
	 */
	private static GameService serviceInstance = new GameService();

	/**
	 * This is the GameService constructor. We make it private
	 * so that it cannot be instantiated directly.
	 */
	private GameService() {}

	/**
	 * Here we provide a public static method
	 * that the caller uses to obtain the object instance. 
	 * It is static which means the called does not call it as
	 * an object member, rather as static class object.
	 * It returns the singleton object instance.
	 * @return the instance of GameService
	 */
	public static GameService getInstance() {
		return serviceInstance;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		/**
		 * Here we create the Iterator using iterator pattern. A
		 * container that implements the Iterator interface is able
		 * to use the iterator pattern.
		 * We create the iterator object, and use it to go through
		 * each element in the list using the .hasNext() interface method.
		 * This loops through the List until the end of the List or until we
		 * meet the conditions of the loop. 
		 */
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
			
			if (gameIterator.next().getName().equalsIgnoreCase(name))
				game = gameIterator.next();
			
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
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
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {

			if (gameIterator.next().getId() == id)
				game = gameIterator.next();
			
		}
		
		
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
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
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
			
			// Store the iterator in base Object for further processing
			Object element = gameIterator.next();
			
			/**
			 * Here we can cast it to a Game object so that we can
			 * access the name, and then compare it to the name
			 * that we are searching for.
			 */
			Game temp = (Game)element;
			
			/**
			 * If the name is found, then store the object in the
			 * local game instance. This object will be returned
			 * to the caller.
			 */
			if (temp.getName() == name)
				game = temp;
		}
		
		
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
	
	public long getNextTeamId() {
		return nextTeamId++;
	}
	
	
	
	
}
