package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		/**
		 *  Here we replace null by getting the static instance
		 *  of the GameService. This is using the singleton
		 *  pattern.
		 */
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data project one...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		
		// Add teams and players to game #1
		game1.addTeam("Team #1");
		game1.getTeam("Team #1").addPlayer("Dr. Belcher");
		game1.getTeam("Team #1").addPlayer("Chris Trimmer");

		game1.addTeam("Team #2");
		
		// These two names will not be added because they are duplicate names
		game1.getTeam("Team #1").addPlayer("Dr. Belcher");
		game1.getTeam("Team #1").addPlayer("Chris Trimmer");
		
		// These two names are added
		game1.getTeam("Team #2").addPlayer("Rose Tyler");
		game1.getTeam("Team #2").addPlayer("Donna Noble");
		
		System.out.println(game1);

		// add game #2
		Game game2 = service.addGame("Game #2");
		
		// Add teams and players to game #2
		game2.addTeam("Boston");
		game2.getTeam("Boston").addPlayer("Pedro Martinez");
		game2.addTeam("Atlanta");
		game2.getTeam("Atlanta").addPlayer("Greg Maddux");
		
		// this team will not be added because it is a duplicate name
		game2.addTeam("Boston");
		
		System.out.println(game2);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		
		
	}
}
