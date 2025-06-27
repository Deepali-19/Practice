package com.example.practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    var btn:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.saveButton)) { v, insets ->
            val systemBars insets.getInsets (WindowInsetsCompat.Type.systemBars()
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setContentView(R.layout.twelvejunetask)
        btn = findViewById(R.id.saveButton)


        btn?.setOnClickListener {
            Toast.makeText(this, "saved",Toast.LENGTH_SHORT).show()

            var intent:Intent(packageContext:this, LinaerLayoutScreen::class.java)

            startActivity(intent)

        }

        btn = findViewById(R.id.cancelButton)
        btn?.setOnClickListener {

            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show()

            var intent:Intent(packageContext:this, LinaerLayoutScreen::class.java)

            startActivity(intent)
        }
    }
}
