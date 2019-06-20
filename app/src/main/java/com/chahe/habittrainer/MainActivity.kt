package com.chahe.habittrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.chahe.habittrainer.db.HabitDbTable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // private lateinit  var tvDescription: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tvDescription = findViewById(R.id.tv_description)
//        tvDescription.text = "A refreshing glass of water get you hydrated"
//       iv_icon.setImageResource(R.drawable.water)
//       tv_title.text = getString(R.string.drink_water)
//       tv_description.text  = getString(R.string.drink_water_desc)


       // Adapter -> defines data
       // RecyclerView -> implements 3 methods
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this);

       rv.adapter  =  HabitsAdapter(HabitDbTable(this).readAllHabits())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       if(item.itemId == R.id.add_habit){
           switch(CreateHabitActivity::class.java)
       }

        return true

    }

    private fun switch(c: Class<*>) {
        val intent = Intent(this,c )
        startActivity(intent)
    }
}
