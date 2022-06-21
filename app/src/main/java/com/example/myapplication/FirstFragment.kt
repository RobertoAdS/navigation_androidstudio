package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button1: Button = view.findViewById(R.id.paraTela2)
        button1.setOnClickListener {
            view.findNavController().navigate(R.id.action_tela1_to_secondFragment)
        }

        val button2: Button = view.findViewById(R.id.paraTela3)
        button2.setOnClickListener {
            view.findNavController().navigate(R.id.action_tela1_to_thirdFragment)
        }


        return view
    }


}
