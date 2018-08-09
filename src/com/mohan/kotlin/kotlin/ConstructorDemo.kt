package com.mohan.kotlin

class Person(var name: String) {
	init {
		println("Kotlin Static Block is Called = " + name);
	}
}

fun main(args:Array<String>){
	Person("Mohan");
}