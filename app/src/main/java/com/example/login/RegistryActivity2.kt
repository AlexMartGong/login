package com.example.login

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class RegistryActivity2 : AppCompatActivity() {

    private lateinit var txtUser: EditText
    private lateinit var txtPassword: EditText
    private lateinit var txtPassword2: EditText
    private lateinit var txtCarrera: EditText
    private lateinit var txtPhone: EditText
    private lateinit var txtName: EditText

    private lateinit var txtInputUser: TextInputLayout
    private lateinit var txtInputPassword: TextInputLayout
    private lateinit var txtInputPassword2: TextInputLayout
    private lateinit var txtInputName: TextInputLayout
    private lateinit var txtInputCarrera: TextInputLayout
    private lateinit var txtInputPhoneNumber: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registry2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtInputUser = findViewById(R.id.txtInputUser)
        txtInputPassword = findViewById(R.id.txtInputPass)
        txtInputPassword2 = findViewById(R.id.txtInputPass2)
        txtInputName = findViewById(R.id.txtInputName)
        txtInputPhoneNumber = findViewById(R.id.txtInputPhone)
        txtInputCarrera = findViewById(R.id.txtInputCarrera)

        txtUser = findViewById(R.id.edUser)
        txtPassword = findViewById(R.id.edPassword)
        txtPassword2 = findViewById(R.id.edPassword2)
        txtCarrera = findViewById(R.id.edCarrera)
        txtPhone = findViewById(R.id.edPhoneNumber)
        txtName = findViewById(R.id.edName)
    }

    fun save(v: View) {
        val pass1 = txtPassword.text.toString()
        val pass2 = txtPassword2.text.toString()

        val fields = listOf(
            txtPhone to txtInputPhoneNumber,
            txtPassword to txtInputPassword,
            txtCarrera to txtInputCarrera,
            txtName to txtInputName,
            txtPassword2 to txtInputPassword2,
            txtUser to txtInputUser
        )

        for ((textView, textInputLayout) in fields) {
            if (textView.text.isEmpty()) {
                textInputLayout.error = "El campo no debe de estar vacío"
            }
        }

        val allFieldsFilled = fields.none { it.first.text.isEmpty() }
        if (allFieldsFilled) {
            if (pass1 == pass2) {
                Toast.makeText(this, "Save", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Password does not match", Toast.LENGTH_LONG).show()
            }
        }
    }
}