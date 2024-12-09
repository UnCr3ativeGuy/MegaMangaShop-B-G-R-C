package org.example.montaine.guillaume.megamangashop

class Commande {

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

    fun calculPrix(): Double {
        var total = 0.0
        mangas.forEach {
            total += it.value * it.key.getPrix()
        }
        return total
    }
}