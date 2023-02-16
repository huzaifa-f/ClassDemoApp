package com.example.testapp1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.testapp1.R


class CharacterDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character_detail, container, false)

        if (arguments != null) {
            val name = requireArguments().getString("name")
            val age = requireArguments().getInt("age")
            val image = requireArguments().getString("image")
            val universe = requireArguments().getString("universe")
            val types = requireArguments().getString("types")
            val iconic = requireArguments().getString("iconic")

            view.findViewById<TextView>(R.id.character_universe).text = universe
            view.findViewById<TextView>(R.id.character_types).text = types
            view.findViewById<TextView>(R.id.character_iconic).text = iconic
        }

        return view
    }
}

