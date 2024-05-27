/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.contabanco;

 import java.util.Scanner;
 /**
  *
  * @author iope
  */
 public class ContaBanco {
 
     public static void main(String[] args) {
         String numero;
         int agencia;
         String nome;
         float saldo;
         
         Scanner scan = new Scanner(System.in);
 
         System.out.println("Por favor, digite o seu nome!");
         nome = scan.nextLine();
         System.out.println("Por favor, digite o número da agência!");
         agencia = scan.nextInt();
         scan.nextLine();
         System.out.println("Por favor, digite o número da conta!");
         numero = scan.nextLine();
         System.out.println("Por favor, digite o saldo da conta!");
         saldo = scan.nextFloat();
         
         System.out.print("\nOlá " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$");
         System.out.printf("%.2f já está disponível para saque.", saldo);
     }
 }
 