package com.globant.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTester {

	@Test
	public void testValidateClassBowlingScore() {
		BowlingScore bs = new BowlingScore();
	}

	@Test
	public void testMethodCalculateScore_AllZero() {
		int[] shots = initializeScores();
		BowlingScore bs = new BowlingScore();
		int score = bs.calculateScore(shots);

		assertEquals(0, score);
	}

	@Test
	public void testMethodCalculateScore_AllOne() {
		int[] shots = initializeScores();
		for (int i = 0; i < 20; i++) {
			shots[i] = 1;
		}

		BowlingScore bs = new BowlingScore();
		int score = bs.calculateScore(shots);

		assertEquals(20, score);
	}

	@Test
	public void testMethodCalculateScore_OneSpare() {
		int[] shots = initializeScores();
		shots[0] = 5;
		shots[1] = 5;

		for (int i = 2; i < 20; i++) {
			shots[i] = 1;
		}

		BowlingScore bs = new BowlingScore();
		int score = bs.calculateScore(shots);

		assertEquals(29, score);
	}

	@Test
	public void testMethodCalculateScore_OneStrike() {
		int[] shots = initializeScores();
		shots[0] = 10;

		for (int i = 2; i < 20; i++) {
			shots[i] = 1;
		}

		BowlingScore bs = new BowlingScore();
		int score = bs.calculateScore(shots);

		assertEquals(30, score);
	}

	@Test
	public void testMethodCalculateScore_PerfectGame() {
		int[] shots = initializeScores();
		shots[0] = 10;
		shots[2] = 10;
		shots[4] = 10;
		shots[6] = 10;
		shots[8] = 10;
		shots[10] = 10;
		shots[12] = 10;
		shots[14] = 10;
		shots[16] = 10;
		shots[18] = 10;
		shots[19] = 10;
		shots[20] = 10;

		BowlingScore bs = new BowlingScore();
		int score = bs.calculateScore(shots);

		assertEquals(300, score);
	}

	private int[] initializeScores() {
		int[] shots = new int[21];

		for (int i = 0; i < 21; i++) {
			shots[i] = 0;
		}

		return shots;
	}

}
