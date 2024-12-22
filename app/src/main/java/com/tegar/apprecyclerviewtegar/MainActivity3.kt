package com.tegar.apprecyclerviewtegar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    private lateinit var rvFlowers: RecyclerView
    private val list= ArrayList<Flower>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        rvFlowers = findViewById(R.id.rvFlower)
        rvFlowers.setHasFixedSize(true)
        list.addAll(getListFlowers())

        // Panggil fungsi showRecyclerList di sini
        showRecyclerList()

        val buttonSubmit:Button = findViewById(R.id.btnback)
        buttonSubmit.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    private fun showRecyclerList() {
        rvFlowers.layoutManager = LinearLayoutManager(this)
        val listFlowerAdapter = ListFlowerAdapter(list)
        rvFlowers.adapter = listFlowerAdapter
    }

    @SuppressLint("Recycle")
    private fun getListFlowers(): ArrayList<Flower> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDesc = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listFlower = ArrayList<Flower>()
        for (i in dataName.indices){
            val flower = Flower(dataName[i], dataDesc[i], dataPhoto.getResourceId(i, -1))
            listFlower.add(flower)
        }
        return listFlower
    }


}
