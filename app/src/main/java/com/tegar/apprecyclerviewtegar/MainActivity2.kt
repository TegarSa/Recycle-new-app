package com.tegar.apprecyclerviewtegar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var ET1 : EditText
    private lateinit var ET2 : EditText
    private lateinit var btntambah : Button
    private lateinit var btnkurang : Button
    private lateinit var btnkali : Button
    private lateinit var btnbagi : Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        ET1 = findViewById(R.id.editTextNumber)
        ET2 = findViewById(R.id.editTextNumber2)
        btntambah = findViewById(R.id.buttontambah)
        btnkurang = findViewById(R.id.buttonkurang)
        btnkali = findViewById(R.id.buttonkali)
        btnbagi = findViewById(R.id.buttonbagi)
        tvResult = findViewById(R.id.textViewResult)
        btntambah.setOnClickListener(this)
        btnkurang.setOnClickListener(this)
        btnkali.setOnClickListener(this)
        btnbagi.setOnClickListener(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSubmit:Button = findViewById(R.id.btnBck)
        buttonSubmit.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.buttontambah){
            val inputNumber1 = ET1.text.toString().trim()
            val inputNumber2 = ET2.text.toString().trim()

            var isEmptyField = false

            if (inputNumber1.isEmpty()){
                isEmptyField = true
                ET1.error = "field ini tidak boleh kosong"
            }
            if (inputNumber2.isEmpty()){
                isEmptyField = true
                ET2.error = "field ini tidak boleh kosong"
            }

            if(!isEmptyField){
                val jumlah = inputNumber1.toDouble() + inputNumber2.toDouble()
                tvResult.text = jumlah.toString()

                Toast.makeText(applicationContext, tvResult.text, Toast.LENGTH_LONG).show()
            }
        }

        //button kurang
        if (p0.id == R.id.buttonkurang){
            val inputNumber1 = ET1.text.toString().trim()
            val inputNumber2 = ET2.text.toString().trim()

            var isEmptyField = false

            if (inputNumber1.isEmpty()){
                isEmptyField = true
                ET1.error = "field ini tidak boleh kosong"
            }
            if (inputNumber2.isEmpty()){
                isEmptyField = true
                ET2.error = "field ini tidak boleh kosong"
            }

            if(!isEmptyField){
                val kurang = inputNumber1.toDouble() - inputNumber2.toDouble()
                tvResult.text = kurang.toString()

                Toast.makeText(applicationContext, tvResult.text, Toast.LENGTH_LONG).show()
            }
        }

        //button kali
        if (p0.id == R.id.buttonkali){
            val inputNumber1 = ET1.text.toString().trim()
            val inputNumber2 = ET2.text.toString().trim()

            var isEmptyField = false

            if (inputNumber1.isEmpty()){
                isEmptyField = true
                ET1.error = "field ini tidak boleh kosong"
            }
            if (inputNumber2.isEmpty()){
                isEmptyField = true
                ET2.error = "field ini tidak boleh kosong"
            }

            if(!isEmptyField){
                val kali = inputNumber1.toDouble() * inputNumber2.toDouble()
                tvResult.text = kali.toString()

                Toast.makeText(applicationContext, tvResult.text, Toast.LENGTH_LONG).show()
            }
        }

        //button bagi
        if (p0.id == R.id.buttonbagi){
            val inputNumber1 = ET1.text.toString().trim()
            val inputNumber2 = ET2.text.toString().trim()

            var isEmptyField = false

            if (inputNumber1.isEmpty()){
                isEmptyField = true
                ET1.error = "field ini tidak boleh kosong"
            }
            if (inputNumber2.isEmpty()){
                isEmptyField = true
                ET2.error = "field ini tidak boleh kosong"
            }

            if(!isEmptyField){
                val bagi = inputNumber1.toDouble() / inputNumber2.toDouble()
                tvResult.text = bagi.toString()

                Toast.makeText(applicationContext, tvResult.text, Toast.LENGTH_LONG).show()
            }
        }
    }
}