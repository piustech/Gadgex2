package com.example.gadgex.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R


class PersonalDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_personal_details, container, false)

        val saveButton = view.findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            findNavController().navigate(R.id.action_personalDetailsFragment_to_profileFragment)

            Toast.makeText(context, "Your details successfully saved", Toast.LENGTH_SHORT).show()
        }

        return view
    }


}