
package vehiculos

abstract class Vehiculo(
    open val marca: String,
    open var velocidad: Int = 0
) {
    abstract val tipo: String

    init {
        println("Vehículo creado: $marca")
    }

    constructor(marca: String) : this(marca, 0)

    open var velocidadKmh: Int
        get() = velocidad
        set(valor) {
            velocidad = valor.coerceAtLeast(0)
        }

    fun mostrarInformacion() {
        println("Tipo: $tipo")
        println("Marca: $marca")
        println("Velocidad: $velocidadKmh km/h")
    }
}

interface Conducible {
    fun acelerar()
    fun frenar()
}
