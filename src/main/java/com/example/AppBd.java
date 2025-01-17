package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class AppBd {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
            System.out.println("Conexão com o banco de dados realizada com sucesso.");
            
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }



        } catch (ClassNotFoundException e){
            System.err.println("não foi possivel carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
        } catch (SQLException e){
            System.err.println("Não foi possivel conectar ao banco de dados: " + e.getMessage());
        } finally{
            
        }
        
    }
}
