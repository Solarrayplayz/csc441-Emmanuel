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
    val dayName = when (dayNumber) {
        1 -> "Monday" -> println("1st day of vacation")
        2 -> "Tuesday" -> println("2ndst day of vacation")
        3 -> "Wednesday" -> println("3rdst day of vacation")
        4 -> "Thursday" -> println("4th day of vacation")
        5 -> "Friday" -> println("5th day of vacation")
        6 -> "Saturday" -> println("6th day of vacation")
        7 -> "Sunday" -> println("Last day of vacation")
        else -> println("vacation is over :(")
    }
    println(dayName)

    val spent = 450
    val budgetStatus = if (spent > 400) "Trip is over budget" else "Trip is under budget"
    println(budgetStatus)


}