package com.tegar.apprecyclerviewtegar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class ListFlowerAdapter(private val listFlower:ArrayList<Flower>): RecyclerView.Adapter<ListFlowerAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.imgPhoto)
        val tvName :TextView = itemView.findViewById(R.id.textView)
        val tvDesc: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_flower, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listFlower.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (title, description, photo) = listFlower[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = title
        holder.tvDesc.text = description

        holder.itemView.setOnClickListener {
            // Intent ke DetailActivity
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_NAME, listFlower[holder.adapterPosition].name)
            intent.putExtra(DetailActivity.EXTRA_DESC, listFlower[holder.adapterPosition].description)
            intent.putExtra(DetailActivity.EXTRA_PHOTO, listFlower[holder.adapterPosition].photo)
            holder.itemView.context.startActivity(intent)
        }
    }

}