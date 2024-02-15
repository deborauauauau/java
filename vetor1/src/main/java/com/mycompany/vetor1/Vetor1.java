
package com.mycompany.vetor1;
import java.util.Scanner;


public class Vetor1 {

    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       int n = 10; //tamanho do vetor
       int v [] = new int [n]; //declaração do vetor "v"
       int i; //indice ou posição
       int soma=0;
      
       
       //entrada de dados
       for (i=0; i<n; i++) {
           System.out.printf("Informe o valor: ", (i+1), n);
          //System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
           v[i] = ler.nextInt();
           
       }
       for (i=0; i<n; i++) {
           soma = soma + v[i];
        }
           
       System.out.printf("O valor da soma é:  %d", soma);

    }
}
