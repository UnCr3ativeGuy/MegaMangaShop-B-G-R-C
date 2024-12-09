
package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.example.montaine.guillaume.megamangashop.Boutique

class MangaShopTest: BehaviorSpec({
    context("Je veux verifier la TVA quand le client selectionne la france") {
        given("Le client selection le pays") {
            val boutique_france = Boutique("France")
            val boutique_espagne = Boutique("Espagne")
            val boutique_allemagne = Boutique("Allemagne")
            val boutique_royaume_uni = Boutique("Royaume-Uni")
            val boutique_belgique = Boutique("Belgique")
            When("Le client selection son pays de résidence la France") {
                var command = boutique_france.getTVA()
            }
            then("L'affichage de la TVA du pays correspondante") {
                boutique_france.getTVA() shouldBe 1.2
            }
            When("Le client selection son pays de résidence Espagne") {
                var command = boutique_espagne.getTVA()
            }
            then("L'affichage de la TVA du pays correspondante") {
                boutique_espagne.getTVA() shouldBe 1.182
            }
            When("Le client selection son pays de résidence Allemagne") {
                var command = boutique_allemagne.getTVA()
            }
            then("L'affichage de la TVA du pays correspondante") {
                boutique_allemagne.getTVA() shouldBe 0.156
            }
            When("Le client selection son pays de résidence Royaume-Uni") {
                var command = boutique_royaume_uni.getTVA()
            }
            then("L'affichage de la TVA du pays correspondante") {
                boutique_royaume_uni shouldBe 0.228
            }
            When("Le client selection son pays de résidence Belgique") {
                var command = boutique_belgique.getTVA()
            }
            then("L'affichage de la TVA du pays correspondante") {
                boutique_belgique.getTVA() shouldBe 0.17
            }
        }
    }
})




















