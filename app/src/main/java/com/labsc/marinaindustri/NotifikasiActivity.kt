package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notifikasi.*
import kotlinx.android.synthetic.main.activity_notifikasi.NavHome

import kotlinx.android.synthetic.main.activity_notifikasi.NavProfile

class NotifikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        Rectangle.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Teks.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Rectangle1.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Teks1.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Rectangle2.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Teks2.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Rectangle3.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Teks3.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Rectangle4.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        Teks4.setOnClickListener {
            val i = Intent(this, NotifikasiDetailActivity::class.java)
            startActivity(i)
            finish()
        }

        // navigasi
        NavHome.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
            startActivity(i)
            finish()
        }

        NavCart.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
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