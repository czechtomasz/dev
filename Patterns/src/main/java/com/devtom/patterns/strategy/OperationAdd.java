package com.devtom.patterns.strategy;

/**
 * Created by czecht on 2016-03-25.
 */
public class OperationAdd implements Strategy {

	public int doOperation(int num1, int num2) {
		return num1+num2;
	}
}
