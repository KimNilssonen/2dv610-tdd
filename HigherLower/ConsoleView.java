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

	public void showInputInstruction() {
		output.println(INPUTINSTRUCTION);
	}

	public String waitForUserInput() {
		Scanner keyboard = new Scanner(System.in);
		String string = keyboard.next();
		keyboard.close();
		return string;
	}

}
