package com.example.gadgex.homepagerecyclerview

import com.example.gadgex.R

class DataSource {

    fun loadDataClass() : List<DataClass>{

        return listOf(

          DataClass(R.string.header1, R.string.button1, R.string.item1, R.string.item2, R.string.price1, R.string.price2, R.drawable.head_set, R.drawable.watch, R.string.detail1, R.string.detail2),
          DataClass(R.string.header2, R.string.button2, R.string.item3, R.string.item4, R.string.price1, R.string.price2, R.drawable.sound_pods, R.drawable.air_mouse, R.string.detail3, R.string.detail4),
          DataClass(R.string.header3, R.string.button3, R.string.item5, R.string.item6, R.string.price1, R.string.price2, R.drawable.laptop, R.drawable.speaker, R.string.detail5, R.string.detail6)

        )

    }
}