package com.example.gadgex.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R


class NewCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_new_card, container, false)

        val newCardButton = view.findViewById<Button>(R.id.newCardButton)

        val cardNumber = view.findViewById<EditText>(R.id.cardNumber)
        val cardName = view.findViewById<EditText>(R.id.cardName)
        val cardExpireDate = view.findViewById<EditText>(R.id.cardExpireDate)
        val cardCvC = view.findViewById<EditText>(R.id.cardCVC)


        newCardButton.setOnClickListener {

            if (cardNumber.text.toString().isEmpty() || cardName.text.toString().isEmpty() || cardExpireDate.text.toString().isEmpty() || cardCvC.text.toString().isEmpty()){
                Toast.makeText(context, "Enter your Card details", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(context, "Verified", Toast.LENGTH_SHORT).show()

                newCardButton.setBackgroundColor(Color.parseColor("#3532B0"))
                newCardButton.setTextColor(Color.WHITE)

                findNavController().navigate(R.id.action_newCardFragment_to_paymentSuccessFragment)

            }
        }






        return view
    }


}