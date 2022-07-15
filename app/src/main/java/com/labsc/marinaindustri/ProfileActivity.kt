package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.NavCart
import kotlinx.android.synthetic.main.activity_profile.NavHome

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        EditProfil.setOnClickListener {
            val i = Intent(this, ProfilEditActivity::class.java)
            startActivity(i)
            finish()
        }

        Alamat.setOnClickListener {
            val i = Intent(this, ProfilAlamatActivity::class.java)
            startActivity(i)
            finish()
        }

        Logout.setOnClickListener {
            val i = Intent(this, MasukActivity::class.java)
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

        NavNotification.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}