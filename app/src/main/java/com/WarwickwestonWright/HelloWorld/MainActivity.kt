package com.WarwickWestonWright.HelloWorld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.WarwickWestonWright.HelloWorld.Classes.GetNumbs
import com.WarwickWestonWright.HelloWorld.Classes.Person
import com.WarwickWestonWright.HelloWorld.Classes.PersonEight

class MainActivity : AppCompatActivity() {

    private lateinit var lblMyText : TextView
    private lateinit var btnAddValue : Button
    private lateinit var btnShowList : Button
    private lateinit var txtName : EditText
    private lateinit var txtAge : EditText
    private lateinit var person : Person
    private var people : MutableList<Person> = mutableListOf()
    private var getNums = GetNumbs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNums.processInput()
        lblMyText = findViewById<TextView>(R.id.lblMyText)
        btnAddValue = findViewById<Button>(R.id.btnAddValue)
        btnShowList = findViewById<Button>(R.id.btnShowList)
        txtName = findViewById<EditText>(R.id.txtName)
        txtAge = findViewById<EditText>(R.id.txtAge)

        var person = Person("Warwick", 53)
        var personEight = PersonEight("Warwick", 53)
        person.getAgeProtected() // Returns 0
        personEight.getAgeProtected() // Returns 8

        btnAddValue.setOnClickListener { button ->
            try {
                val name = txtName.text.toString()
                val age = txtAge.text.toString().toInt()
                person = Person(name, age)
                lblMyText.text = "My Name is " + name + "\n" + " And I am " + person.age.toString()
                people.add(people.size, Person(name, age))
            }
            catch (e: NumberFormatException) {
                Log.e("MyError", e.message.toString())
                Log.i("MyInfo", e.message.toString())
                Log.v("MyVerbose", e.message.toString())
            }
        }

        btnShowList.setOnClickListener { button ->
            var peopleList = ""
            for(person in people) {
                peopleList += person.name + " : " + person.age + "\n"
            }
            Toast.makeText(this, peopleList.trim(), Toast.LENGTH_LONG).show()
        }

    }

}