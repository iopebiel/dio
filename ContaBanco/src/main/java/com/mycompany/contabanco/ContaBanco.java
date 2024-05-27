/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;
/**
 *
 * @author ubuntu-user
 */
public class ContaBanco {

    public static void main(String[] args) {
        int numero;
        int agencia;
        String nome;
        float saldo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da Nome!");
        nome = scan.nextLine();
        System.out.println("Por favor, digite o número da Número!");
        numero = scan.nextInt();
        System.out.println("Por favor, digite o número da Saldo!");
        saldo = scan.nextFloat();
        
        System.out.println("\nOlá " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
