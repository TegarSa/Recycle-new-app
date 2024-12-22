package com.tegar.apprecyclerviewtegar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgFlowerDetail: ImageView = findViewById(R.id.imgFlowerDetail)
        val tvNameDetail: TextView = findViewById(R.id.tvNameDetail)
        val tvDescDetail: TextView = findViewById(R.id.tvDescDetail)

        // Ambil data yang dikirim melalui Intent
        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        // Set data ke view
        tvNameDetail.text = name
        tvDescDetail.text = desc
        imgFlowerDetail.setImageResource(photo)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PHOTO = "extra_photo"
    }
}
