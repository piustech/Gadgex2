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


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val forgotPassword = view.findViewById<TextView>(R.id.forgotPassword)

        forgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgottenPasswordFragment)
        }


        val signOption = view.findViewById<TextView>(R.id.signupOption)
        val logButton = view.findViewById<Button>(R.id.loginButton)

        val email = view.findViewById<EditText>(R.id.emailInput)
        val password = view.findViewById<EditText>(R.id.passwordInput)


        signOption.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)


        }

        logButton.setOnClickListener {


            if(email.text.toString().isEmpty() || password.text.toString().isEmpty()){

                Toast.makeText(context, "Check your details", Toast.LENGTH_SHORT).show()

            }else if (email.text.toString().contains("") || password.text.toString().contains("")){

                Toast.makeText(context, "Successfully Login", Toast.LENGTH_SHORT).show()

                logButton.setBackgroundColor(Color.parseColor("#3532B0"))
                logButton.setTextColor(Color.WHITE)

                val intent = Intent(requireActivity(), HomeActivity::class.java)
                startActivity(intent)

            }
        }
        return view
    }

}




