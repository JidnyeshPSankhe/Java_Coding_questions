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
import java.util.*;
public class Main {
    private String name;
    private List<Allergy> Al;
    Reporter rd;
    //Severity sv;
    Main(String name,List<Allergy>Al,Reporter rd)
    {
        this.name=name;
        this.Al=Al;
        this.rd=rd;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public List<Allergy> getAllergy(){return Al;}
    public void setAllergy(List<Allergy> Al){this. Al=Al;}
    public Reporter getReporter(){return rd;}
    public void setReporter(Reporter rd){this.rd=rd;}
    
    public static void main(String [] args){
    
    List <Allergy>a1 =new ArrayList<Allergy>();;
    a1.add(new Allergy("rashes",Severity.HIGH));
    a1.add(new Allergy("burning sensation",Severity.MEDIUM));
    Main m=new Main("Ramesh",a1,Reporter.NURSE);
    m.display();
    }
    
    public void display(){
        String name=getName();
        for(Allergy a:getAllergy()){
            System.out.println(name+" has "+a.getAllergyname()+" with "+a.getSeverity()+" severity which was reported by "+getReporter());
        }
    
    }
}



