package HigherLower;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleView {

	private PrintStream output;
	public final static String MENU = "Higher or Lower!\nPress \"h\" to guess if the next card is higher or \"l\" to guess of the next card is lower\nPress \"s\" to start the game\nPress \"q\" to quit";

	public ConsoleView(PrintStream printStream) {
		this.output = printStream;
	}

	public void showMenu() {
		output.println(MENU);
	}

	public boolean userQuits() {
		return false;
	}

	public String getUserAction() {
		Scanner keyboard = new Scanner(System.in);
		return keyboard.next();
	}

}
