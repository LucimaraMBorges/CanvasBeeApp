/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucim
 */
public class Conexao {

    public Connection getConexao() {

        try {

            //tentar conexão
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/canvasbeeapp?serverTimezone=UTC", //linha de conexao

                    "root", //usuario do mysql

                    "" //senha do mysql

            );

            return conn;

        } catch (Exception e) {

            //erro de conexao
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }
}
