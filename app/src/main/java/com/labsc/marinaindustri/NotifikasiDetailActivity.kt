package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notifikasi_detail.*
import kotlinx.android.synthetic.main.activity_notifikasi_detail.NavCart
import kotlinx.android.synthetic.main.activity_notifikasi_detail.NavHome
import kotlinx.android.synthetic.main.activity_notifikasi_detail.NavProfile

class NotifikasiDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi_detail)

        BtnBack.setOnClickListener {
            val i = Intent(this, NotifikasiActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnCek.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
            startActivity(i)
            finish()
        }

        TeksCek.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
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