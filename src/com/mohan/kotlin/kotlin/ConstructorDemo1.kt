package com.mohan.kotlin

class Ancestor(age: Int, type: String, year: String) {

	var age: Int;
	var type: String;
	var year: String;

	init {
		this.age = age;
		this.type = type;
		this.year = year;
		println("The Ancestor details are = age = $age Type = $type Years = $year");
	}

	fun display() {
		println("Sample method is Called");
	}
}

fun main(args: Array<String>) {
	var instance = Ancestor(100, "Homosepians", "13BC");
	instance.display();
}