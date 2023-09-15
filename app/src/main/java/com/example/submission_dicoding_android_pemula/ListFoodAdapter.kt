package com.example.submission_dicoding_android_pemula

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission_dicoding_android_pemula.databinding.ItemRowFoodBinding

class ListFoodAdapter(private val listFood: ArrayList<FoodData>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {


    class ListViewHolder(var binding: ItemRowFoodBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        var binding = ItemRowFoodBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val foodData = listFood[position]
        Glide.with(holder.itemView.context)
            .load(foodData.image)
            .apply(RequestOptions())
            .into(holder.binding.imgFood)
        holder.binding.tvName.text = foodData.name
        holder.binding.tvRate.text = "rating: ${foodData.rate}"
        holder.itemView.setOnClickListener {
            val item = Intent(context, DetailActivity::class.java)
            item.putExtra(DetailActivity.EXTRA_NAME, foodData.name)
            item.putExtra(DetailActivity.EXTRA_RATE, "rating: ${foodData.rate}")
            item.putExtra(DetailActivity.EXTRA_DESCRIPTION, foodData.description)
            item.putExtra(DetailActivity.EXTRA_IMAGE, foodData.image)
            context.startActivity(item)
        }

    }

    override fun getItemCount(): Int = listFood.size


}