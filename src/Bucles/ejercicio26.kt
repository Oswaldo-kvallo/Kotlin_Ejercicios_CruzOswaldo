fun main() {
    println("Ingresa un número entero:")
    val num = readLine()!!
    val suma = num.map { it.toString().toInt() }.sum()
    println("La suma de los dígitos es: $suma")
}
