package com.denysnovoa.trainingappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val (title, _) = Item("title", "url")

        val items = listOf(Item("title1", "url1"), Item("title2", "url2"))
        val emptyList = emptyList<Item>()
        val sorted = items
                .sortedBy(Item::title)
                .filter { it.url.isNotEmpty() }
                .map { Item::title  }


        button.setOnClickListener {
            toast(editText.text)
        }
    }

}
