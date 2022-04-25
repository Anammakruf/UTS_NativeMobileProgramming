package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailHairstyleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hairstyle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hairstyle = intent.getParcelableExtra<Hairstyle>(MainActivity.INTENT_PARCELABLE)

        val imgHairstyle = findViewById<ImageView>(R.id.img_item_photo)
        val nameHairstyle = findViewById<TextView>(R.id.tv_item_name)
        val descHairstyle = findViewById<TextView>(R.id.tv_item_description)

        imgHairstyle.setImageResource(hairstyle?.imgHairstyle!!)
        nameHairstyle.text = hairstyle.nameHairstyle
        descHairstyle.text = hairstyle.descHairstyle
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}