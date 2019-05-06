/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.eftl.agence.voyages;

/**
 *
 * @author User
 */
public class CalculPrixBillets {
  
    private Integer prixUnitaire;
    private String classe;
    
    public Integer getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Integer prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public Integer calculer(String depart, String arrivee, String classe){
        CalculPrixUnitaire prixUnitaire = new CalculPrixUnitaire(depart, arrivee);
        Integer varPrixUnitaire = prixUnitaire.generer();
        switch(classe){
            case"eco":
                return varPrixUnitaire;
               //break;
            case"premiere":
                return varPrixUnitaire * 2;
                //break;
            case "business":
                return varPrixUnitaire * 2 + 300;
                //break;
            default:
                return varPrixUnitaire;
                
        }
    }
    
}