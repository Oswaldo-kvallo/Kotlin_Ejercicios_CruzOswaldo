fun main() {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toInt()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toInt()
    println("Ingresa el tercer número:")
    val num3 = readLine()!!.toInt()
    val numeros = listOf(num1, num2, num3).sorted()
    println("Ordenados: ${numeros[2]}, ${numeros[1]}, ${numeros[0]}")
}
