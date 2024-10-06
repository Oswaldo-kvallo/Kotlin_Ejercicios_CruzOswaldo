fun main() {
    println("Ingresa un número del 1 al 7:")
    val dia = readLine()!!.toInt()
    val dias = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    if (dia in 1..7) {
        println("El día de la semana es: ${dias[dia - 1]}")
    } else {
        println("Número inválido. Debe estar entre 1 y 7.")
    }
}
