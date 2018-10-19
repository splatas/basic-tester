package com.globant.tdd;

public class BowlingGame {

	private int shootNmbr = 0;
	private int score = 0;
	private int lastShoot = 0;

	public int getScore() {
		return score;
	}

	public void roll(int quantity) {
		shootNmbr += 1;
		
		if (quantity == 10) {
			score = score + 12;
		} else {
			if (lastShoot == 10) {
//				lastShoot = 0;
				score += quantity;
			}
			score = score + quantity;
			
			lastShoot += quantity;
		}
		
		if (shootNmbr%2 == 0) {
			lastShoot=0;
		}
		
	}

}
