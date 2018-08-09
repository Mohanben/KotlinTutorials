package com.mohan.kotlin.kotlin

fun main(args: Array<String>) {
    var _instance = Book("Mohan", 100)

    println("The Book name is " + _instance.name)
    println("The price is " + _instance.price)
}

data class Book(var name: String, var price: Int)