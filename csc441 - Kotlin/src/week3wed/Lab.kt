package week3wed

fun main() {

    val name = "Emmanuel"
    println(name)
    val major = "Computer Science"
    println(major)
    val food = "Pizza"
    println(food)

    var currentCSCs = 7
    val newCSCs = currentCSCs + 1
    println("CSC courses taken: $currentCSCs")
    println("CSC courses after CSC441: $newCSCs")

    val age = 22
    println("$name is $age years old." )

    val hoursPerWeek = 10          // Double — training hours per week at Le Moyne
    val isTeamCaptain = true         // Boolean — whether you're team captain


    println("$name is the team captain.") // plain $name

    println("With ${hoursPerWeek + 14} hours a week I'd hit the ideal training benchmark.") // arithmetic inside ${ }

    println("Your major, \"$major\", has ${major.length} characters.") // .length inside ${ }


    print("What country will you represent for tennis? ")
    val country = readln()
    println("$country sounds like a great place to represent that pro tennis dream, $name.")
}