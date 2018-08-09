package com.mohan.kotlin

fun main(args: Array<String>) {
	var instance = B();
	instance.display() 
}

open class A{
	open fun display(){
		println("Parent method is Called");
	}
}

class B :A(){
	override fun display(){
		println("Child method is Called");
	}
}


