fun multiplicar(a: Int, b: Int): Int {
    var resultado = 0
    for (i in 1..b) {
        resultado += a
    }
    return resultado
}

fun main() {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toInt()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toInt()
    val resultado = multiplicar(num1, num2)
    println("El resultado de la multiplicación es: $resultado")
}
