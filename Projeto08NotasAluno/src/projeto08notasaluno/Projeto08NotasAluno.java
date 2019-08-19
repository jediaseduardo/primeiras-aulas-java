/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Solicite ao usuario que informe as
        tres notas ( de 0 a 10 ), e calcule a média e teste 
        as condições:
        1)Se a média for menor ou igual a 5.0 ( reprovado )
        2)Se a média for menor ou igual a 7.0 ( aprovado )
        3)Se a média for menor ou igual a 9.0 ( muito bom )
        4)Se a média for maior que 9.0 ( excelente )
        */
        Scanner entrada =new Scanner(System.in);
        
        float n1,n2,n3;
        
        System.out.println("Digite a Nota1: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite a Nota2: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Digite a Nota3: ");
        n3 = entrada.nextFloat();
        
        float media;
        
        media = (n1+n2+n3)/3;
        System.out.printf("Média: %.2f " , media);
        
        if(media <= 5.0){
            System.out.println(" - REPROVADO");
        }
        else if(media <= 7.0){
             System.out.println(" - APROVADO");
        }
        else if(media <= 9.0){
             System.out.println(" - MUITO BOM");
        }
        else if(media > 9.0){
             System.out.println(" - EXCELENTE"); 
        }
    }
    
}
