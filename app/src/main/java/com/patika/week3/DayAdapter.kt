package com.patika.week3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.patika.week3.databinding.ItemDayBinding

class DayAdapter(private var day: List<Day>) : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {


    inner class DayViewHolder(val binding: ItemDayBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemDayBinding.inflate(layoutInflater,parent,false)
        return DayViewHolder(view)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        holder.binding.apply {
            textViewDay.text = day[position].date
        }
    }

    override fun getItemCount(): Int {
        return day.size
    }
}