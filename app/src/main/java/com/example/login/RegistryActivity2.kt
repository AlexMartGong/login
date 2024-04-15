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

    lateinit var txtUser: EditText
    lateinit var txtPassword: EditText
    lateinit var txtPassword2: EditText
    lateinit var txtCarrera: EditText
    lateinit var txtPhone: EditText
    lateinit var txtName: EditText

    lateinit var txtInputUser: TextInputLayout
    lateinit var txtInputPassword: TextInputLayout
    lateinit var txtInputPassword2: TextInputLayout
    lateinit var txtInputName: TextInputLayout
    lateinit var txtInputCarrera: TextInputLayout
    lateinit var txtInputPhoneNumber: TextInputLayout

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

        if (txtPhone.text.isEmpty()) txtInputPhoneNumber.error = "El campo no debe de estar vacío"
        if (txtPassword.text.isEmpty()) txtInputPassword.error = "El campo no debe de estar vacío"
        if (txtCarrera.text.isEmpty()) txtInputCarrera.error = "El campo no debe de estar vacío"
        if (txtName.text.isEmpty()) txtInputName.error = "El campo no debe de estar vacío"
        if (txtPassword2.text.isEmpty()) txtInputPassword2.error = "El campo no debe de estar vacío"
        if (txtUser.text.isEmpty()) txtInputUser.error = "El campo no debe de estar vacío"

        /*
        if (txtPhone.text.isEmpty() || txtPassword.text.isEmpty() || txtCarrera.text.isEmpty() ||
            txtName.text.isEmpty() || txtPassword2.text.isEmpty() || txtUser.text.isEmpty()
        ) {

        }
         */

        if (pass1 == pass2) {
            Toast.makeText(this, "Save", Toast.LENGTH_LONG).show()
        }
    }

}