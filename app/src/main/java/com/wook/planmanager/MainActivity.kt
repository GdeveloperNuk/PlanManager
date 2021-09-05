package com.wook.planmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wook.planmanager.history.SaveFileFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun moveFragment(view: View){
        val intent = Intent(this, SaveFileFragment::class.java)
        startActivity(intent)
    }
}