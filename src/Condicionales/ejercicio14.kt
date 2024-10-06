fun main() {
    println("¿Cuál es tu edad?")
    val edad = readLine()!!.toInt()
    if (edad >= 18) {
        println("Puedes votar.")
    } else {
        println("No puedes votar.")
    }
}
