/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadordefaixaetaria;

/**
 *
 * @author user
 */
//Primeiro eu importo o Scanner para ler as variáveis
import java.util.Scanner;
public class ClassificadorDeFaixaEtaria {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//Aqui eu abri o try para não dar erro 
        try {
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();
// aqui eu mostro que no começo, essa variável terá o valor 0.
            int faixa = 0;

           
            if (idade >= 0) { // Primeiro eu checo se não é negativo
                if (idade <= 12) {
                    faixa = 1; // nesse caso é uma criança
                } else if (idade <= 20) {
                    faixa = 2; // nesse caso é um adolescente
                } else if (idade <= 59) {
                    faixa = 3; // nesse caso é  um adulto
                } else {
                    faixa = 4; // nesse caso é um idoso
                }
            } else {
 //caso contrário aparecerá
                System.out.println("Esse valor é inválido.");
            }
// acrescentei o switch para mostrar o resultado
            switch (faixa) {
                case 1:
                    System.out.println("Você é uma criança.");
                    break;
                case 2:
                    System.out.println("Você é um adolescente.");
                    break;
                case 3:
                    System.out.println("Você é um adulto.");
                    break;
                case 4:
                    System.out.println("Você é um idoso.");
                    break;
            }
//acrecentei o catch para não quebra o código caso seja colocado outro caractere.
        } catch (Exception e) {
            System.out.println("Valor inválido! Digite apenas números.");
        } 
//fechando o programa mostrando uma menssagem
        finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }

    }
}
