fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main() {
    println("Ingresa un número:")
    val num = readLine()!!.toInt()
    val resultado = factorial(num)
    println("El factorial de $num es: $resultado")
}
