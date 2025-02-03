package com.example.willotterbeinlab4

class Gather(minion: Minion) : Mission(minion), Repeatable {
    override fun determineMissionTime(): Int {
        return (minion.backpackSize + minion.baseSpeed) * (0..5).random()
    }

    override fun reward(time: Int): String {
        val reward = when (time) {
            in 10..21 -> "bronze"
            in 22..33 -> "silver"
            in 34..50 -> "gold"
            else -> "nothing"
        }
        return reward
    }

    override fun repeat(times: Int, missionListener: MissionListener) {
        for (i in 1..times) {
            start(missionListener)
        }
    }
}