package com.mohan.kotlin

fun main(args: Array<String>) {
	val a: Int = 500;
	val b: Int = 100;

	val max = if (a < b) b else a;

	println("The maximum number of value is == " + max);
	
}