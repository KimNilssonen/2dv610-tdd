package HigherLower;

import java.io.PrintStream;

public class ConsoleView {

	private PrintStream output;
	public final static String MENU = "Higher or Lower!\nIs the next card (h)igher or (l)ower than the current card?\nPress \"q\" to (q)uit";

	public ConsoleView(PrintStream printStream) {
		this.output = printStream;
	}

	public void showMenu() {
		output.println(MENU);
	}

}
