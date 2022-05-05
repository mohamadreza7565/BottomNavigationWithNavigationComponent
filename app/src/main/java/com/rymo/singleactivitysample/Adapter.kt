package com.rymo.singleactivitysample

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 100

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemTv: TextView = itemView.findViewById(R.id.itemTv)

        @SuppressLint("SetTextI18n")
        fun bind() {
            itemTv.text = "item $adapterPosition"
        }

    }


}