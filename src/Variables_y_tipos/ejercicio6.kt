fun main() {
    println("Ingresa un número:")
    val input = readLine()
    try {
        val numero = input!!.toInt()
        println("El número es: $numero")
    } catch (e: NumberFormatException) {
        println("Error: Entrada no válida.")
    }
}
