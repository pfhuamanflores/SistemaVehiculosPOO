
package vehiculos

class Auto(
    override val marca: String,
    val puertas: Int = 4
) : Vehiculo(marca), Conducible {

    override val tipo = "Automóvil"

    override fun acelerar() {
        velocidadKmh += 20
        println("El automóvil está acelerando")
    }

    override fun frenar() {
        velocidadKmh -= 10
        println("El automóvil está frenando")
    }
}

