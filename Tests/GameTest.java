package Tests;

import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import HigherLower.ConsoleView;
import HigherLower.Game;

public class GameTest {

	private Game sut;
	private ConsoleView view;
	
	@Before
	public void setUp() throws Exception {
		view = mock(ConsoleView.class);
		sut = new Game(view);
	}

	@Test
	public void shouldShowMenu() {		
		when(view.userQuits()).thenReturn(false);
		sut.run();
		
		verify(view).showMenu();		
	}
	
	@Test
	public void shouldAskUserForAction() {
		when(view.userQuits()).thenReturn(false);
		sut.run();
		
		verify(view).showInputInstruction();
		
	}

}
