package HigherLower;

public class Game {

	private ConsoleView view;

	public Game(ConsoleView view) {
		this.view = view;
	}

	public static void main(String[] args) {
		Game game = new Game(new ConsoleView());
		game.run();
	}
	
	public void run() {
		view.showMenu();
	}

}
