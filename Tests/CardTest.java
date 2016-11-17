package Tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import HigherLower.Card;
import HigherLower.Card.Rank;
import HigherLower.Card.Suite;

public class CardTest {

	private Card sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Card(Rank.Ace, Suite.Spades);
	}

	@Test
	public void getCardSuite() {
		Suite actualSuite = sut.getSuite();
		
		assertEquals(Suite.Spades, actualSuite);
		
	}

}
