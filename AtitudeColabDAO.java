/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetoacesso;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mapbd.AtitudeColab;

/**
 *
 * @author lucim
 */
public class AtitudeColabDAO {
    private Conexao conexao;
    private Connection conn;
    //Contrutor
    public AtitudeColabDAO(){
    this.conexao = new Conexao();
    this.conn = this.conexao.getConexao();
}
    public void inserir(AtitudeColab atitude_colab){
    String sql = "INSERT INTO atitude_colab(colaborar,comunicacao,confortavel,confianca,qualidade,autoestima,trab_equipe,comun_clara,id_aluno) VALUES"
        + "(?,?,?,?,?,?,?,?,?)";
    try{
    PreparedStatement stmt = this.conn.prepareStatement(sql);
    stmt.setString(1, atitude_colab.getColaborar());
    stmt.setString(2, atitude_colab.getComunicacao());
    stmt.setString(3, atitude_colab.getConfortavel());
    stmt.setString(4, atitude_colab.getConfianca());
    stmt.setString(5, atitude_colab.getQualidade());
    stmt.setString(6, atitude_colab.getAutoestima());
    stmt.setInt(7, atitude_colab.getTrab_equipe());
    stmt.setInt(8, atitude_colab.getComun_clara());
    stmt.setInt(9, atitude_colab.getId_aluno());
    stmt.execute();    
    }catch(Exception e) {
    System.out.println("Erro ao inserir atitude Colaborativa: " + e.getMessage());
    }
    }
}