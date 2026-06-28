package org.example

import org.example.polinomio.Polinomio
import org.example.polinomio.Termino

fun main() {
    val p1 = Polinomio(
        listOf(
            Termino(3.0, 2),
            Termino(5.0, 1),
            Termino(-2.0, 0)
        )
    )
    println("Polinomio 1: $p1")

    val p2 = Polinomio(
        listOf(
            Termino(7.0, 3),
            Termino(0.0, 2),
            Termino(-4.0, 1),
            Termino(1.0, 0)
        )
    )
    println("Polinomio 2: $p2")

    val suma = p1.sumar(p2)
    println("Suma: $suma")
}
