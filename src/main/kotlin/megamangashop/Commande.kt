package org.example.montaine.guillaume.megamangashop

class Commande {

    private var mangas = mutableMapOf<String, Int>()

    fun addMangas(manga:String, qte:Int) {
        assert(qte<=0) {"La quantité doit être supérieur à 0"}
        if (mangas.containsKey(manga)) {
            var qteAncienne = mangas.get(manga)!!
            qteAncienne += qte
            mangas.put(manga, qteAncienne)
        } else {
            mangas.put(manga, qte)
        }
    }
}