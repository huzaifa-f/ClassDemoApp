package com.example.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val characters = mutableListOf<Yugioh>()
        for(i in 0..30){
            characters.add(createCharacters())
        }
        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter
    }

    private fun createCharacters() = Yugioh(
    age = 10,
    name = "hue",
    image = R.drawable.baseline_10k_24,
    level = 8,
    id = 0
            )



    }