package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val hairstyleList = listOf<Hairstyle>(
            Hairstyle(
                R.drawable.cropcut,
                "Crop Cut",
                "Salah satu nama potongan rambut pria yang populer tahun ini adalah Caesar cut. Untuk mendeskripsikan potongan cepak ini, bayangkan saja mangkuk. Yes, salah satu model rambut jaman sekarang ini benar-benar memangkas sisi bagian samping ke bawah dan hanya menyisakan rambut bagian atas."
            ),
            Hairstyle(
                R.drawable.fringecrop,
                "Fringe Crop",
                "Nah, gaya rambut pria ini mirip dengan French crop yang cenderung tegas. Namun fokusnya terdapat di bagian poni (fringe) yang dipotong rata tanpa tambahan layer. Kedua sisi rambut dipapas habis dengan model fade."
            ),
            Hairstyle(
                R.drawable.frenchcrop,
                "Frech Crop",
                "French crop adalah gaya potong rambut model sekarang yang memiliki ciri khas guntingan pendek di bagian belakang dan kedua sisi, tapi sisi depannya dibiarkan lebih panjang sehingga menutupi sebagian atau sampai tengah kening."
            ),
            Hairstyle(
                R.drawable.pompadour,
                "Pompadour",
                "Layaknya undercut, pompadour juga tergolong model rambut ikonik dan timeless. Model rambut ini cocok untuk pria berambut tebal dan senang bereksperimen dengan pomade."
            ),
            Hairstyle(
                R.drawable.sidepart,
                "Side Part",
                "Ini adalah nama model rambut pria untuk gaya rambut belah samping atau belah pinggir. Model rambut belah samping tak selalu harus dengan potongan rambut pendek dan rapi."
            ),
            Hairstyle(
                R.drawable.taperfade,
                "Tape Fade",
                "Bedanya dengan taper cut adalah taper fade merupakan kombinasi taper dan fade. Cukuran rambut pria seperti taper yang menciptakan garis alami digabungkan dengan potongan fade yang perlahan menipis dan ‘menghilang’ (sesuai arti namanya)."
            ),
            Hairstyle(
                R.drawable.tappercrop,
                "Tapper Cut",
                "Nama model rambut pria yang satu ini mungkin cukup asing di telingamu, meski kami yakin kamu sudah sering melihatnya langsung. Taper cut adalah teknik menggunting rambut hingga mendapatkan potongan rata atau tercipta efek garis yang terlihat"
            ),
            Hairstyle(
                R.drawable.texturedcrop,
                "Textured Crop",
                "Gaya rambut pria pendek ini mirip dengan crop cut dengan tambahan layer pada bagian atas rambut. Cara menata gaya potong rambut pria ini mudah, cukup pakai gel rambut atau hairspray supaya lebih berbentuk dan tidak mudah ‘kempes’."
            ),
            Hairstyle(
                R.drawable.tightcrop,
                "Tight Crop",
                "Model rambut pria terbaru lainnya adalah tight crop. Gaya rambut ini akan menonjolkan fitur wajahmu. Gaya rambut ini cenderung rileks dan luwes, cocok untuk gaya sehari-hari yang kasual. Style rambut pria ini cocok untuk kamu yang suka dengan gaya rambut pria Jepang"
            ),
            Hairstyle(
                R.drawable.undercut,
                "Under Cut",
                "Potongan rambut pria undercut adalah cukuran rambut pria yang khas dengan bagian samping dan belakang yang tipis, sedangkan bagian atasnya disisakan tebal. Hasil cutting ini akan bikin penampilan terlihat clean dan rapi"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HairstyleAdapter(this, hairstyleList){

            val intent = Intent (this, DetailHairstyleActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}