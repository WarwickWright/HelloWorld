package com.WarwickwestonWright.HelloWorld.Classes

open class Person {

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun personGetSeven() : Int {
        return 7
    }

    @JvmName("getAgeProtected1")
    fun getAgeProtected(): Int {
        return ageProtected
    }

    var name = ""
    var age = 0
    protected open var ageProtected = 0

}