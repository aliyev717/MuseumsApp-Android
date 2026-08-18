package com.teyyub.muzeapp.ui.museums

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.teyyub.muzeapp.data.model.Museum
import com.teyyub.muzeapp.databinding.ItemMuseumBinding

class MuseumsAdapter : ListAdapter<Museum, MuseumsAdapter.MuseumViewHolder>(DIFF_CALLBACK) {

    inner class MuseumViewHolder(private val binding: ItemMuseumBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(museum: Museum) {
            binding.tvMuseumName.text = museum.name ?: "-"
            binding.tvMuseumAddress.text = museum.address ?: ""
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuseumViewHolder {
        val binding = ItemMuseumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MuseumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MuseumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Museum>() {
            override fun areItemsTheSame(oldItem: Museum, newItem: Museum) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Museum, newItem: Museum) =
                oldItem == newItem
        }
    }
}
