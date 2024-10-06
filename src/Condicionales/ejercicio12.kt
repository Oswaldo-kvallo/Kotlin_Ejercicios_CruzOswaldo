fun main() {
    println("Ingresa un número:")
    val num = readLine()!!.toInt()
    when {
        num > 0 -> println("El número es positivo.")
        num < 0 -> println("El número es negativo.")
        else -> println("El número es cero.")
    }
}
