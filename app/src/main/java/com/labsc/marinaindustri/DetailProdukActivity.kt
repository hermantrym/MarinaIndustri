package com.labsc.marinaindustri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_produk.*

class DetailProdukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        BtnBack.setOnClickListener {
            val i = Intent(this, BerandaActivity::class.java)
            startActivity(i)
            finish()
        }

        BtnBeliSkrg.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
            startActivity(i)
            finish()
        }

        TeksBeliSkrg.setOnClickListener {
            val i = Intent(this, KeranjangActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}