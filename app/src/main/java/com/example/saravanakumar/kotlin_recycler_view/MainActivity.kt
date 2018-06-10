package com.example.saravanakumar.kotlin_recycler_view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        val nameList = ArrayList<String>()
        nameList.add("India");
        nameList.add("Australia");
        nameList.add("South Africa");
        nameList.add("England");
        nameList.add("Pakistan");
        nameList.add("West Indies");
        recyclerView.adapter = RecyclerViewAdapter(nameList)
    }
}
