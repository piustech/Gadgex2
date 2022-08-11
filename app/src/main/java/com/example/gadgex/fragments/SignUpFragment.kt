package com.example.gadgex.fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gadgex.activities.HomeActivity
import com.example.gadgex.R

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

       val loginOption = view.findViewById<TextView>(R.id.loginOption)
        val signUpButton = view.findViewById<Button>(R.id.signUpButton)
        val signupName = view.findViewById<EditText>(R.id.signupName)
        val signupEmail = view.findViewById<EditText>(R.id.signupEmail)
        val signupPassword = view.findViewById<EditText>(R.id.signupPassword)
        val signupConfirmPassword = view.findViewById<EditText>(R.id.signupConfirmPassword)

        loginOption.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        signUpButton.setOnClickListener {



            if (signupName.text.toString().isEmpty() || signupEmail.text.isEmpty() || signupPassword.text.toString().isEmpty() || signupConfirmPassword.text.toString().isEmpty()  || signupPassword.text.toString() != signupConfirmPassword.text.toString()) {
                Toast.makeText(context, "Details not Complete or Check Password", Toast.LENGTH_LONG).show()

            }else if (signupName.text.toString().contains("") && signupEmail.text.toString().contains("") && signupPassword.text.toString().contains("") && signupConfirmPassword.text.toString().contains("")  ) {
                Toast.makeText(context, "Successfully SignUp", Toast.LENGTH_SHORT).show()

                signUpButton.setBackgroundColor(Color.parseColor("#3532B0"))
                signUpButton.setTextColor(Color.WHITE)

                val intent = Intent(requireActivity(), HomeActivity::class.java)
                startActivity(intent)

            }
        }



        return view
    }


}