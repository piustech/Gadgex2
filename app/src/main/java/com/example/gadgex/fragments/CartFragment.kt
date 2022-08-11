package com.example.gadgex.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R


class CartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var increment = 1

        val incrementSign : ImageView? = view?.findViewById(R.id.incrementSign)
        val number : TextView? = view?.findViewById(R.id.textView19)

        incrementSign?.setOnClickListener {
            increment++

            number?.text = increment.toString()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        val cartButton = view.findViewById<Button>(R.id.payNowCartButton)

        cartButton.setOnClickListener {

            findNavController().navigate(R.id.action_cartFragment_to_paymentFragment)

        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cartImage = view.findViewById<ImageView>(R.id.cartImage)
        val cartName = view.findViewById<TextView>(R.id.cartName)
        val cartPrice = view.findViewById<TextView>(R.id.cartPrice)

        val image = requireArguments().getInt("image")
        val name = requireArguments().getInt("name")
        val price = requireArguments().getInt("price")

        cartImage.setImageResource(image)
        cartName.setText(name)
        cartPrice.setText(price)
    }


}