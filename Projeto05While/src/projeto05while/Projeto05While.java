/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto05while;

/**
 *
 * @author aluno
 */
public class Projeto05While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int idade = 15;
        while (idade < 18){
            System.out.println("idade: " + idade);
            idade = idade + 1;
        }
        // contagem de 0 a 10
        int cont = 0;
        while(cont <= 10){
            System.out.println("Valor de cont: "+ cont);
            cont = cont + 1;
        }
         // contagem de 10 a 0
        int cont2 = 10;
        while(cont2 >= 0){
            System.out.println("Valor de cont: "+ cont2);
            cont2 = cont2 - 1;
        }
    }
    
}
