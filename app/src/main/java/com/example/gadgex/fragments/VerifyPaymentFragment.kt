package com.example.gadgex.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R


class VerifyPaymentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_verify_payment, container, false)

        val verifyPayment = view.findViewById<Button>(R.id.verifyPayment)
        val cardCVC = view.findViewById<EditText>(R.id.cardCVC)
        val pin = view.findViewById<EditText>(R.id.pin)

        verifyPayment.setOnClickListener {
            if (cardCVC.text.toString().isEmpty() || pin.text.toString().isEmpty()){

                Toast.makeText(context, "Update your Card", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(context, "Card Verified", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_verifyPaymentFragment_to_paymentSuccessFragment)

                verifyPayment.setBackgroundColor(Color.parseColor("#3532B0"))
                verifyPayment.setTextColor(Color.WHITE)
            }

        }

        return view
    }


}