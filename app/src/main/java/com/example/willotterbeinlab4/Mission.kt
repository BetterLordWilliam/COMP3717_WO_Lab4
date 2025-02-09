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
        for (i in 0..2) {
            missionListener.missionProgress()
            Thread.sleep(1000)
        }
        missionListener.missionComplete(minion, reward)
    }

    protected abstract fun determineMissionTime(): Int
    protected abstract fun reward(time: Int): String

}