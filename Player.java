
//This class creates a Player object
public class Player{
	int number = 0;	//Player guess stores here

	public void guess() {
		number = (int) (Math.random() * 10);	//Player's guess is developed here
		System.out.println("I'm guessing " +number);  //Given when called here
	}
}