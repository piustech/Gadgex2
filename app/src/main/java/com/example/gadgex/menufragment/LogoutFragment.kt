package com.example.gadgex.menufragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R
import com.example.gadgex.activities.ExtendedActivity
import com.example.gadgex.activities.HomeActivity
import com.example.gadgex.activities.MainActivity

class LogoutFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_logout, container, false)

        val yesButton = view.findViewById<TextView>(R.id.yesButton)
        val noButton = view.findViewById<TextView>(R.id.noButton)

        yesButton.setOnClickListener {

            val intent = Intent(requireActivity(), ExtendedActivity::class.java)
            startActivity(intent)

        }

        noButton.setOnClickListener {

            findNavController().navigate(R.id.action_logoutFragment_to_homePageFragment2)
        }

        return view
    }
}