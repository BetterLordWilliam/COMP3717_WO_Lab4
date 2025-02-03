package com.example.willotterbeinlab4

/*
* Will Otterbein
* A01372608
* */

//val RACES_STRINGS = mapOf(
//    1 to "Dwarf",
//    2 to "Elf"
//)
//val MISSION_STRINGS = mapOf(
//    1 to "Gather",
//    2 to "Hunt"
//)
//
//fun selectRace(): Int {
//    while(true) {
//        println("Select the race for the mission")
//        for (i in RACES_STRINGS.keys) {
//            println("${i}:\t${RACES_STRINGS[i]}")
//        }
//        try {
//            print("Type your selection ")
//            val selection: Int = readln().toInt()
//            if (selection !in RACES_STRINGS.keys)
//                throw NumberFormatException("Not in valid range 1..2")
//            return selection
//        } catch (e: NumberFormatException) {
//            println("Invalid input: ${e.message}")
//        }
//    }
//}

fun selectMission(): Int {
    return 0
}

fun main() {
    val myDwarf = Dwarf()
    val myElf = Elf()

    val myMissionManager = MissionManager()
    val mission1 = Gather(myDwarf)
    val mission2 = Hunt(myElf)

    // selectRace()

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
