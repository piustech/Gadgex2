package com.example.gadgex.fragments

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
import com.example.gadgex.R



class ForgottenPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forgotten_password, container, false)

        val resetPassword = view.findViewById<Button>(R.id.resetPassword)

        val email = view.findViewById<EditText>(R.id.emailForgotPassword)

        resetPassword.setOnClickListener {
            if (email.text.toString().isEmpty()){
                Toast.makeText(context, "Space empty or details not complete", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(context, "Password Reset sent to your mail ", Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_forgottenPasswordFragment_to_loginFragment)
            }

        }

        val loginForgotPassword = view.findViewById<TextView>(R.id.forgotPasswordLogin)

        loginForgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_forgottenPasswordFragment_to_loginFragment)
        }

        return view
    }



}