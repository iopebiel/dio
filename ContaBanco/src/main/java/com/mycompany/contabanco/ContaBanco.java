/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

<<<<<<< HEAD
=======
import java.text.DecimalFormat;
>>>>>>> 91c2762 (Conta Bancária teminal)
import java.util.Scanner;
/**
 *
 * @author ubuntu-user
 */
public class ContaBanco {

    public static void main(String[] args) {
<<<<<<< HEAD
        int numero;
=======
        String numero;
>>>>>>> 91c2762 (Conta Bancária teminal)
        int agencia;
        String nome;
        float saldo;
        
        Scanner scan = new Scanner(System.in);
        
<<<<<<< HEAD
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
=======
        System.out.println("Por favor, digite o número da Nome!");
        nome = scan.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o número da Número!");
        numero = scan.nextLine();
        System.out.println("Por favor, digite o número da Saldo!");
        saldo = scan.nextFloat();
        
        System.out.print("\nOlá " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$");
        System.out.printf("%.2f já está disponível para saque.", saldo);
>>>>>>> 91c2762 (Conta Bancária teminal)
    }
}
