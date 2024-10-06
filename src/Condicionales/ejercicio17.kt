fun main() {
    println("Ingresa el precio del producto:")
    val precio = readLine()!!.toDouble()
    val precioFinal = if (precio > 1000) precio * 0.8 else precio
    println("El precio final es: $precioFinal")
}
