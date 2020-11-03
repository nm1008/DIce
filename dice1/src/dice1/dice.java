package dice1;

import java.util.Random;

public class dice {

	public static void main(String[] args) {
		Random num = new Random();
		int x = num.nextInt(6) + 1; // +1 because in programming number starts with 0.
		
		System.out.print("Rolling a dice, you got: "+ x);


	}

}
