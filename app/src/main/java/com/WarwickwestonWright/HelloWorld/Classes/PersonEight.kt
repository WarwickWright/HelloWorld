package com.WarwickwestonWright.HelloWorld.Classes
import com.WarwickwestonWright.HelloWorld.Classes.Person

open class PersonEight(name: String, age: Int) : Person(name, age) {

    val x = 0
    private var y = 0

    fun doSomethingWithY() {
        y = 10
    }

    fun personGetEight() : Int {
        return 8
    }

}