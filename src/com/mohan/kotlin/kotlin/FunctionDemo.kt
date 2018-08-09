package com.mohan.kotlin

fun main(args: Array<String>) {
	println("The multiply value is == " + mutiply(100))
	divide(100)
}

/**
 * Function with return type
 */
fun mutiply(value: Int): Int {
	return 2 * value
}

/**
 * Function with no return type
 */
fun divide(value: Int) {
	println("The divide value is == " + value / 2)
}
