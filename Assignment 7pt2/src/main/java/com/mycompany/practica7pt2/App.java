/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica7pt2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        Verification vr= new Verification();
        int[][] masq;
        int len,nm;
        do{
            System.out.println("Ingrese un valor impar para el tamano del cuadrado:");
            len=read.nextInt();
            
            if(len%2!=0 && len>0)
                break;
            
        }while(true);
        System.out.println("Ingrese el valor magico:");
        nm=read.nextInt();
        
        masq= new int[len][len];
        boolean flag=false;
        do{
            masq=vr.ramfill(masq,nm);
            if(vr.col(masq,nm)){
                
                if(vr.row(masq,nm)){
                    
                    if(vr.diag(masq,nm)){
                        System.out.println("Cuadrado magico:");
                        vr.draw(masq);
                        break;
                    }
                }
            }
        }while(true);
        
        
    }
}
