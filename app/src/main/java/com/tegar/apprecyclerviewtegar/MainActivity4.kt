package com.tegar.apprecyclerviewtegar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity(), View.OnClickListener {
    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editAlamat: EditText
    private lateinit var editNoHp: EditText
    private lateinit var btHasil: Button
    private lateinit var resName: TextView
    private lateinit var resEmail: TextView
    private lateinit var resAlamat: TextView
    private lateinit var resNoHp: TextView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editName = findViewById(R.id.etName)
        editEmail = findViewById(R.id.etEmail)
        editAlamat = findViewById(R.id.etAlamat)
        editNoHp = findViewById(R.id.etNoHp)
        btHasil = findViewById(R.id.btHasil)
        resName = findViewById(R.id.resultName)
        resEmail = findViewById(R.id.resultEmail)
        resAlamat = findViewById(R.id.resultAlamat)
        resNoHp = findViewById(R.id.resultNoHp)


        btHasil.setOnClickListener(this)

        val buttonSubmit:Button = findViewById(R.id.bck)
        buttonSubmit.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    override fun onClick(p0: View) {
        val name = editName.text.toString().trim()
        val email = editEmail.text.toString().trim()
        val alamat = editAlamat.text.toString().trim()
        val NoHp = editNoHp.text.trim()

        resName.text = name
        resEmail.text = email
        resAlamat.text = alamat
        resNoHp.text = NoHp
    }

}