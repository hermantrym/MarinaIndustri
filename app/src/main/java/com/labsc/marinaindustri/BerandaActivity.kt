package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*
import kotlinx.android.synthetic.main.activity_beranda.NavCart

class BerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        Alamat.setOnClickListener {
            val i = Intent(this, ProfilAlamatActivity::class.java)
            startActivity(i)
            finish()
        }

        Promo.setOnClickListener {
            val i = Intent(this, DetailProdukActivity::class.java)
            startActivity(i)
            finish()
        }

        Card1.setOnClickListener {
            val i = Intent(this, DetailProdukActivity::class.java)
            startActivity(i)
            finish()
        }

        Card2.setOnClickListener {
            val i = Intent(this, DetailProdukActivity::class.java)
            startActivity(i)
            finish()
        }

        Card3.setOnClickListener {
            val i = Intent(this, DetailProdukActivity::class.java)
            startActivity(i)
            finish()
        }

        Card4.setOnClickListener {
            val i = Intent(this, DetailProdukActivity::class.java)
            startActivity(i)
            finish()
        }

        // navigasi
        NavCart.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
            startActivity(i)
            finish()
        }

        NavNotification.setOnClickListener {
            val i = Intent(this, NotifikasiActivity::class.java)
            startActivity(i)
            finish()
        }

        NavProfile.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}