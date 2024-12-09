package org.example.montaine.guillaume.megamangashop

class Commande {

    private var mangas = mutableMapOf<String, Int>()

    fun addMangas(manga:String, qte:Int) {
        mangas.put(manga, qte)
    }
}