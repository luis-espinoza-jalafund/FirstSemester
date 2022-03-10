/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment9;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Utility {
    public static String[] Repeated(String txt) {
        txt=txt.toLowerCase();
        String[] word=txt.split(" ");
        int wordn[]=new int[word.length];
        for(int i=0;i<word.length;i++){
            for(int j=0;j<word.length;j++){
                if(word[i].equals(word[j])){
                    wordn[i]=wordn[i]+1;
                }
            }
        }
        int aux=wordn[0];
        int len=wordn.length;
        
        for(int i=1;i<len;i++){
            if(wordn[i]>aux){
                
                aux=wordn[i];
                
            }
            
        }
        int max=aux;
        int maxarr=0;
        for(int i=0;i<wordn.length;i++){
            if(max==wordn[i]){
                maxarr=i;
                break;
            }
        }
        String maxstr= max +"";
        String fin[]={word[maxarr], maxstr};
        return fin;
}
}
