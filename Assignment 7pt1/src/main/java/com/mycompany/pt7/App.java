/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt7;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        functions fun=new functions();
        int mat[][] = new int[4][4];
        for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                System.out.println("Introduzca los elementos de la matriz: ");
                mat[x][y] = read.nextInt();
            }
        }
        /*for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                System.out.print (matriz[x][y]+" ");
            }
            System.out.println();
        }*/
        int nin;
        int aux;
        do{
            System.out.println("introduzca una opcion");
            System.out.println("Suma de una fila: 1");
            System.out.println("Suma de una columna: 2");
            System.out.println("Suma diagonal: 3");
            System.out.println("Suma diagonal inversa: 4");
            System.out.println("Media de los valores: 5");
            System.out.println("Salir: 0");
            nin=read.nextInt();
            
            switch(nin){
                case 1:
                    System.out.println("introduzca el numero de fila:");
                    aux=read.nextInt();
                    if(aux>=0&&aux<mat.length)
                        fun.sumR(mat, aux);
                    else{
                        System.out.println("LA FILA ES INVALIDA");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("introduzca el numero de columna:");
                        aux=read.nextInt();
                        if(aux>=0&&aux<mat.length)
                            fun.sumC(mat, aux);
                        else{
                            System.out.println("LA COLUMNA ES INVALIDA");
                            break;
                        }
                        break;
                case 3:
                    fun.sumD(mat);
                    break;
                case 4:
                    fun.sumDi(mat);
                case 5:
                    fun.prom(mat);
                case 0:
                    System.out.println();
                    break;
                default:
                    
                    System.out.println("Usa un numero que pertenezca al menu");
                    break;
                    
            }
        }while(nin!=0);
        
    
    }
        
    }
