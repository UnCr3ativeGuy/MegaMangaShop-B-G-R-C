package org.example.montaine.guillaume.megamangashop


data class Boutique(val Pays: String) {
    fun selectionResidence(Pays: String) : Float{
        return when(Pays){
            "France"->0.2
            "Espagne"->0.182
            "Allemagne"->0.156
            "Royaume-Uni"-> 0.228
            "Belgique" -> 0.17
        }
    }
}

