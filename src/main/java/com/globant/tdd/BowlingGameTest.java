package com.globant.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void testInitialScoreIsZero() {
		BowlingGame game = new BowlingGame();
		assertEquals(0, game.getScore());
	}

	@Test
	public void testFinalScoreIsZero() {
		BowlingGame game = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			game.roll(0); 
		}
		assertEquals(0, game.getScore());
	}

	@Test
	public void testAllShotsAreOne() {
		BowlingGame game = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			game.roll(1); 
		}
		assertEquals(20, game.getScore());
	}

	@Test
	public void testFirstFrameIsStrikeAndRestAreOne() {
		BowlingGame game = new BowlingGame();
		game.roll(10);
		for (int i = 2; i < 20; i++) {
			game.roll(1); 
		}
		assertEquals(30, game.getScore());
	}
	
//	@Test
//	public void testFramesOneAndTwoAreStrikeAndRestAreOne() {
//		BowlingGame game = new BowlingGame();
//		game.roll(10);
//		game.roll(10);
//		for (int i = 2; i < 20; i++) {
//			game.roll(1); 
//		}
//		assertEquals(30, game.getScore());
//	}

	@Test
	public void testFirstFrameIsSpareAndRestOne() {
		BowlingGame game = new BowlingGame();
		game.roll(5);
		game.roll(5);
		
		for (int i = 2; i < 20; i++) {
			game.roll(1); 
		}
		assertEquals(29, game.getScore());
	}
}
