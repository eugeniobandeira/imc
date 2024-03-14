package com.example.imc

import androidx.compose.ui.graphics.Color

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double): Double {
    return pesoUsuario / (alturaUsuario / 100)
}

fun obterStatusImc(imcStatusUsuario: Double): String {
    return if(imcStatusUsuario < 18.5) {
        "Abaixo do peso"
    } else if (imcStatusUsuario >= 18.5 && imcStatusUsuario < 25.0) {
        "Peso ideal"
    } else if (imcStatusUsuario >= 25.0 && imcStatusUsuario < 30.0) {
        "Levemente acima do peso"
    } else if (imcStatusUsuario >= 30.0 && imcStatusUsuario < 35.0) {
        "Obesidade Grau I"
    } else if (imcStatusUsuario >= 35.0 && imcStatusUsuario < 40.0) {
        "Obesidade Grau II"
    } else {
        "Obesidade Grau III"
    }
}

fun corBackgroundCard(imcStatusUsuario: Double): String {
    var pesoIdeal = "0xff329f6b";
    var levementeAcimaDoPeso = "0xFFD5AE3A";
    var foraDoPeso = "0xFFC20A0A";

    return if(imcStatusUsuario > 18.5 && imcStatusUsuario < 25.0) {
        pesoIdeal
    } else if (imcStatusUsuario >= 25.0 && imcStatusUsuario < 30.0) {
        levementeAcimaDoPeso
    } else {
        foraDoPeso
    }
}