
package vehiculos

fun main() {
    println("=== SISTEMA DE VEHÍCULOS ===")

    val auto = Auto("Toyota")
    val moto = Moto("Honda")

    println("\n--- AUTOMÓVIL ---")
    auto.acelerar()
    auto.frenar()
    auto.mostrarInformacion()

    println("\n--- MOTOCICLETA ---")
    moto.acelerar()
    moto.frenar()
    moto.mostrarInformacion()
}
