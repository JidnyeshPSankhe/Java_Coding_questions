/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Allergy;

/**
 *
 * @author Jidnyesh P Sankhe
 */
public class Allergy {
    private String name;
    private Severity sv;
    
    Allergy(String name,Severity sv){
        this.name=name;
        this.sv=sv;
    }
    public String getAllergyname(){return name;}
    public Severity getSeverity(){return sv;}
    public void setAllergyname(String name){this.name=name;}
    public void setSeverity(Severity sv){this.sv=sv;}
    
}
