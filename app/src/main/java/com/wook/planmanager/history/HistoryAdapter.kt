package com.wook.planmanager.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wook.planmanager.R
import kotlinx.android.synthetic.main.item_history.view.*

class HistoryAdapter: RecyclerView.Adapter<HistoryAdapter.ItemViewHolder>() {
    private val historys = ArrayList<History>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryAdapter.ItemViewHolder, position: Int) {
        holder.bind(historys[position])
    }

    override fun getItemCount(): Int {
        return historys.size
    }

    fun addHistory(history: History){
        this.historys.add(history)
    }

    fun addHistorys(historys: ArrayList<History>){
        this.historys.addAll(historys)
        notifyDataSetChanged()
    }
    inner class ItemViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(history: History) {
            itemView.item_history.text = history.history
        }
    }
}