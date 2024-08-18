// AnimalesAcuario.kt
package acuario

// Definir una interfaz AccionAnimal con métodos comunes
interface AccionAnimal {
    fun comer()
    fun moverse()
}

// Clase abstracta AnimalMarino
abstract class AnimalMarino {
    abstract val especie: String
    abstract val habitat: String
}

// Clase Delfin que hereda de AnimalMarino e implementa AccionAnimal
class Delfin : AnimalMarino(), AccionAnimal {
    override val especie: String = "Delfín"
    override val habitat: String = "Océano"

    override fun comer() {
        println("$especie: comer peces pequeños")
    }

    override fun moverse() {
        println("$especie: nadar rápidamente en el $habitat")
    }
}

// Clase Medusa que hereda de AnimalMarino e implementa AccionAnimal
class Medusa : AnimalMarino(), AccionAnimal {
    override val especie: String = "Medusa"
    override val habitat: String = "Océano"

    override fun comer() {
        println("$especie: absorber nutrientes del agua")
    }

    override fun moverse() {
        println("$especie: flotar lentamente en el $habitat")
    }
}

// Clase TortugaMarina que hereda de AnimalMarino e implementa AccionAnimal
class TortugaMarina : AnimalMarino(), AccionAnimal {
    override val especie: String = "Tortuga Marina"
    override val habitat: String = "Océano"

    override fun comer() {
        println("$especie: comer algas y medusas")
    }

    override fun moverse() {
        println("$especie: nadar lentamente en el $habitat")
    }
}
