
package com.mycompany.enraya;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class game {
	
static Scanner read = new Scanner(System.in);
    private datos[][] tab;

    private boolean turn; 
    
    public game() {
        this.tab = new datos[3][3];
        this.turn = true;
        this.FillBoard();
    }
    
    
    public datos winner() {

        datos smb = threeinrow();

        if (smb != datos.n) {
            System.out.println("winner: "+smb);
            return smb;
        }

        smb = threeincolum();

        if (smb != datos.n) {
            System.out.println("winner: "+smb);
            return smb;
        }

        smb = threeindiag();

        if (smb != datos.n) {
            System.out.println("winner: "+smb);
            return smb;
        }

        return null;
    }
    
   
    public void PutIn(int row, int colum) {
        if(turn){
            tab[row][colum] = datos.x;
        }else{
            tab[row][colum] = datos.o;
        }
    }

    public void showCurrent() {

        if (this.turn) {
            System.out.println("turno jugador 1");
        } else {
            System.out.println("turno jugador 2");
        }

    }
    
    public void changeturn(){
        this.turn = !this.turn;
    }

    
    public void FillBoard() {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = datos.n;
            }
        }

    }


    public boolean validpos(int row, int colum) {
        return row >= 0 && row < tab.length && colum >= 0 && colum < tab.length;
    }

    public boolean occupied(int row, int colum) {
        if (tab[row][colum] != datos.n) {
            return true;
        }

        return false;
    }

 
    public void showboard() {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j].obsmb() + " ");
            }
            System.out.println("");
        }

    }

    public boolean fullboard() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] == datos.n) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean gameover() {

        if (fullboard()|| threeinrow() != datos.n|| threeincolum() != datos.n|| threeindiag() != datos.n) {
            return true;
        }

        return false;
    }

    public datos threeinrow() {

        datos smb;
        boolean threein;

        for (int i = 0; i < tab.length; i++) {

       
            threein = true;
            
            smb = tab[i][0];
            if (smb != datos.n) {
                for (int j = 1; j < tab[0].length; j++) {
                   
                    if (smb != tab[i][j]) {
                        threein = false;
                    }
                }

                
                if (threein) {
                    return smb;
                }

            }

        }

        
        return datos.n;

    }

    public datos threeincolum() {

        datos smb;
        boolean threein;

        for (int j = 0; j < tab.length; j++) {
            threein = true;
            smb = tab[0][j];
            if (smb != datos.n) {
                for (int i = 1; i < tab[0].length; i++) {
                    
                    if (smb != tab[i][j]) {
                        threein = false;
                    }
                }
             
                if (threein) {
                    return smb;
                }

            }

        }
        return datos.n;

    }
    public static int Read(String msg){
        System.out.println(msg);
        int n=read.nextInt();
        return n;
    }
    public datos threeindiag() {

        datos smb;
        boolean threein = true;

        smb = tab[0][0];
        if (smb != datos.n) {
            for (int i = 1; i < tab.length; i++) {
                
                if (smb != tab[i][i]) {
                    threein = false;
                }
            }

            
            if (threein) {
                return smb;
            }

        }

        threein = true;

        
        smb = tab[0][2];
        if (smb != datos.n) {
            for (int i = 1, j = 1; i < tab.length; i++, j--) {
             
                if (smb != tab[i][j]) {
                    threein = false;
                }
            }

            if (threein) {
                return smb;
            }
        }

        return datos.n;

    }

}
