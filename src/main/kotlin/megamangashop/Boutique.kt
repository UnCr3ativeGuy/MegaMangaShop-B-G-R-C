package org.example.montaine.guillaume.megamangashop

import kotlin.math.round

data class Boutique(val Pays: String) {

    fun calculeRemise(prix: Double): Double {
        val remise: Double =when  {
            prix in 150.0 .. 199.0 -> 2.0
            prix in 200.0..299.0 -> 3.0
            prix in 300.0..499.0 -> 5.0
            prix in 500.0..999.0 -> 7.0
            prix > 1000.0 -> 10.0
            else -> 0.0 // Pas de remise
        }
        return remise
    }
    fun calculePrixTot(prix: Double,Pays:String,remise:Double): Double {

        val taxe: Double = when (Pays) {
            "France" -> 1.2
            "Espagne"-> 1.182
            "Allemagne"->1.156
            "Royaume-Uni"->1.228
            "Belgique"-> 1.17
            else -> 0.0
        }
        val prixTot = (prix * (1 - remise / 100)) * taxe

        return round(prixTot * 100) / 100
    }
}

