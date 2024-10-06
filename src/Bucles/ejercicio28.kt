fun esPrimo(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Ingresa un número:")
    val num = readLine()!!.toInt()
    println(if (esPrimo(num)) "$num es primo." else "$num no es primo.")
}
