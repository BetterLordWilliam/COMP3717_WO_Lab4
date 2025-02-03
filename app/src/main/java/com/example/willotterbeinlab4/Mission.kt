package com.example.willotterbeinlab4

abstract class Mission(
    protected val minion: Minion
) {
    init {
        println(minion.catchphrase)
    }

    fun start(missionListener: MissionListener) {
        val missionTime = determineMissionTime()
        val reward = reward(missionTime)

        missionListener.missionStart(minion)
        missionListener.missionProgress()
        Thread.sleep(missionTime.toLong())
        missionListener.missionComplete(minion, reward)
    }

    protected abstract fun determineMissionTime(): Int
    protected abstract fun reward(time: Int): String

}