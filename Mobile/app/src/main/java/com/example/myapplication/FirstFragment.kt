package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private var factList: ArrayList<String> = arrayListOf("My name is Tom", "I have pets", " I have a dog", "I have 2 cats", "I am male", "I like pizza", "I like apples", "I like bananas", "I'm redoing this", "I like swimming")
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("STATE", lifecycle.toString())
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("STATE", lifecycle.toString())

        binding.buttonFirst.setOnClickListener {
            view.findViewById<TextView>(R.id.displayFact).text = factList.random()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}