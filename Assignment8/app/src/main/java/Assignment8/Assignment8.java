/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment8;

import java.util.Random;
/**
 *
 * @author ASUS
 */
public class Assignment8 {
Random r = new Random();
    public String azar(String input) {
        String fin="";
        String[] parts = input.split("\\."); 
        
        for(int i=0;i<parts.length;i++){
            fin=fin+parts[i];
        }
        parts = fin.split("\\,"); 
        fin="";
        for(int i=0;i<parts.length;i++){
            fin=fin+parts[i];
        }
        
        
        parts = fin.split("\\s+"); 
        fin="";
         
        
        String mez="";
        mez=mezclar(parts);
        
        
        return mez;
    }
public  String mezclar(String[] parts){
    
    char aux1,aux2;
    String Final="";
    for(int i=0;i<parts.length;i++){
        if(parts[i].length()>=3){
            
            
        
        char[] div = new char[parts[i].length()];
        //string palabra a un char array
        div = parts[i].toCharArray();
        aux1=div[0];
        aux2=div[div.length-1];
        
        
       
        //crear medios
       char[] med=new char [div.length-2];
       for (int j = 0,k=1; j <med.length; j++,k++) {
           med[j]=div[k];
           
       }   
        //mezclar
    
        for (int k=0; k<med.length; k++) {
            int alea = r.nextInt(med.length);
            char temp = med[k];
            med[k] = med[alea];
            med[alea] = temp;
        }
        //re armar el mensaje
        for (int j = 0,k=1; j <med.length; j++,k++) {
           div[k]=med[j];
           
       }
        
        for (int j = 0; j < div.length; j++) {
            Final=Final+div[j];
        }
        Final=Final+" ";
        
        
    }
        else{
            Final=Final+parts[i]+" ";
        }   
    }
  
return Final;
}  
}
