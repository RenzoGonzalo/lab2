package Acuario

class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {


    init {
        println("inicializando acuario")
    }
    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${ancho * largo * alto / 1000} l")
    }

    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
    }

}
