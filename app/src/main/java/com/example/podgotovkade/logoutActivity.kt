package com.example.podgotovkade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class logoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)
    }
    fun next(view: View){
        val intent= Intent(this, FoodActivity::class.java)
        startActivity(intent)
    }
}