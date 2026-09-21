package week4fri

fun main() {

    println("--- Requirement 1: Two names ---")
    val favoriteShot: String = "Serve"
    val injuryStatus: String? = null
    println(favoriteShot)
    println(injuryStatus)

    println("--- Requirement 2: A safe call ---")
    println(injuryStatus?.length)

    println("--- Requirement 3: The Elvis operator ---")
    println(injuryStatus?.length ?: 0)

    println("--- Requirement 4: A ?.let block ---")
    val hasNickname: String? = "Manu"
    val noNickname: String? = null
    hasNickname?.let {
        println("Nickname: $it")
    }
    noNickname?.let {
        println("Nickname: $it")
    }
    println("(nothing prints above for the null one — that's expected)")

    println("--- Requirement 5: toIntOrNull() ---")
    val notANumber = "match".toIntOrNull()
    println(notANumber ?: "that wasn't a number")

    println("--- Requirement 6: A listOf ---")
    val gearBag = listOf("Racket", "Grip tape", "Water bottle", "Towel")
    println(gearBag)

    println("--- Requirement 7: A mutableListOf ---")
    val matchDayTasks = mutableListOf("Stretch", "Warm up", "Hydrate")
    matchDayTasks.add("Cool down")
    matchDayTasks.remove("Warm up")
    println(matchDayTasks)
    println("Items: ${matchDayTasks.size}")

    println("--- Requirement 8: A list of numbers ---")
    val setScores = listOf(6, 4, 7, 6, 3)
    println(setScores.sum())
    println(setScores.average())
    println(setScores.filter { it >= 6 })

}