package de.dertev.kalge

fun query() {
    println()
    print("Enter your command: ")
    when(readLine()) {
        "alge" -> println(randomAlge())
        "color" -> println(randomColor())
        "megaalge" -> println(randomMegaAlge())
        "exit" -> return
        else -> println("Command not found! \nCommands: alge, megaalge, color, exit")
    }
    query()
}

fun main() {
    println("__  ___      ___       __        _______  _______")
    println("|  |/  /     /   \\     |  |      /  _____||   ____|")
    println("|  '  /     /  ^  \\    |  |     |  |  __  |  |__   ")
    println("|    <     /  /_\\  \\   |  |     |  | |_ | |   __|")
    println("|  .  \\   /  _____  \\  |  `----.|  |__| | |  |____")
    println("|__|\\__\\ /__/     \\__\\ |_______| \\______| |_______|   By DerTev")
    println()
    println("Commands: alge, megaalge, color, exit")
    query()
}

fun randomAlge(): String { /* generates a random alge from 2 to 6 */
    return arrayOf("Alge 2", "Alge 3", "Alge 4", "Alge 5", "Alge 6").random()
}

fun randomColor(): String { /* generates a random color (green, red) */
    return arrayOf("Grün", "Rot").random()
}

fun randomMegaAlge(): String { /* generates a random color (green, red, blue, yellow) */
    return arrayOf("Grün", "Rot", "Blau", "Gelb").random()
}