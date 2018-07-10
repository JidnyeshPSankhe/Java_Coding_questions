/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interview_practice;

/**
 *
 * @author Jidnyesh P Sankhe
 */
import java.util.*;
public class RepeatedNum {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int a,i=0;
		int arr[]={10,20,2,3,33,33,10,54,33,24,10,33,56,98};
                ArrayList<Integer> list = new ArrayList<Integer>();
		do{
                    
		    a=repeatNum(arr[i],arr,list);
		    if(a==-1)
                        i++;
                    else
                        System.out.println("The number "+arr[i]+" is repeated " +a+ " number of time");
                        i++;
		}
		while(i<arr.length);
	    
	    
	}
	
	public static int repeatNum(int a,int arr[],List<Integer> list){
	    int counter=0;
            if(!list.contains(a))
	    for(int i=0;i<arr.length;i++)
	{
	        if(a==arr[i])
	        {
                    list.add(arr[i]);
	            counter++;
	        }
        }
            else
              counter=0;
            return (counter-1);

	}
	
}
