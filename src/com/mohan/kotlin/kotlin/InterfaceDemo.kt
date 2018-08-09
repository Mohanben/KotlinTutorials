package com.mohan.kotlin.kotlin

fun main(args: Array<String>) {
    var _instance = InterfaceMain()
    _instance.getSpeed()
    _instance.getVIN()
    _instance.display()
}

interface InterfaceDemo {
    fun getSpeed(): String
    fun getVIN(): String
    fun display()
}

class InterfaceMain : InterfaceDemo {
    override fun getSpeed(): String {
        println("GetSpeed method is Called")
        return "";
    }

    override fun getVIN(): String {
        println("GetVIN method is Called")
        return "";
    }

    override fun display() {
        println("Display method is Called")
    }

}