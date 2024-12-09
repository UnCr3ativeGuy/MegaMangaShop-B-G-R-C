package org.example.montaine.guillaume.megamangashop

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

    fun getTVA() : Double{
        return when(pays){
            "France"->0.2
            "Espagne"->0.182
            "Allemagne"->0.156
            "Royaume-Uni"-> 0.228
            "Belgique" -> 0.17
            else -> 0.0
        }
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
        val totalTTC = calculerPrixTTC(total)
        return totalTTC
    }
}

