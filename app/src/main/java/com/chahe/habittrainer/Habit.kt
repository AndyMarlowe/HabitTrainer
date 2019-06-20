package com.chahe.habittrainer

import android.graphics.Bitmap

data class Habit(val title: String, val description: String, val image: Bitmap)
//fun getSampleHabits(): List<Habit> {
//    return listOf(
//        Habit("Go for a walk", "A nice walk in the sun gets you ready for the day ahead", R.drawable.walk),
//        Habit("Drink water", "A refreshing glass of water get you hydrated", R.drawable.water)
//    )
//}