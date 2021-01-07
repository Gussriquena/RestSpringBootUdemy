package com.javaudemy.utils;

import com.javaudemy.exception.ResourceNotFoundException;

public class MathUtils {

	
	public void validateUnsupportableNumbers(String numberOne, String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new ResourceNotFoundException("Please, enter a valid number!");
		}
	}
	
	public Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[+-]?[0-9]*\\.?[0-9]+");
	}
}
