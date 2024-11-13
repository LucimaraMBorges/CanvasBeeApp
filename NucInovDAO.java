/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetoacesso;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mapbd.NucInov;

/**
 *
 * @author lucim
 */
public class NucInovDAO {
    private Conexao conexao;
    private Connection conn;  
    
    public NucInovDAO(){
        
    this.conexao = new Conexao();
    this.conn = this.conexao.getConexao();

    }
    
    public void inserir(NucInov nucinov){
    String sql = "INSERT INTO nuc_inov(compreensao,auxilio_ia,aprendizagem,reflexao_soluc,imp_postura,id_aluno) VALUES"
        + "(?,?,?,?,?,?)";
    try{
    PreparedStatement stmt = this.conn.prepareStatement(sql);
    stmt.setInt(1, nucinov.getCompreensao());
    stmt.setInt(2, nucinov.getAuxilio_ia());
    stmt.setInt(3, nucinov.getAprendizagem());
    stmt.setInt(4, nucinov.getReflexao_soluc());
    stmt.setString(5, nucinov.getImp_postura());
    stmt.setInt(6, nucinov.getId_aluno());
    stmt.execute();
    }
    catch(Exception e) {
    System.out.println("Erro ao inserir fase 3(N): " + e.getMessage());
    }

    }
    
}
