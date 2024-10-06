package com.example.listviewproject

class State(private var name: String?,private var capital: String?,private var flagResource:Int) {

    fun getName(): String? {
        return name
    }

    fun setName(name: String?):Unit {
        this.name = name
    }

    fun getCapital(): String? {
        return capital
    }

    fun setCapital(capital: String?):Unit {
        if (capital != null) {
            this.capital = capital
        }
    }

    fun getFlagResource(): Int {
        return flagResource
    }

    fun setFlagResource(flagResource: Int) {
        this.flagResource = flagResource
    }
}
