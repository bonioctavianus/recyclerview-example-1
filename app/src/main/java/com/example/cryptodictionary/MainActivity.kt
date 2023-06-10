package com.example.cryptodictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_crypto)

        val items = listOf(
            CryptoItem(
                icon = R.drawable.bitcoin,
                title = "Bitcoin"
            ),
            CryptoItem(
                icon = R.drawable.doge,
                title = "Doge"
            ),
            CryptoItem(
                icon = R.drawable.ethereum,
                title = "Ethereum"
            ),
            CryptoItem(
                icon = R.drawable.filecoin,
                title = "Filecoin"
            ),
            CryptoItem(
                icon = R.drawable.litecoin,
                title = "Litecoin"
            ),
            CryptoItem(
                icon = R.drawable.monero,
                title = "Monero"
            ),
            CryptoItem(
                icon = R.drawable.ripple,
                title = "Ripple"
            ),
            CryptoItem(
                icon = R.drawable.shiba_inu,
                title = "Shiba Inu"
            ),
            CryptoItem(
                icon = R.drawable.usdt,
                title = "USDT"
            ),
            CryptoItem(
                icon = R.drawable.vechain,
                title = "Vechain"
            )
        )

        val adapter = CryptoItemAdapter(items)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}