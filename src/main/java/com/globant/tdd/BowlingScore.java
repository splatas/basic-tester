package com.globant.tdd;

public class BowlingScore {

	public int calculateScore(int[] shots) {
		int score = 0;
		int frameScore = 0;
		for (int i = 0; i < shots.length; i++) {
			int currentShot = shots[i];
			
			score += currentShot;
			frameScore += currentShot;
			if (i % 2 == 1) {
				if (frameScore == 10) {
					if (currentShot == 0) {
						
						if (shots[i + 1] == 10 && shots[i+2]==0) {
							score += shots[i + 3];
						}
						score += shots[i + 2];
					}
					score += shots[i + 1];
				}
				System.out.println("i=" +i + ", frameScore=" + frameScore + ", score="+ score);
				frameScore = 0;
			}
		}

		return score;
	}

}
