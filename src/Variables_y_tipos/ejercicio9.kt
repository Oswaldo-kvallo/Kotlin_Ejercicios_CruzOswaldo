fun main() {
    println("Ingresa un número:")
    val num = readLine()!!.toInt()
    if (num % 2 == 0) {
        println("El número es par.")
    } else {
        println("El número es impar.")
    }
}
