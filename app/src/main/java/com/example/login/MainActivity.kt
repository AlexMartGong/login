package com.example.login

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val user = "AlexMG"
    val pass = "12345"

    lateinit var txtUser: EditText
    lateinit var txtPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtUser = findViewById(R.id.txtUser)
        txtPassword = findViewById(R.id.txtPass)
    }

    fun clickItem(v: View) {

        if (user == txtUser.text.toString() && pass == txtPassword.text.toString()) {
            Toast.makeText(this, "Login", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Error ${txtUser.text.toString()} y ${txtPassword.text.toString()}", Toast.LENGTH_LONG).show()
        }
    }
}