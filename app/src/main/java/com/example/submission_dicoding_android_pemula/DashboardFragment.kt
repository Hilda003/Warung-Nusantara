package com.example.submission_dicoding_android_pemula

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submission_dicoding_android_pemula.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
    private var list = ArrayList<FoodData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvFood.setHasFixedSize(true)
        list.addAll(getListFoods())
        showRecyclerView()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("Recycle")
    private fun getListFoods(): ArrayList<FoodData> {
        val dataName = resources.getStringArray(R.array.data_name_food)
        val dataRate = resources.getStringArray(R.array.data_rate)
        val dataLocation = resources.getStringArray(R.array.data_name_location)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataImage = resources.obtainTypedArray(R.array.data_image)
        val listFood = ArrayList<FoodData>()
        for (position in dataName.indices) {
            val food = FoodData(
                dataImage.getResourceId(position, -1),
                dataName[position],
                dataRate[position],
                dataDescription[position],
                dataLocation[position]
            )
            listFood.add(food)
        }
        dataImage.recycle()
        return listFood
    }

    private fun showRecyclerView() {
        binding.rvFood.layoutManager = LinearLayoutManager(context)
        val listFoodAdapter = ListFoodAdapter(list)
        binding.rvFood.adapter = listFoodAdapter
    }

}