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
public class Medication {
    private String medicine_name;
    private Date startDate;
    private Date endDate;
    private int frequency;
    
    Medication(){};
    Medication(String medicine_name,Date startDate,Date endDate, int frequency){
        this.medicine_name=medicine_name;
        this.startDate= startDate;
        this.endDate=endDate;
        this.frequency=frequency;
    }
    Medication(String medicine_name,Date startDate, int frequency){
        this.medicine_name=medicine_name;
        this.startDate=startDate;
        this.frequency=frequency;
    }
    public String getMedicine() {
		return medicine_name;
	}

	public void setMedicine(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
        }
    
}
