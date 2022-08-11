package com.example.gadgex.homepagerecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gadgex.R

class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home_page, container, false)

        val imagePopular1: ImageView = view.findViewById(R.id.itemImagePopular1)
        val imagePopular2: ImageView = view.findViewById(R.id.itemImagePopular2)
        val viewAllPopular: TextView = view.findViewById(R.id.viewAllPopular)

        imagePopular1.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_popularFragment)
        }

        imagePopular2.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_popularFragment)
        }

        viewAllPopular.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_popularFragment)
        }


        val imageRecommended1: ImageView = view.findViewById(R.id.itemImageRecommend1)
        val imageRecommended2: ImageView = view.findViewById(R.id.itemImageRecommend2)
        val viewAllRecommended: TextView = view.findViewById(R.id.viewAllRecommended)

        imageRecommended1.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_reconmmendedFragment)
        }

        imageRecommended2.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_reconmmendedFragment)
        }

        viewAllRecommended.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_reconmmendedFragment)
        }


        val imageMostSearch1: ImageView = view.findViewById(R.id.itemImageMostSearch1)
        val imageMostSearch2: ImageView = view.findViewById(R.id.itemImageMostSearch2)
        val viewAllMostSearch: TextView = view.findViewById(R.id.viewAllMostSearch)

        imageMostSearch1.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_mostSearchFragment)
        }

        imageMostSearch2.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_mostSearchFragment)
        }

        viewAllMostSearch.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment2_to_mostSearchFragment)
        }




        return  view
    }

}