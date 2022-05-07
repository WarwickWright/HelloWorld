package com.WarwickWestonWright.HelloWorld.Classes

open class PersonEight(name: String, age: Int) : Person(name, age) {

    val x = 0
    private var y = 0
    override var ageProtected: Int = 8
        //get() = super.ageProtected
        //set(value) {}

    fun doSomethingWithY() {
        y = 10
    }

    fun personGetEight() : Int {
        return 8
    }

}