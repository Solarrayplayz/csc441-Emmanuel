package week3wed

fun main() {

    val name = "Emmanuel" // string name
    println(name)
    val major = "Computer Science" // string major
    println(major)
    val food = "Pizza" // string favorite food
    println(food)

    var currentCSCs = 7
    println("CSC courses taken: $currentCSCs")
    currentCSCs = currentCSCs + 1
    println("CSC courses after CSC441: $currentCSCs")

    val age = 22 // int
    println("$name is $age years old." )

    val hoursPerWeek = 10.0         // Double — training hours per week at Le Moyne
    val isTeamCaptain = true         // Boolean — if I'm team captain

    println("$name is the Team Captain: $isTeamCaptain") // plain $name

    println("With ${hoursPerWeek + 14} hours a week I'd hit the ideal training benchmark.") // arithmetic inside ${ }

    println("Your major, \"$major\", has ${major.length} characters.") // .length inside ${ }


    print("What country will you represent for tennis? ")
    val country = readln()
    println("$country sounds like a great place to represent that pro tennis dream, $name.")
}