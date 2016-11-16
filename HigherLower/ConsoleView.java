package HigherLower;

import java.io.PrintStream;

public class ConsoleView {

	private PrintStream output;

	public ConsoleView(PrintStream printStream) {
		this.output = printStream;
	}

	public void showMenu() {
		output.println();
	}

}
