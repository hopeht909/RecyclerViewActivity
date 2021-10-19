package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var rvMain: RecyclerView
    private lateinit var rvAdapter: RVAdapter
    private lateinit var info: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        info =  arrayListOf()
        rvMain = findViewById(R.id.rvMain)
        rvAdapter = RVAdapter(info)
        val Name = intent.getStringExtra("Name").toString()
        val Num = intent.getStringExtra("Age").toString()
        val Age = intent.getStringExtra("Num").toString()
        val Location = intent.getStringExtra("Location").toString()

        info.add(Name)
        info.add(Num)
        info.add(Age)
        info.add(Location)
        rvMain.adapter = rvAdapter
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter?.notifyDataSetChanged()

    }
}