package com.example.gadgex.popularrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gadgex.R

class PopularFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val myPopular = PopularSource().loadPopularClass()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = context?.let { PopularAdapter(it.applicationContext, myPopular) }
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager( context, 2 )
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)


    }

}