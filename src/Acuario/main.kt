// main.kt
import acuario.Delfin
import acuario.Medusa
import acuario.TortugaMarina

fun gestionarAnimales() {
    val delfin = Delfin()
    val medusa = Medusa()
    val tortugaMarina = TortugaMarina()

    val animales = listOf(delfin, medusa, tortugaMarina)

    for (animal in animales) {
        println("Especie: ${animal.especie}")
        animal.comer()
        animal.moverse()
        println()
    }
}

fun main() {
    gestionarAnimales()
}
