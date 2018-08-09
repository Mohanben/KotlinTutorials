package com.mohan.kotlin

fun main(args: Array<String>) {
	var value: Human = object : Human {
		override fun getValue() {
			println("getValue is Called");
		}
	}
	value.getValue();

	var speed = Speed();
	println("Speed is " + speed.getSpeed());
}

interface Human {
	fun getValue();
}

class Speed {
	fun getSpeed(): Int {
		return 100;
	}
}