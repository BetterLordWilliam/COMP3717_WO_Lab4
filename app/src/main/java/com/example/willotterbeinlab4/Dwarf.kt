package com.example.willotterbeinlab4

class Dwarf : Minion() {
    override val race: String = "Dwarf"
    override val baseHealth: Int = 8
    override val baseSpeed: Int = 2
    override val backpackSize: Int = 8
    override val catchphrase: String = "Where's my trusty old hammer?"
}