/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica7pt2;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Verification {
    
    Random rdm = new Random();
    
    public int[][] ramfill(int[][]mat, int lim){
        
        for(int i = 0; i <mat.length; i++) {
            for(int j=0;j<mat.length;j++){
                int value = rdm.nextInt(lim);
                mat[i][j]=value;
            }
        }
        
    return mat;
    }
    
    public boolean col(int [][] mat, int nm){
        int suma=0;
        for(int i = 0; i <mat.length; i++) {
            for(int j=0;j<mat.length;j++){
               suma=suma+mat[j][i];
               
            }
            if(suma!=nm){
                return false;
            }
        }
        return true;
    }
    public boolean row(int [][] mat, int nm){
        int suma=0;
        for(int i = 0; i <mat.length; i++) {
            for(int j=0;j<mat.length;j++){
               suma=suma+mat[i][j];
               
            }
            if(suma!=nm){
                return false;
            }
        }
        return true;
    }
    public boolean diag(int [][] mat, int nm){
        int suma=0;
        for(int i = 0; i <mat.length; i++) {
            suma=suma+mat[i][i];
            
        }
        if(suma!=nm){
                return false;
            }
        suma=0;
        for(int i = mat.length-1; i<=0; i--) {
            suma=suma+mat[i][i];
            
        }
        if(suma!=nm){
                return false;
            }
        return true;
    }
    public void draw(int mat[][]){
        for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                System.out.print (mat[x][y]+" ");
            }
            System.out.println();
        }
    }
}
