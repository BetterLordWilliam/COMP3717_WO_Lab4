package com.example.willotterbeinlab4

class Hunt(minion: Minion) : Mission(minion) {
    override fun determineMissionTime(): Int {
        return (minion.baseHealth + minion.baseSpeed) * (0..4).random()
    }

    override fun reward(time: Int): String {
        val reward = when (time) {
            in 11..20 -> "mouse"
            in 21..30 -> "fox"
            in 31..50 -> "buffalo"
            else -> "nothing"
        }
        return reward
    }
}