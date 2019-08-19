/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scanner;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto07Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Classe SCANNER deve ser importada de dentro 
        //do pacote java.util.scanner
        //definir um objeto 'entrada' da classe scanner
        //usando a palavra reservada NEW
        //que é responsavel pela instancia de objetos
        //de uma classe JAVA
        
        String nome = "Moraes";
        Scanner entrada =new Scanner(System.in);
        
        // criar um programa que receba entrada de dois valor ( num1  e num2 )
        //e verfique qual o maior e menor numero entre os dois
        
        int num1,num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();
        
        // valor atribuida a num1 e num2
        System.out.println("Valor num1: " + num1);
        System.out.println("Valor num2: " + num2);
        
       if ( num1 > num2){
           System.out.println("O maior numero é: " + num1);
            System.out.println("O menor numero é: " + num2);
        }
       else{
           System.out.println("O maior numero é: " + num2);
            System.out.println("O menor numero é: " + num1);
       }
    }
    
}
