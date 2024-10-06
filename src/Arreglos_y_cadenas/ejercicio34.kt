fun main() {
    println("Ingresa una cadena:")
    val cadena = readLine()!!
    val vocales = "aeiouAEIOU"
    val conteo = cadena.count { it in vocales }
    println("La cadena contiene $conteo vocales.")
}
