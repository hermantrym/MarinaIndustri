package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar.*

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        BtnMasuk.setOnClickListener {
            val i = Intent(this, MasukActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnDaftar.setOnClickListener {
            val i = Intent(this, DaftarSuksesActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        TextDaftar.setOnClickListener {
            val i = Intent(this, DaftarSuksesActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}