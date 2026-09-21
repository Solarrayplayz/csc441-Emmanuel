package week4wed

fun main() {
    println("--- Requirement 1: Describe Today ---")
    describeToday()

    println("--- Requirement 2: Favorite Thing ---")
    println(favoriteThing())

    println("--- Requirement 3: Pick one ---")
    println(pickOne(number = 3))

    println("--- Requirement 4: Pick One Short ---")
    println(pickOneShort(1))

    println("--- Requirement 5: Pick With Default ---")
    println(pickWithDefault())
    println(pickWithDefault(name = "Carlo"))

}
    fun describeToday() {
        println("It's Sunday my lock in day" )
    }

    fun favoriteThing(): String {
       return("My favorite thing is tennis")

    }

    fun pickOne(number: Int): String {
        return when (number) {
            1 -> "Forehand"
            2 -> "Backhand"
            3 -> "Serve"
            4 -> "Volley"
            else -> "Tweener"

        }
    }

    fun pickOneShort (number: Int): String = when (number) {
        1 -> "Forehand"
        2 -> "Backhand"
        3 -> "Serve"
        4 -> "Volley"
        else -> "Tweener"
    }

    fun pickWithDefault(number: Int = 3, name: String = "Emmanuel"): String {
        val shot = when (number) {

            1 -> "Forehand"
            2 -> "Backhand"
            3 -> "Serve"
            4 -> "Volley"
            else -> "Tweener"
        }
        return "$name: $shot"
    }