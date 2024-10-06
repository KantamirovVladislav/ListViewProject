package com.example.listviewproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class StateAdapter(context: Context?, val layout: Int, val states: List<State>) :
    ArrayAdapter<State?>(context!!, layout, states as List<State?>) {

        private val inflater: LayoutInflater

        init {
            inflater = LayoutInflater.from(context)
        }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(layout, parent, false)
        val flagView = view.findViewById<ImageView>(R.id.flag)
        val nameView = view.findViewById<TextView>(R.id.name)
        val capitalView = view.findViewById<TextView>(R.id.capital)
        val state = states[position]
        flagView.setImageResource(state.getFlagResource())
        nameView.text = state.getName()
        capitalView.text = state.getCapital()

        return view
    }

}