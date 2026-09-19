package week3fri

    fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    val packingList = mutableListOf("Passport", "Racket", "Charger", "Sneakers")

    for (item in packingList) {
        println(item)
    }

    packingList.forEachIndexed { index, item ->
        println("$index is $item")
    }

    for (i in 0 until packingList.size) {
        println("$i: ${packingList[i]}")
    }

    val dayNumber = 3
    val message = when (dayNumber) {

            1 -> "Monday - 1st day of summer vacation"
            2 -> "Tuesday - 2nd day of summer vacation"
            3 -> "Wednesday - 3rd day of summer vacation"
            4 -> "Thursday - 4th day of summer vacation"
            5 -> "Friday - 5th day of summer vacation"
            6 -> "Saturday - 6th day of summer vacation"
            7 -> "Last day of summer vacation"
            else -> "Vacation is over :("
            }

            println(message)

    val spent = 450
    val budgetStatus = if (spent > 400) "Trip is over budget" else "Trip is under budget"
    println(budgetStatus)

}