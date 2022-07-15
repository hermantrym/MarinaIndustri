package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_checkout.*
import kotlinx.android.synthetic.main.activity_checkout.NavHome
import kotlinx.android.synthetic.main.activity_checkout.NavNotification
import kotlinx.android.synthetic.main.activity_checkout.NavProfile

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        BtnEdit.setOnClickListener {
            val i = Intent(this, ProfilAlamatActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnKirim.setOnClickListener {
            val i = Intent(this, CheckoutBerhasilActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        TeksKirim.setOnClickListener {
            val i = Intent(this, CheckoutBerhasilActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
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

