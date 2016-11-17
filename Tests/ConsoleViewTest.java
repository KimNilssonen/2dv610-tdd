package Tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import HigherLower.ConsoleView;

public class ConsoleViewTest {

	private ConsoleView sut;
	private PrintStream printStream;

	@Before
	public void setUp() throws Exception {
		printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);
	}

	@Test
	public void shouldShowMenu() {
		sut.showMenu();
		
		verify(printStream).println(ConsoleView.MENU);
	}
	
	@Test
	public void shouldAskUserForInput() {
		sut.showInputInstruction();
		
		verify(printStream).println(ConsoleView.INPUTINSTRUCTION);
	}
	
	@Test
	public void shouldGetUserInput() {
	    String input = "q";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("q", sut.waitForUserInput());
	}
}
