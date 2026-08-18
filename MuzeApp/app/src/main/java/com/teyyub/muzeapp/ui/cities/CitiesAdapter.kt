package com.teyyub.muzeapp.ui.cities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.teyyub.muzeapp.data.model.City
import com.teyyub.muzeapp.databinding.ItemCityBinding

class CitiesAdapter(
    private val onCityClick: (City) -> Unit
) : ListAdapter<City, CitiesAdapter.CityViewHolder>(DIFF_CALLBACK) {

    inner class CityViewHolder(private val binding: ItemCityBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(city: City) {
            binding.tvCityName.text = city.name
            binding.root.setOnClickListener { onCityClick(city) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val binding = ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<City>() {
            override fun areItemsTheSame(oldItem: City, newItem: City) =
                oldItem.slug == newItem.slug

            override fun areContentsTheSame(oldItem: City, newItem: City) =
                oldItem == newItem
        }
    }
}
