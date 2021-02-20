package com.concon.guess

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "secretNumber:" + secretNumber.secret)
    }

    fun check(view: View){
        val n = ed_number.text.toString().toInt()
        println("ed_number: $n")
        Log.d("MainActivity", "number:" + n)
        val diff = secretNumber.validate(n)
        var message = "Bingo!"
        if (diff < 0 ){
            message = "Bigger!"
        } else if (diff > 0){
            message = "Smaller!"
        }
        //Toast.makeText(this,message,Toast.LENGTH_LONG).show()

        AlertDialog.Builder(this)
            .setTitle("訊息")
            .setMessage(message)
            .setPositiveButton("ok",null)
            .show()
    }
}