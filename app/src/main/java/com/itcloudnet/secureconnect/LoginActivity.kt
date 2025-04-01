
package com.itcloudnet.secureconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val user = findViewById<EditText>(R.id.usernameEditText).text.toString()
            val pass = findViewById<EditText>(R.id.passwordEditText).text.toString()
            if (user.isNotEmpty() && pass.isNotEmpty()) {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
