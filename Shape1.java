/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aryb1
 */


public class Shape1 {
   
        int BrdrWidth;
        String brdrColor;
        
       public Shape1(){
        BrdrWidth=10;
        brdrColor="Blue";
        
    }
        
       public Shape1(int b, String c){
           BrdrWidth=b;
           brdrColor=c;
       
    }

       public void setBrdrWidth(int b){
           BrdrWidth=b;
       }
       
       public int getBrdrWidth(){
           return BrdrWidth;
       }
   
    
    
    
    
}
