package com.egco428.searchdialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.core.SearchResultListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchButton.setOnClickListener {
            SimpleSearchDialogCompat(this@MainActivity,"Search", "What are you looking for",null,initData(), SearchResultListener{
                baseSearchDialogCompat, item, position ->
                Toast.makeText(this@MainActivity, item.title, Toast.LENGTH_LONG).show()
                baseSearchDialogCompat.dismiss()
            }).show()
        }
    }

    private fun initData():ArrayList<SearchModel>{ //ex from other lab ArrayList<String>
        val items = ArrayList<SearchModel>()
        items.add(SearchModel("Wookie"))
        items.add(SearchModel("Dart Vader"))
        items.add(SearchModel("Luke Skywalker"))
        items.add(SearchModel("Master Yoda"))
        items.add(SearchModel("C3P0"))
        items.add(SearchModel("R2D2"))


        return items

    }
}
