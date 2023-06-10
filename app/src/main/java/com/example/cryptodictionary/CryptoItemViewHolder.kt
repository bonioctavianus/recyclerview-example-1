package com.example.cryptodictionary

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CryptoItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val imageView: ImageView = itemView.findViewById(R.id.iv_icon)
    private val textView: TextView = itemView.findViewById(R.id.tv_title)

    fun bind(item: CryptoItem) {
        imageView.setImageResource(item.icon)
        textView.text = item.title
    }
}