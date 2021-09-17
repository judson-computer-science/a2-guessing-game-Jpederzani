public class GuessGame{

	//Three instance variables; One for each player
	Player p1;
	Player p2;
	Player p3;

	//Creating 3 player objects and assigning their instance variables values
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");  //Target number players try to match


		//Loop that will continue until one player wins the game
		while(true) {
			System.out.println("Number to guess is " + targetNumber);

			p1.guess();
			p2.guess();
			p3.guess();

			//Player guess attempts
			guessp1 = p1.number;
			System.out.println("Player one guessed " +guessp1);	

			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);  

			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			//Testing player guesses to see who won
			//If a match is found, their boolean flag is flipped
			if (guessp1 == targetNumber){
				p1isRight = true;
			}

			if (guessp2 == targetNumber){
				p2isRight = true;
			}

			if (guessp3 == targetNumber){
				p3isRight = true;
			}

			//If any of the players are right this will switch
			if(p1isRight || p2isRight || p3isRight){
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " +p1isRight);
				System.out.println("Player two got it right? " +p2isRight);
				System.out.println("Player three got it right? " +p3isRight);
				System.out.println("Game is over.");
				break;  //game is over, so break the loop
			}

			//Otherwise we're going around again.
			else{
			//we must keep goin g because nobody got it right!
			System.out.println("Players will have to try again.");
			}
		}
	}
}

