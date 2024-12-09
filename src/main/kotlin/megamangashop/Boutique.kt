package org.example.montaine.guillaume.megamangashop

import kotlin.math.round

data class Boutique(val pays: String) {

    private var mangas = mutableMapOf<Manga, Int>()

    fun addMangas(nomManga:String, prixManga:Double, qte:Int) {
        assert(qte<=0) {"La quantité doit être supérieur à 0"}
        val manga = Manga(nomManga, prixManga)
        if (mangas.containsKey(manga)) {
            var qteAncienne = mangas.get(manga)!!
            qteAncienne += qte
            mangas.put(manga, qteAncienne)
        } else {
            mangas.put(manga, qte)
        }
    }

    fun getQuantite(manga:Manga): Int {
        assert(mangas.containsKey(manga)) {"Ce manga n'existe pas"}
        return mangas.get(manga)!!
    }

    fun getTVA() : Double {
        return when (pays) {
            "France" -> 0.2
            "Espagne" -> 0.182
            "Allemagne" -> 0.156
            "Royaume-Uni" -> 0.228
            "Belgique" -> 0.17
            else -> 0.0
        }
    }

    fun calculeRemise(prix: Double): Double {
        val remise: Double =when  {
            prix in 150.0 .. 199.0 -> 0.02
            prix in 200.0..299.0 -> 0.03
            prix in 300.0..499.0 -> 0.05
            prix in 500.0..999.0 -> 0.07
            prix > 1000.0 -> 0.1
            else -> 0.0
        }
        return remise
    }

    fun calculerPrixTTC(prix:Double):Double {
        val tva = getTVA()
        return prix * (tva+1)
    }

    fun calculPrix(): Double {
        var total = 0.0
        mangas.forEach {
            total += it.value * it.key.getPrix()
        }
        val totalAvecRemise = total * (1 - calculeRemise(total))
        val totalTTC = calculerPrixTTC(totalAvecRemise)
        return round(totalTTC * 100) / 100
    }
}

