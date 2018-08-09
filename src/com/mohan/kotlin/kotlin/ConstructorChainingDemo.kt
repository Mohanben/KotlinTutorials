package com.mohan.kotlin

fun main(args: Array<String>) {
	var age: Int?;
	var instance = Test("Maths", 100, "JeevanRex");
	var instance1 = Test("Maths", 100);
}

class Test(subject: String, marks: Int) {

	constructor(subject: String, marks: Int, teacherName: String) : this(subject, marks) {
		println("The Exam Details are = " + subject + "= = = " + marks + "===== " + teacherName);
	}
}