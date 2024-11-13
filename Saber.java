/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapbd;

/**
 *
 * @author lucim
 */
public class Saber {
    private int id_saber;
    private int visual;
    private int auditivo;
    private int cinestesico;
    private String predominancia;
    private int id_aluno;

    public int getId_saber() {
        return id_saber;
    }

    public void setId_saber(int id_saber) {
        this.id_saber = id_saber;
    }

    public int getVisual() {
        return visual;
    }

    public void setVisual(int visual) {
        this.visual = visual;
    }

    public int getAuditivo() {
        return auditivo;
    }

    public void setAuditivo(int auditivo) {
        this.auditivo = auditivo;
    }

    public int getCinestesico() {
        return cinestesico;
    }

    public void setCinestesico(int cinestesico) {
        this.cinestesico = cinestesico;
    }

    public String getPredominancia() {
        return predominancia;
    }

    public void setPredominancia(String predominancia) {
        this.predominancia = predominancia;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }
    
   // Método para definir a predominância
    public void definirPredominancia() {
        if (visual > auditivo && visual > cinestesico) {
            predominancia = "Visual";
        } else if (auditivo > visual && auditivo > cinestesico) {
            predominancia = "Auditivo";
        } else if (cinestesico > visual && cinestesico > auditivo) {
            predominancia = "Cinestésico";
        } else if (visual == auditivo && visual > cinestesico) {
            predominancia = "Visual e Auditivo";
        } else if (visual == cinestesico && visual > auditivo) {
            predominancia = "Visual e Cinestésico";
        } else if (auditivo == cinestesico && auditivo > visual) {
            predominancia = "Auditivo e Cinestésico";
        } else {
            predominancia = "Visual, Auditivo e Cinestésico";
        }
    } 
}
