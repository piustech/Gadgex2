package com.example.gadgex.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R

class PaymentSuccessFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_payment_success, container, false)

        val continueShopping = view.findViewById<Button>(R.id.goBackHomeButton)
        continueShopping.setOnClickListener {
            findNavController().navigate(R.id.action_paymentSuccessFragment_to_reconmmendedFragment)


       }

       val goBackHome = view.findViewById<Button>(R.id.doMoreShopping)
        goBackHome.setOnClickListener {
            findNavController().navigate(R.id.action_paymentSuccessFragment_to_homePageFragment2)

            goBackHome.setBackgroundColor(Color.parseColor("#3532B0"))
            goBackHome.setTextColor(Color.WHITE)
        }

        val veryHappy = view.findViewById<ImageView>(R.id.veryHappy)
        val happy = view.findViewById<ImageView>(R.id.happy)
        val confuse = view.findViewById<ImageView>(R.id.confuse)
        val angry = view.findViewById<ImageView>(R.id.angry)
        val veryAngry = view.findViewById<ImageView>(R.id.veryAngry)

        veryHappy.setOnClickListener {

            Toast.makeText(context, "You rated: Very Happy", Toast.LENGTH_SHORT).show()
        }

        happy.setOnClickListener {

            Toast.makeText(context, "You rated: Happy", Toast.LENGTH_SHORT).show()
        }

        confuse.setOnClickListener {
            Toast.makeText(context, "You rated: Confused", Toast.LENGTH_SHORT).show()
        }

        angry.setOnClickListener {
            Toast.makeText(context, "You rated: Angry", Toast.LENGTH_SHORT).show()
        }

        veryAngry.setOnClickListener {
            Toast.makeText(context, "You rated: Very Angry", Toast.LENGTH_SHORT).show()
        }


        return view
    }
}