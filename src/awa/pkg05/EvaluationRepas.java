/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg05;

/**
 *
 * @author etudiant
 */
public class EvaluationRepas {

    public EvaluationRepas(int note,String commentaire) {
        this.note= note;
        this.commentaire = commentaire;
    }
    private int note = 2 ;
    private String commentaire;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }


         
    
}
