fun main() {
    println("Ingresa un año:")
    val año = readLine()!!.toInt()
    val bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)
    if (bisiesto) {
        println("$año es un año bisiesto.")
    } else {
        println("$año no es un año bisiesto.")
    }
}
