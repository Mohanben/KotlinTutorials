package com.mohan.kotlin

class OuterClass {
	class NestedClass {
		fun foo() = "The nested class is called"
	}
}

fun main(args: Array<String>) {
	var instance = OuterClass.NestedClass().foo();
	println(instance);
}

