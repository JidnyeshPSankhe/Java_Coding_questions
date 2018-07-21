/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medication;

/**
 *
 * @author Jidnyesh P Sankhe
 */
public class Person {
   private String first_name;
   private String last_name;
   private int Age;
   private String address;
    Person(String first_name,String last_name,int Age,String address){
        this.first_name=first_name;
        this.last_name=last_name;
        this.Age= Age;
        this.address= address;
         }
    String getFirst_name(){
        return first_name;
    }
    String getlast_name(){
        return last_name;
    }
    int getAge(){
        return Age;
    }
    
    String getAddress(){
        return address;
    }
    
    void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    void setlast_name(){
        this.first_name=first_name;
    }
    void Age(){
        this.Age=Age;
    }
    
    void setAddress(){
        this.address=address;
    }
}
