package org.example.polinomio

/**
 * Representa un polinomio como una lista de términos.
 * Provee operaciones como suma y representación en cadena.
 *
 * @property terminos Lista de objetos [Termino] que conforman el polinomio.
 */
class Polinomio(val terminos: List<Termino>) {

    /**
     * Suma este polinomio con otro, combinando términos del mismo exponente.
     *
     * @param otro El polinomio a sumar.
     * @return Un nuevo [Polinomio] resultado de la suma.
     */
    fun sumar(otro: Polinomio): Polinomio {
        val agrupados = (this.terminos + otro.terminos)
            .filter { it.coeficiente != 0.0 }
            .groupBy { it.exponente }
            .map { (exp, terms) ->
                val coefSum = terms.sumOf { it.coeficiente }
                Termino(coefSum, exp)
            }
            .filter { it.coeficiente != 0.0 }

        return Polinomio(agrupados)
    }

    /**
     * Operador + para sumar dos polinomios.
     * Delega en [sumar].
     */
    operator fun plus(otro: Polinomio): Polinomio = sumar(otro)

    /**
     * Representación en cadena del polinomio, ordenando los términos
     * de mayor a menor exponente, e.g. "3x^2 + 5x - 2".
     */
    override fun toString(): String {
        if (terminos.isEmpty()) return "0"

        return terminos
            .filter { it.coeficiente != 0.0 }
            .sortedByDescending { it.exponente }
            .joinToString(separator = " + ") { it.toString() }
            .replace(" + -", " - ")
    }
}
