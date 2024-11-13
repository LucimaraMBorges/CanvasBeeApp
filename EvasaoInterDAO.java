/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetoacesso;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mapbd.EvasaoInter;

/**
 *
 * @author lucim
 */
public class EvasaoInterDAO {
  private Conexao conexao;
  private Connection conn;
  
  public EvasaoInterDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
        //fazer sql para recuperar o id_aluno aqui?
    }
  
  public void inserir(EvasaoInter evasaointer){
String sql = "INSERT INTO evasao_inter(engajamento,desafios,colaboracao,familia,equilibrio,id_aluno) VALUES"
        + "(?,?,?,?,?,?)";
try{
PreparedStatement stmt = this.conn.prepareStatement(sql);
stmt.setInt(1, evasaointer.getEngajamento());
stmt.setInt(2, evasaointer.getDesafios());
stmt.setInt(3, evasaointer.getColaboracao());
stmt.setInt(4, evasaointer.getFamilia());
stmt.setInt(5, evasaointer.getEquilibrio());
stmt.setInt(6, evasaointer.getId_aluno());
stmt.execute();
}
catch(Exception e) {
System.out.println("Erro ao inserir fase 2(E): " + e.getMessage());
}

}

   
}
