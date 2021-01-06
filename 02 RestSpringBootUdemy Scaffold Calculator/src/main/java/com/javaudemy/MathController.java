package com.javaudemy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaudemy.utils.MathUtils;

@RestController
public class MathController {
	
	MathUtils mathUtils = new MathUtils();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		mathUtils.validateUnsupportableNumbers(numberOne, numberTwo);
		return mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		mathUtils.validateUnsupportableNumbers(numberOne, numberTwo);
		return mathUtils.convertToDouble(numberOne) - mathUtils.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		mathUtils.validateUnsupportableNumbers(numberOne, numberTwo);
		return mathUtils.convertToDouble(numberOne) * mathUtils.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		mathUtils.validateUnsupportableNumbers(numberOne, numberTwo);
		return mathUtils.convertToDouble(numberOne) / mathUtils.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		mathUtils.validateUnsupportableNumbers(numberOne, numberTwo);
		return (mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo)) / 2;
	}
	
	@RequestMapping(value="/square/{number}", method = RequestMethod.GET)
	public Double square(@PathVariable("number") String number) throws Exception {
		mathUtils.validateUnsupportableNumbers(number, "");
		return Math.sqrt(mathUtils.convertToDouble(number));
	}
	
}
