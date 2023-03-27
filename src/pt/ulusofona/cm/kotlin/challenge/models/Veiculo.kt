package src.pt.ulusofona.cm.kotlin.challenge.models;

import src.pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.util.Date

abstract class Veiculo(open val identificador: String) {
    var posicao: Posicao? = Posicao(0,0)
    var dataDeAquisicao: Date? = Date()

    abstract fun requerCarta(): Boolean
}