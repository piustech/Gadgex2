package com.example.gadgex.fragments

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R

class PaymentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_payment, container, false)

        val addCard = view.findViewById<TextView>(R.id.addNewCard)
        val paymentButton = view.findViewById<Button>(R.id.payNowPaymentButton)

        addCard.setOnClickListener {

            findNavController().navigate(R.id.action_paymentFragment_to_newCardFragment)

        }

        val firstCreditCard = view.findViewById<ImageView>(R.id.firstCreditCard)
        firstCreditCard.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_verifyPaymentFragment)
        }

        val secondCreditCard = view.findViewById<ImageView>(R.id.secondCreditCard)

        secondCreditCard.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_verifyPaymentFragment)
        }


        val thirdCreditCard = view.findViewById<ImageView>(R.id.thirdCreditCard)
        thirdCreditCard.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_verifyPaymentFragment)
        }


        paymentButton.setOnClickListener {

            paymentButton.setBackgroundColor(Color.parseColor("#3532B0"))
            paymentButton.setTextColor(Color.WHITE)

            findNavController().navigate(R.id.action_paymentFragment_to_verifyPaymentFragment)

        }


        val creditCard1 = view.findViewById<ImageView>(R.id.creditCard1)
        creditCard1.setOnClickListener {
            creditCard1.setBackgroundColor(Color.WHITE)
            creditCard1.setImageDrawable(Drawable.createFromPath(""))
        }

        return view
    }


}