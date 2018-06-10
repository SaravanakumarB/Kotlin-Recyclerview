package com.example.saravanakumar.kotlin_recycler_view

/**
 * Created by saravanakumar on 08/02/18.
 */
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.adapter_recycler_view.view.*

class RecyclerViewAdapter(val myName: ArrayList<String>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerViewAdapter.ViewHolder{
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_recycler_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder?, position: Int) {
        holder!!.bindItems(myName[position])
    }

    override fun getItemCount(): Int {
        return myName.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(name : String) = with(itemView)  {
            itemView.tv_name.text = name
        }
    }
}