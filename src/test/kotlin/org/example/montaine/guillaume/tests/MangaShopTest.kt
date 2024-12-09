
package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec
import org.example.montaine.guillaume.megamangashop.TicketDeCaisse

class MangaShopTest: BehaviorSpec({
    context("Je veux verifier la TVA quand le client selectionne la france") {
        given("Le client selection le pays") {
            val ticket = TicketDeCaisse()

            When("Le client selection son pays de résidence la France") {
                var command = ticket.selectionPays("France")
            }
            then("L'affichage de la TVA du pays correspondante") {
                command shouldBe 0.2
            }
            When("Le client selection son pays de résidence Espagne") {
                var command = ticket.selectionPays("Espagne")
            }
            then("L'affichage de la TVA du pays correspondante") {
                command shouldBe 0.182
            }
            When("Le client selection son pays de résidence Allemagne") {
                var command = ticket.selectionPays("Allemagne")
            }
            then("L'affichage de la TVA du pays correspondante") {
                command shouldBe 0.156
            }
            When("Le client selection son pays de résidence Royaume-Uni") {
                var command = ticket.selectionPays("Royaume-Uni")
            }
            then("L'affichage de la TVA du pays correspondante") {
                command shouldBe 0.228
            }
            When("Le client selection son pays de résidence Belgique") {
                var command = ticket.selectionPays("Belgique")
            }
            then("L'affichage de la TVA du pays correspondante") {
                command shouldBe 0.17
            }
        }
    }
})




















