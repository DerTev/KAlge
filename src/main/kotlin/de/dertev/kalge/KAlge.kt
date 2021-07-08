package de.dertev.kalge

val alge: Array<String> = arrayOf("Alge 2", "Alge 3", "Alge 4", "Alge 5", "Alge 6")
val megaalge: Array<String> = arrayOf("Grün", "Rot", "Blau", "Gelb")
val color: Array<String> = arrayOf("Grün", "Rot")

fun main() {
    println("__  ___      ___       __        _______  _______")
    println("|  |/  /     /   \\     |  |      /  _____||   ____|")
    println("|  '  /     /  ^  \\    |  |     |  |  __  |  |__   ")
    println("|    <     /  /_\\  \\   |  |     |  | |_ | |   __|")
    println("|  .  \\   /  _____  \\  |  `----.|  |__| | |  |____")
    println("|__|\\__\\ /__/     \\__\\ |_______| \\______| |_______|")
    println("")
    println("")
    println("Commands: alge, megaalge, color")
    while (true) {
        val input: String = readLine().toString()
        when(input) {
            "alge" -> println(alge.random())
            "color" -> println(color.random())
            "megaalge" -> println(megaalge.random())
            else -> println("Command not found! \nCommands: alge, megaalge, color")
        }
    }
}