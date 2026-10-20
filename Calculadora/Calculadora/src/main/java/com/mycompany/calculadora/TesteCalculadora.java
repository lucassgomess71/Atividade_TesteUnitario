/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int valorUm = 5;
        int valorDois = 5;

        double valorTotal = c.somar(valorUm, valorUm);

        if (valorTotal == 10) {
            System.out.println("Valor correto!");
        } else {
            System.out.println("Valor errado");
        }
    }
}
