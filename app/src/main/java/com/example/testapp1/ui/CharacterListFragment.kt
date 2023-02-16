package com.example.testapp1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp1.CharacterAdapter
import com.example.testapp1.R
import com.example.testapp1.Yugioh
import kotlin.random.Random

class CharacterListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Yugioh>()
        val types = mutableListOf("dragons", "magicians", "archers", "fiend")
        val iconic = mutableListOf("blue eyes", "red eyes", "galaxy eyes")
        val genders = mutableListOf("Male", "Female", "Pickle", "Squanch", "01010")
        val characterLocations = mutableListOf(
            "Earth",
            "Citadel of Ricks",
            "Interdimensional Cable",
            "Random Dimension"
        )
        val nameMods = mutableListOf("Pickle", "", "Smart", "Fused", "Big Arm")
        val characterNames = mutableListOf("Rick", "Morty", "Summer", "Jerry", "Beth")

        for (i in 0..30) {
            characters.add(
                createCharacter(
                    "${nameMods.random()} ${characterNames.random()}".trimStart(),
                    characterLocations.random(),
                    genders.random(),
                    i,
                    types.random(),
                    iconic.random()

                )
            )
        }

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter

        return view
    }

    private fun createCharacter(
        name: String,
        location: String,
        gender: String,
        id: Int,
        types: String,
        iconic: String

    ) = Yugioh(
        name = name,
        age = Random.nextInt(10, 99),
        image = "https://rickandmortyapi.com/api/character/avatar/291.jpeg",
        gender = gender,
        universe = location,
        id = id,
        relation = listOf(),
        types = types,
        iconic = iconic
    )
}
