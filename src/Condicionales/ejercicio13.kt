fun main() {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toDouble()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toDouble()
    println("Ingresa la operación (+, -, *, /):")
    val operacion = readLine()
    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Operación no válida."
    }
    println("El resultado es: $resultado")
}
