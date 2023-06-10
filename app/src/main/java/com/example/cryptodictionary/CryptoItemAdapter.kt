package com.example.cryptodictionary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CryptoItemAdapter(
    private val items: List<CryptoItem>
) : RecyclerView.Adapter<CryptoItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_crypto, parent, false)
        return CryptoItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CryptoItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}