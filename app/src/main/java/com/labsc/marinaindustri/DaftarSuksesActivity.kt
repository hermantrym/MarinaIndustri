package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_sukses.*

class DaftarSuksesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_sukses)

        Teks.alpha = 0f
        Teks.animate().setDuration(4000).alpha(1f).withEndAction {
            val i = Intent(this, MasukActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        Logo.alpha = 0f
        Logo.animate().setDuration(4000).alpha(1f).withEndAction {
            val i = Intent(this, MasukActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}