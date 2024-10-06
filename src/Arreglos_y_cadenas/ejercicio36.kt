fun main() {
    println("Ingresa una cadena:")
    val cadena = readLine()!!
    val sinEspacios = cadena.replace(" ", "")
    println("La cadena sin espacios es: $sinEspacios")
}
