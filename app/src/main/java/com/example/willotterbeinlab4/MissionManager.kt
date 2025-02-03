package com.example.willotterbeinlab4

class MissionManager {
    fun select(mission: Mission, missionListener: MissionListener) {
        mission.start(missionListener)
    }
    fun selectRepeatable(mission: Repeatable, times: Int, missionListener: MissionListener) {
        mission.repeat(times, missionListener)
    }
}