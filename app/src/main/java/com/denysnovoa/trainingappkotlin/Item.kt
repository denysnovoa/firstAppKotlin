package com.denysnovoa.trainingappkotlin


fun getItems(): List<Item> {
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/") }
}

data class Item(val id: Long, val title: String, var url: String)


//
//
//val (title, _) = Item("title", "url")
//
//val items = listOf(Item("title1", "url1"), Item("title2", "url2"))
//val emptyList = emptyList<Item>()
//val sorted = items
//        .sortedBy(Item::title)
//        .filter { it.url.isNotEmpty() }
//        .map { Item::title  }
