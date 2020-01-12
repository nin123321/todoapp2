package com.example.todoapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()
        damateba.setOnClickListener {
            list.add(Model(saurveliText.text.toString()))
            listview.adapter = MyAdapter(this,R.layout.row,list)
            listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->}
        }
    }
}
