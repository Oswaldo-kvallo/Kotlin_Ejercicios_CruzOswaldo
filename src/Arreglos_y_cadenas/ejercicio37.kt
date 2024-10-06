fun main() {
    println("Ingresa una palabra:")
    val palabra = readLine()!!
    val esPalindromo = palabra == palabra.reversed()
    println(if (esPalindromo) "$palabra es un palíndromo." else "$palabra no es un palíndromo.")
}
