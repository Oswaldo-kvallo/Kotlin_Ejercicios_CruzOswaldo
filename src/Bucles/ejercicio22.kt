fun main() {
    println("Ingresa un número n:")
    val n = readLine()!!.toInt()
    val suma = (1..n).sum()
    println("La suma de los primeros $n números es: $suma")
}
