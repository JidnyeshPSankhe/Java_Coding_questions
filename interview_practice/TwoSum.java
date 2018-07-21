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
import java.util.HashMap;
public class TwoSum {
   private int target;
   private int [] arr;
   TwoSum(int target,int[] arr){
    this.target=target;
    this.arr=arr;
        }
   public int getTarget(){return target;}
   public int [] getarray(){return arr;}
public static void main(String [] args){
    int [] ar1={1,2,5,6,7,9};
    TwoSum ts=new TwoSum(8,ar1);
    ts.findTwoindex();
}

public void findTwoindex(){
System.out.println("The target is "+target);
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++){
    if(map.containsKey(arr[i]))
        System.out.println("The target is obtaine by adding "+map.get(arr[i])+" and "+arr[i]);
     else
        map.put(target-arr[i], arr[i]);


}

}
        
}
