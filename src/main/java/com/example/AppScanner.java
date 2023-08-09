package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Digite o seu sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));
        
        System.out.println("Digite a sua Cidade: ");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite o seu CPF: ");
        cliente.setCPF(scanner.nextLine());

        System.out.println("Digite a sua renda: ");
        cliente.setRenda(scanner.nextDouble());   

        System.out.println("Nome: "+ cliente.getNome());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Renda: R$ " + cliente.getRenda());

    }
}
