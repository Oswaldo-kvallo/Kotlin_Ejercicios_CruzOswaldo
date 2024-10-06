fun main() {
    println("Ingresa la temperatura en grados Celsius:")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = celsius * 9 / 5 + 32
    println("La temperatura en Fahrenheit es: $fahrenheit")
}
