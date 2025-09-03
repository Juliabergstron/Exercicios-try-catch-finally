/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradetarifasdetransporte;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class CalculadoraDeTarifasDeTransporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        
          System.out.println("Escolha o seu meio de transporte:");
          System.out.println("Digite 1 para Ônibus Urbano (R$ 4,40)");
          System.out.println("Digite 2 para Metrô (R$ 5,00)");
          System.out.println("Digite 3 para Trem Intermunicipal (R$ 6,50)");
          System.out.println("Digite 4 para Ônibus Rodoviário (R$ 12,00)");
          System.out.print("Digite a sua escolha: ");
        
        int escolha = scanner.nextInt();
        
          System.out.println("Digite a quantidade:");

        int quantidade = scanner.nextInt();
        
        double preco;
        double total;
        
           switch (escolha) {
                case 1:
                    preco= 4.40;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Ônibus Urbano.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                case 2:
                    preco = 5.00;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Metrô.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                case 3:
                    preco = 6.50;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Trem Intermunicipal.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                case 4:
                    preco = 12.00;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Ônibus Rodoviário.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 4."); 
        }}
           
           catch (Exception e) {
            System.out.println("Valor inválido!");

    }
        
           finally {
            System.out.println("Programa encerrado.");
            scanner.close();}
    }
}
