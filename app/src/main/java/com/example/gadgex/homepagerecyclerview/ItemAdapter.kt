package com.example.gadgex.homepagerecyclerview

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.gadgex.R

class ItemAdapter(private val context: Context, private  val list: List<DataClass>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder( val view: View) : RecyclerView.ViewHolder(view){



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.vertical_item_list, parent , false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val item = list[position]







    }

    override fun getItemCount(): Int {
        return  list.size
    }

}