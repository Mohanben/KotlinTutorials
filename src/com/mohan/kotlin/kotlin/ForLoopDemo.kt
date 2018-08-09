package com.mohan.kotlin

fun main(args: Array<String>) {

	var numbers = listOf(10, 12, 23, 34, 65, 36);

	for (i in numbers)
		println("The numbers are == " + i);

	for ((index, value) in numbers.withIndex())
		println("The number with == " + index + " == " + value);
			
	
}