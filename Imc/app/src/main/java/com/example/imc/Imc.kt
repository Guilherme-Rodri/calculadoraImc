package com.example.imc

class Imc {

    var peso = 0.0
    var altura = 0.0

    fun calcularImc(): Double{
        return peso /  (altura * altura)
    }

}