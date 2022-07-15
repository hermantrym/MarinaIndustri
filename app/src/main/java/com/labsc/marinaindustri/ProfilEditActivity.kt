package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil_edit.*
import kotlinx.android.synthetic.main.activity_profil_edit.NavCart
import kotlinx.android.synthetic.main.activity_profil_edit.NavHome
import kotlinx.android.synthetic.main.activity_profil_edit.NavNotification

class ProfilEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_edit)

        BtnBack.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnSimpan.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
            finish()
        }

        TeksSimpan.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
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