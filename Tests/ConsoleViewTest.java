package Tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import HigherLower.ConsoleView;

public class ConsoleViewTest {

	private ConsoleView sut;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldShowMenu() {
		PrintStream printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);
		sut.showMenu();
		
		verify(printStream).println(ConsoleView.MENU);
	}
	
	@Test
	public void shouldAskUserForInput() {
		PrintStream printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);
		sut.showInputInstruction();
		
		verify(printStream).println(ConsoleView.INPUTINSTRUCTION);
	}
	
	@Test
	public void shouldReturnUserInput() {
		PrintStream printStream = mock(PrintStream.class);
		sut = new ConsoleView(printStream);

	    String input = "q";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("q", sut.waitForUserInput());

	}
}
