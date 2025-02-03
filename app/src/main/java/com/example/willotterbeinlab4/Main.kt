package com.example.willotterbeinlab4

/*
* Will Otterbein
* A01372608
* */

fun main() {
    val myDwarf = Dwarf()
    val myElf = Elf()

    val myMissionManager = MissionManager()
    val mission1 = Gather(myDwarf)
    val mission2 = Hunt(myElf)

    myMissionManager.select(mission2, object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("A ${minion.race} started a new hunt")
        }
        override fun missionProgress() {
            println(". . .\n. . .\n. . .")
        }
        override fun missionComplete(minion: Minion, reward: String) {
            println("A ${minion.race} has returned from hunting, and found $reward!\n")
        }
    })

    myMissionManager.selectRepeatable(mission1, 3, object: MissionListener {
        override fun missionStart(minion: Minion) {
            println("A ${minion.race} was sent to gather resources")
        }
        override fun missionProgress() {
            println(". . .\n. . .\n. . .")
        }
        override fun missionComplete(minion: Minion, reward: String) {
            println("A ${minion.race} has returned from gathering, and found $reward!\n")
        }
    })
}
