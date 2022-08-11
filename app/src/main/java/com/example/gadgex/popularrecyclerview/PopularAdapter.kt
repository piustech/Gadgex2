package com.example.gadgex.popularrecyclerview

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.gadgex.R

class PopularAdapter (private val context: Context, private val popular: List<PopularClass>):
    RecyclerView.Adapter<PopularAdapter.ItemViewHolder>(){

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val itemName: TextView = view.findViewById(R.id.itemName)
        val itemPrice: TextView = view.findViewById(R.id.itemPrice)
        val itemImage: ImageView = view.findViewById(R.id.itemImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.popular_items, parent , false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = popular[position]

        holder.itemName.text = context.resources.getString(item.itemId)
        holder.itemPrice.text = context.resources.getString(item.priceId)
        holder.itemImage.setImageResource(item.imageId)

        holder.itemView.setOnClickListener {
            holder.view.context
            val bundle = Bundle()
            bundle.putInt("name", item.itemId)
            bundle.putInt("price", item.priceId)
            bundle.putInt("image", item.imageId)
            bundle.putInt("detail", item.detailId)

            holder.view.findNavController().navigate(R.id.action_popularFragment_to_detailFragment, bundle)

        }
    }

    override fun getItemCount(): Int {
        return popular.size
    }


}