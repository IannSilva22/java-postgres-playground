package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){
    Cliente cliente = new Cliente();
    cliente.setNome("Iann");
    System.out.println("Cliente 1 nome: " + cliente.getNome());
    
    cliente.setNome("Oliveira");
    System.out.println("Cliente 2 nome: " + cliente.getNome());   
    }
}
