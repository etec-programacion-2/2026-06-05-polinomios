package org.example

import org.example.polinomio.Polinomio
import org.example.polinomio.Termino

/**
 * Punto de entrada de la aplicación.
 * Crea dos polinomios de ejemplo, los muestra y calcula su suma.
 */
fun main() {
    // Primer polinomio: 3x^2 + 5x - 2
    val p1 = Polinomio(
        listOf(
            Termino(3.0, 2),
            Termino(5.0, 1),
            Termino(-2.0, 0)
        )
    )
    println("Polinomio 1: $p1")

    // Segundo polinomio: 7x^3 - 4x + 1
    val p2 = Polinomio(
        listOf(
            Termino(7.0, 3),
            Termino(0.0, 2),  // término nulo, se ignorará en la suma
            Termino(-4.0, 1),
            Termino(1.0, 0)
        )
    )
    println("Polinomio 2: $p2")

    // Suma de los dos polinomios
    val suma1 = p1 + p2
    println("Suma1: $suma1")
    val suma2 = p1.sumar(p2)
    println("Suma2: $suma2")
}
