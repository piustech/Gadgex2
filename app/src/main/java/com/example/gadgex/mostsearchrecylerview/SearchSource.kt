package com.example.gadgex.mostsearchrecylerview

import com.example.gadgex.R

class SearchSource {

    fun loadSearchClass() : List<SearchClass>{

        return listOf(

            SearchClass(R.string.item1, R.string.price1, R.drawable.drone, R.string.detail1),
            SearchClass(R.string.item2, R.string.price2, R.drawable.ear_pod, R.string.detail2),
            SearchClass(R.string.item3, R.string.price3, R.drawable.sound_pods, R.string.detail3),
            SearchClass(R.string.item4, R.string.price4, R.drawable.air_mouse, R.string.detail3),
            SearchClass(R.string.item5, R.string.price5, R.drawable.laptop, R.string.detail3),
            SearchClass(R.string.item6, R.string.price6, R.drawable.speaker, R.string.detail3),
            SearchClass(R.string.item7, R.string.price7, R.drawable.airpods, R.string.detail3),
            SearchClass(R.string.item8, R.string.price8, R.drawable.head_set, R.string.detail3),
            SearchClass(R.string.item9, R.string.price9, R.drawable.phone, R.string.detail3),
            SearchClass(R.string.item10, R.string.price10, R.drawable.airpods, R.string.detail3)

        )

    }
}