
package vehiculos

class Moto(
    override val marca: String
) : Vehiculo(marca), Conducible {

    override val tipo = "Motocicleta"

    override fun acelerar() {
        velocidadKmh += 30
        println("La motocicleta está acelerando")
    }

    override fun frenar() {
        velocidadKmh -= 15
        println("La motocicleta está frenando")
    }
}
