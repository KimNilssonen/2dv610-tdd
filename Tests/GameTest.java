package Tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import HigherLower.ConsoleView;
import HigherLower.Game;

public class GameTest {

	private Game sut;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ConsoleView view = mock(ConsoleView.class);
		sut = new Game(view);
		
		sut.run();
		
		verify(view).showMenu();
		
	}

}
