/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt7;

/**
 *
 * @author ASUS
 */
public class functions {
    public void sumR(int[][] mat, int pos ){
        int sum=0;
        
        for(int i=0;i<mat.length;i++){
            
            sum=sum+mat[pos][i];
        }
        System.out.println("la suma de la fila es: "+ sum);
    }
    public void sumC(int[][] mat, int pos ){
        int sum=0;
        
        for(int i=0;i<mat.length;i++){
            
            sum=sum+mat[i][pos];
        }
        System.out.println("la suma de la columna es: "+ sum);
        
    }
    public void sumD(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
        }
        System.out.println("la suma de la diagonal es: "+ sum);
    }
    public void sumDi(int mat[][]){
        int sum=0;
        for(int i=mat.length-1;i>=0;i--){
            sum=sum+mat[i][i];
        }
        System.out.println("la suma de la diagonal inversa es: "+ sum);
    }
    public void prom(int mat[][]){
        int sum=0,cont=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                sum=sum+mat[i][j];
                cont++;
            }
        }
        System.out.print("La media de los valores es: "+(sum/cont));
    }
}
