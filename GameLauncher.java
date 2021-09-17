//This class will be our game launcher;
//It has our program entry point main(String args[]) and it creates a new game object
public class GameLauncher{
	public static void main(String args[]){
		GuessGame game = new GuessGame();	//Create a new game object
		game.startGame();	//run this method in class GuessGame.java 
	}
}