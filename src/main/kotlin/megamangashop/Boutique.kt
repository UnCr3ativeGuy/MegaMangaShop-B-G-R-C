package org.example.montaine.guillaume.megamangashop

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



    fun calculeTaxe(double: prix,string: Pays) {

    }
}

