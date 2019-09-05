package first;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("my github example project");
		//take input from keyboard
		System.out.println("Whats your name");
		Scanner Keyboard = new Scanner(System.in);
		//create a variable to store user input
		String personName = Keyboard.nextLine();
		//2 output a welcome msg
		System.out.println("Hello" + personName);
		System.out.println("Whats your number");
	}

}
