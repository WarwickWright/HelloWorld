package com.WarwickwestonWright.HelloWorld.Classes

open class Person {

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun personGetSeven() : Int {
        return 7
    }

    var name = ""
    var age = 0
    var ageProtected = 0

}