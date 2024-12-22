package com.tegar.apprecyclerviewtegar

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSubmit:Button = findViewById(R.id.button2)
        buttonSubmit.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }

        val button1:Button = findViewById(R.id.button3)
        button1.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnIg: Button = findViewById(R.id.button4)
        btnIg.setOnClickListener {
            val urlIg = "https://www.instagram.com/tgrstr__"
            val j = Intent(Intent.ACTION_VIEW, Uri.parse(urlIg))
            startActivity(j)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            val phoneNumber = "tel:123456789"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber))
            startActivity(intent)
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }

        val button10: Button = findViewById(R.id.buttonsnd)
        button10.setOnClickListener {
            val i = Intent(this, MainActivity5::class.java)
            startActivity(i)
        }

    }
}