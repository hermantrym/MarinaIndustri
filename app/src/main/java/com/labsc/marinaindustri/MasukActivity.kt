package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_masuk.*


class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        BtnDaftar.setOnClickListener {
            val i = Intent(this, DaftarActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnMasuk.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        TextMasuk.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        Lewati.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}