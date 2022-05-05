package com.WarwickwestonWright.HelloWorld.Classes

import android.util.Log
import java.util.regex.Pattern

class GetNumbs {

    private val input = arrayOf("Warwick123", "Kumar456", "Charlie789")
    private val output = mutableListOf<String>()

    fun processInput() : MutableList<String> {
        for(i in input.indices) {

            val pattern = Pattern.compile("\\d+")
            val matcher = pattern.matcher(input[i])
            if(matcher.find()) {
                val numbers = matcher.group()
                output.add(numbers)
            }
            else {
                Log.e("MatchState", "Not Found")
            }
        }
        return mutableListOf()
    }

}