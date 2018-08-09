package com.mohan.kotlin

class ClassDemo {
	private var name: String = "Hello Worlds !!!";

	public var title = "Mohan ChandraSekar";

	fun callMe() {
		println("Call me method is Called");
	}

}

fun main(args: Array<String>) {
	var objectName = ClassDemo();
	objectName.callMe();
	println(objectName.title);
}