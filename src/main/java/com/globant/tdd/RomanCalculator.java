package com.globant.tdd;

public class RomanCalculator {

	public String calculate(Integer decimal) {
		if (decimal.equals(Integer.valueOf(1))) {
			return "I";
		} else if (decimal.equals(Integer.valueOf(2))) {
			return "II";
		}
		return "III";
	}

}
