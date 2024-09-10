package com.example.assignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //List of historical figures

    private val historicalFigures = listOf(
        "Bob Marley" to 36,
        "Amy Winehouse" to 27,
        "Shaka Zulu" to 41,
        "Alexander the Great" to 32,
        "Farrah Fawcett" to 65,
        "Mariam Makeba" to 76,
        "Linda 'prokid' Mkhize" to 37,
        "Mozart" to 35,
        "steve Biko" to 30,
        "Steve Jobs" to 56
    )

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference UI elements by their IDs
        val editText = findViewById<EditText>(R.id.editText) //edit text to enter the age you want to compare
        val compareButton = findViewById<Button>(R.id.button) //button to submit your age entry
        val resultTextView = findViewById<TextView>(R.id.textView) //view where the results will appear
        val clearButton = findViewById<Button>(R.id.clearButton)//button to clear the textview

            //Set click listener for the Compare Button
        compareButton.setOnClickListener {
            val ageInput = editText.text.toString() //string input
            val userAge = ageInput.toIntOrNull()// get integer

            //Check if the input is valid
            if (ageInput.isBlank()) {
                resultTextView.text = "Please enter your age"//
                return@setOnClickListener
            }

            if (userAge == null) {
                resultTextView.text = "Invalid input. Please enter a valid whole number."
            } else if (userAge < 20) {
                resultTextView.text =
                    "The age you entered is too young. Please enter an age between 20 and 100."//show this message if age is below 20years
            } else if (userAge > 100) {
                resultTextView.text =
                    "The age you entered is too high. Please enter an age between 20 and 100."// show this message if age is over 100years
            } else {
                //error show a valid integer
                if (userAge != null && userAge > 0) {
                    // Filter the historical figures who died exactly at the user's age
                    val matchingFigures = historicalFigures.filter { it.second == userAge }

                    // Display the result,else show a no match message
                    val resultText = if (matchingFigures.isNotEmpty()) {
                        "Historical figures who passed away at your age:\n\n" +
                                matchingFigures.joinToString(separator = "\n") { "${it.first} (Age ${it.second})" }
                    } else {
                        "No historical figures passed away at your age."
                    }
                    resultTextView.text = resultText
                } else resultTextView.text = "Please enter a valid positive number for your age."

            }

            // Handle "Clear" button click
            clearButton.setOnClickListener {
                // Clear the input field and result text view
                editText.text.clear() // Clear the age input field
                resultTextView.text = "" // Clear the result text view
            }

        }
    }
}
