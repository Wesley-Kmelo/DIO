package br.com.dio.calculadora;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ,b;
        System.out.println("Digite o primeiro valor ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor ");
        b = scan.nextInt();

        int soma = somar(a,b);
        int sub = subtrair(a,b);
        int mult = multiplicar(a,b);
        int div = dividir(a,b);


        System.out.println("A soma é : "+soma);
        System.out.println("A subtração é : "+sub);
        System.out.println("A multiplicação é : "+mult);
        System.out.println("A divisão é : "+div);

    }
    public static int somar (int a, int b){
        return a+b;
    }
    public static int subtrair (int a, int b){
        return a-b;
    }
    public static int multiplicar (int a, int b){
        return a*b;
    }
    public static int dividir (int a, int b){
        return a/b;
    }

}
