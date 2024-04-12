package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    val userP = "AlexMG"
    val passP = "12345"

    lateinit var txtUser: EditText
    lateinit var txtPassword: EditText

    lateinit var  txtInputUser: TextInputLayout
    lateinit var txtInputPassword: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        txtUser = findViewById(R.id.txtUser)
        txtPassword = findViewById(R.id.txtPass)

        txtInputUser = findViewById(R.id.txtInputUser)
        txtInputPassword = findViewById(R.id.txtInputPassword)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun authenticate(v: View) {
        val user = txtUser.text.toString()
        val password = txtPassword.text.toString()

        if (user.isEmpty() || password.isEmpty()) {
            txtInputPassword.error = "No vacios"
            txtInputUser.error = "No vacios"

        } else if (user.equals(userP) && password.equals(passP)) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
        }
    }

    fun registryNew (v: View) {
        val intent = Intent(this, RegistryActivity2::class.java)
        startActivity(intent)
    }

}