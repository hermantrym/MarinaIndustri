package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_keranjang.*
import kotlinx.android.synthetic.main.activity_keranjang.NavNotification
import kotlinx.android.synthetic.main.activity_keranjang.NavProfile

class KeranjangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)

        BtnBayar.setOnClickListener {
            val i = Intent(this, CheckoutActivity::class.java)
            startActivity(i)
            finish()
        }

        TeksBayar.setOnClickListener {
            val i = Intent(this, CheckoutActivity::class.java)
            startActivity(i)
            finish()
        }

        // navigasi
        NavHome.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
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