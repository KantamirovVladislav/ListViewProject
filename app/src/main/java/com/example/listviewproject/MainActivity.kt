package com.example.listviewproject

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initCountriesList()
    }

    private fun initCountriesList() {
        val countriesList: ListView = findViewById(R.id.countriesList)
        val states = listOf(
            State("Россия", "Москва", R.drawable.ru),
            State("США", "Вашингтон", R.drawable.us),
            State("Австралия", "Канберра", R.drawable.au),
            State("Япония", "Токио", R.drawable.jp),
            State("Вьетнам", "Ханой", R.drawable.vn)
        )

        val stateAdapter = StateAdapter(this, R.layout.list_item, states)
        countriesList.adapter = stateAdapter

        val itemListener = AdapterView.OnItemClickListener { parent, v, position, id ->
            val selectedState = parent.getItemAtPosition(position) as State
            Toast.makeText(applicationContext, "Был выбран пункт " + selectedState.getName(), Toast.LENGTH_SHORT).show()
        }

        countriesList.onItemClickListener = itemListener
    }
}