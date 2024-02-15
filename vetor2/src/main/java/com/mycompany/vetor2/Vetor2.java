

package com.mycompany.vetor2;

import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {
      
       Scanner ler = new Scanner (System.in);
       
       int n = 2; //tamanho do vetor
       int v1 [] = new int [n];//declaração do vetor "v"
       int v2 [] = new int [n];//declaração do vetor "v"
       int v3 [] = new int [n];//declaração do vetor "v"
       int i; //indice ou posição
       int soma=0;
       
       //entrada de dados do primeiro vetor 
       for (i=0; i<n; i++) {
           System.out.printf("Informe o valor do vetor 1: ", (i+1), n);
          //System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
           v1[i] = ler.nextInt();
         
       }
        //entrada de dados do segundo vetor 
        for (i=0; i<n; i++) {
           System.out.printf("Informe o valor do vetor 2: ", (i+1), n);
          //System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
           v2[i] = ler.nextInt();
        }
        //soma do vetor 1 com o vetor 2   
        for (i=0; i<n; i++) {
        v3[i] = v1[i] + v2[i];
           
        }
    
       System.out.printf("A soma dos dois vetores é:  %d", soma);

    }
}

