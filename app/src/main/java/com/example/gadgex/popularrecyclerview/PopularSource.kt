package com.example.gadgex.popularrecyclerview

import com.example.gadgex.R

class PopularSource {

    fun loadPopularClass() : List<PopularClass>{

        return listOf(

            PopularClass(R.string.item1, R.string.price1, R.drawable.head_set, R.string.detail1),
            PopularClass(R.string.item2, R.string.price2, R.drawable.watch, R.string.detail2),
            PopularClass(R.string.item3, R.string.price3, R.drawable.sound_pods, R.string.detail3),
            PopularClass(R.string.item4, R.string.price4, R.drawable.air_mouse, R.string.detail3),
            PopularClass(R.string.item5, R.string.price5, R.drawable.laptop, R.string.detail3),
            PopularClass(R.string.item6, R.string.price6, R.drawable.speaker, R.string.detail3),
            PopularClass(R.string.item7, R.string.price7, R.drawable.airpods, R.string.detail3),
            PopularClass(R.string.item8, R.string.price8, R.drawable.head_set, R.string.detail3),
            PopularClass(R.string.item9, R.string.price9, R.drawable.phone, R.string.detail3),
            PopularClass(R.string.item10, R.string.price10, R.drawable.airpods, R.string.detail3)

        )

    }
}