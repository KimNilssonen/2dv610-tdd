package Tests;

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
	public void shouldShowMenu() {
		ConsoleView view = mock(ConsoleView.class);
		sut = new Game(view);
		
		when(view.userQuits()).thenReturn(false);
		
		sut.run();
		
		verify(view).showMenu();		
	}
	
	@Test
	public void shouldAskUserForAction() {
		ConsoleView view = mock(ConsoleView.class);
		sut = new Game(view);
		when(view.userQuits()).thenReturn(false);
		
		sut.run();
		
		verify(view).getUserAction();
		
	}

}
