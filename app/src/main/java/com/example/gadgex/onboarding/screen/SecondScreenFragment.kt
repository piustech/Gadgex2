package com.example.gadgex.onboarding.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R


class SecondScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val button = view.findViewById<Button>(R.id.getStartedButton)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_signUpFragment)
            onBoardingFinished()
        }

        return view
    }

    private fun onBoardingFinished() {

        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("Finished", true)
        editor.apply()

    }



}


