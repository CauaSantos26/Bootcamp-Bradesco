package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero da conta:? ");
        int numeroConta =
        scanner.nextInt();
        scanner.nextLine();

        System.out.println("digite a sua agencia:? ");
        String agencia =
        scanner.nextLine();

        System.out.println("digite o seu nome:? ");
        String nomeCliente =
        scanner.nextLine();

        System.out.println("digite o seu saldo:? ");
        double saldo =
        scanner.nextInt();

        System.out.println("ola " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível  para saque." );


        scanner.close();
    }



}