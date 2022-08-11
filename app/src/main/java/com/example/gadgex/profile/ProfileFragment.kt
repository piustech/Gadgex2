package com.example.gadgex.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R
import com.example.gadgex.activities.HomeActivity
import com.example.gadgex.activities.MainActivity

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val logoutProfile = view.findViewById<Button>(R.id.profileLogOut)

        logoutProfile.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_logoutFragment)
        }

        val personalDetails = view.findViewById<TextView>(R.id.personal)

        personalDetails.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_personalDetailsFragment)
        }

        val itemsOrdered = view.findViewById<TextView>(R.id.itemOrdered)

        itemsOrdered.setOnClickListener {
            Toast.makeText(context, "Items Ordered is empty", Toast.LENGTH_SHORT).show()
        }

        val changeEmailAddress = view.findViewById<TextView>(R.id.changeEmailAddress)
        val changePassword = view.findViewById<TextView>(R.id.changePassword)

        changeEmailAddress.setOnClickListener {
            Toast.makeText(context, "Login again to change your Email", Toast.LENGTH_LONG).show()

            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        changePassword.setOnClickListener {
            Toast.makeText(context, "Login again to change your Password", Toast.LENGTH_LONG).show()

            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }



}