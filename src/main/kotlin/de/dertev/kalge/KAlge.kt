package de.dertev.kalge

fun main() {
    println("__  ___      ___       __        _______  _______")
    println("|  |/  /     /   \\     |  |      /  _____||   ____|")
    println("|  '  /     /  ^  \\    |  |     |  |  __  |  |__   ")
    println("|    <     /  /_\\  \\   |  |     |  | |_ | |   __|")
    println("|  .  \\   /  _____  \\  |  `----.|  |__| | |  |____")
    println("|__|\\__\\ /__/     \\__\\ |_______| \\______| |_______|   By DerTev")
    println("")
    println("")
    println("Commands: alge, megaalge, color")
    when(readLine()) {
        "alge" -> println(randomAlge())
        "color" -> println(randomColor())
        "megaalge" -> println(randomMegaAlge())
        else -> println("Command not found! \nCommands: alge, megaalge, color")
    }
}

fun randomAlge(): String {
    return arrayOf("Alge 2", "Alge 3", "Alge 4", "Alge 5", "Alge 6").random()
}

fun randomColor(): String {
    return arrayOf("Grün", "Rot").random()
}

fun randomMegaAlge(): String {
    return arrayOf("Grün", "Rot", "Blau", "Gelb").random()
}