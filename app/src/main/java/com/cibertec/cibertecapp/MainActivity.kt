package com.cibertec.cibertecapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainn)

        val email = findViewById<EditText>(R.id.edtEmail)
        val password = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {

            val emailValue = email.text.toString()
            val passValue = password.text.toString()

            if(emailValue.equals("jorge@gmail.com") &&
                passValue.equals("123456")) {

                Toast.makeText(this, "Login correcto",
                    Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Login incorrecto",
                    Toast.LENGTH_SHORT).show()
            }

        }


    }

}