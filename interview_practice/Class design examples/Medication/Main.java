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
import java.util.*;
import java.text.SimpleDateFormat;
public class Main extends Address {
    private List<Medication> med;
    Person p;
    
    Main(String addressLine1, String city, String state, int zipcode, String country,Person p, List<Medication> med)
    {
        super(addressLine1,city,state, zipcode,country);
        this.p=p;
        this.med=med;
    }
    
    Person getPerson(){return p;}
    List<Medication> getMedication(){return med;}
    void setPerson(Person p){this.p=p;}
    void setMedication(List<Medication> med){this.med=med;}


public static void main(String [] args){
     Person ps=new Person("Ram","Jeth",23,"Home1");
     Date sDate = new Date("07/15/2018 10:30 AM");
     Date endDate = new Date("07/18/2018");
     List <Medication> med=new ArrayList<>();
     med.add(new Medication("Crocin",sDate,endDate,4));
     med.add(new Medication("Xyz",sDate,endDate,5));
     med.add(new Medication("abc",sDate,endDate,6));
     
     Main m=new Main("Sagar society","Mumbai","MH",32817,"India",ps,med);
     System.out.println(m.Display(m,med));
}
public <Sting> List Display(Main m,List<Medication>med){
    List<String> toNurse=new ArrayList<>();
    for(int i=0;i<med.size();i++){
    Date sDate = m.getMedication().get(i).getStartDate();
    Date eDate = m.getMedication().get(i).getEndDate();
    int dose = 0;
    String name=m.getMedication().get(i).getMedicine();
    
    Calendar cal = Calendar.getInstance();
		while(sDate.compareTo(eDate) == -1) {
			dose++;
			SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM dd, yyyy");
			SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm a");
			String display = "On " + dateFormatter.format(sDate) +"  "+m.getPerson().getFirst_name()+" from the city of "+super.getCity()+" needs to take dose of " + name + " at " + timeFormatter.format(sDate);
                        toNurse.add(display);
                        toNurse.add("\n");
                        cal.setTime(sDate);
			cal.add(cal.HOUR, m.getMedication().get(i).getFrequency());
			sDate = cal.getTime();
			if(dose==10)
				break;
		}}
                                        return toNurse;
    


}
}


