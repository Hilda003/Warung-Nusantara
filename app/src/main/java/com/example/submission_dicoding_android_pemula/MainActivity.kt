package com.example.submission_dicoding_android_pemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submission_dicoding_android_pemula.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private var list = ArrayList<FoodData>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(DashboardFragment())


        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    setFragment(DashboardFragment())
                    true

                }
                R.id.about -> {
                    setFragment(AboutFragment())
                    true
                }
                else -> false
            }
        }

//        binding.rvFood.setHasFixedSize(true)
//        list.addAll(getListFoods())
//        showRecyclerView()
//
//        val actionbar = supportActionBar
//
//            actionbar!!.title = "Warung Nusantara"

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layout_fragment, fragment)
            commit()
        }
    }



//    private fun getListFoods(): ArrayList<FoodData> {
//        val dataName = resources.getStringArray(R.array.data_name_food)
//        val dataRate = resources.getStringArray(R.array.data_rate)
//        val dataDescription = resources.getStringArray(R.array.data_description)
//        val dataImage = resources.obtainTypedArray(R.array.data_image)
//        var listFood = ArrayList<FoodData>()
//        for (position in dataName.indices) {
//            val food = FoodData(
//                dataImage.getResourceId(position, -1),
//                dataName[position],
//                dataRate[position],
//                dataDescription[position]
//            )
//            listFood.add(food)
//
//        }
//        dataImage.recycle()
//        return listFood
//    }

//    private fun showRecyclerView() {
//        binding.rvFood.layoutManager = LinearLayoutManager(this)
//        val listFoodAdapter = ListFoodAdapter(list)
//        binding.rvFood.adapter = listFoodAdapter
//    }
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        setMode(item.itemId)
//        return super.onOptionsItemSelected(item)
//    }
//    private fun setMode(selectedMode: Int) {
//        when(selectedMode)
//        {
//            R.id.about -> {
//                val goAbout = Intent(this@MainActivity, About::class.java)
//                startActivity(goAbout)
//            }
//
//        }
//    }





}