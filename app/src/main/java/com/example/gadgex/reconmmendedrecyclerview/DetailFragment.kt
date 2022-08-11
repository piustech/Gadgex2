package com.example.gadgex.reconmmendedrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemImage = view.findViewById<ImageView>(R.id.itemImage)
        val itemName = view.findViewById<TextView>(R.id.itemName)
        val itemPrice = view.findViewById<TextView>(R.id.itemDetailPrice)
        val itemDetail = view.findViewById<TextView>(R.id.textView6)

        val image = requireArguments().getInt("image")
        val name = requireArguments().getInt("name")
        val price = requireArguments().getInt("price")
        val detail = requireArguments().getInt("detail")

        itemImage.setImageResource(image)
        itemName.setText(name)
        itemPrice.setText(price)
        itemDetail.setText(detail)


        val addToCart = view.findViewById<Button>(R.id.addToCartButton)

        addToCart.setOnClickListener {

            val bundle = Bundle()
           bundle.putInt("image",image)
           bundle.putInt("name",name)
           bundle.putInt("price",price)

            Toast.makeText(context, "Added to Cart", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_detailFragment_to_cartFragment, bundle)
        }

    }




}