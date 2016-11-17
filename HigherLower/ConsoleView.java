package HigherLower;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleView {

	private PrintStream output;
	public final static String MENU = "Higher or Lower!\nPress \"q\" to quit\n";
	public final static String INPUTINSTRUCTION = "Is the next card (h)igher or (l)ower than the current card?";

	public ConsoleView(PrintStream printStream) {
		this.output = printStream;
	}

	public void showMenu() {
		output.println(MENU);
	}

	public boolean userQuits() {
		return false;
	}

	public String showInputInstructionAndGetUserAction() {
		output.println(INPUTINSTRUCTION);
		Scanner keyboard = new Scanner(System.in);
		return keyboard.next();
	}

}
