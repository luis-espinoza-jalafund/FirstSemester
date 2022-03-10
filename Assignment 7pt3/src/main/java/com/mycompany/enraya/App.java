
package com.mycompany.enraya;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class App {
	
	static Scanner read = new Scanner(System.in);
    public static void main (String[] args) {

        game func = new game();
        int row,colum;
        boolean posval,correct;
        while(!func.gameover()){
            do{
                func.showCurrent();
                func.showboard();
                correct=false;
                row=func.Read("Ingresa fila:");
                colum=func.Read("ingresa columna");
                posval=func.validpos(row,colum);
                if(posval){
                    if(!func.occupied(row,colum)){
                        correct=true;
                    }
                    else{
                        System.out.println("posicion ocupada");
                    }
                    
                }
                else{
                    System.out.println("No valido");
                }
            }while(!correct);
            func.PutIn(row,colum);
            func.changeturn();
            
        }
        func.showboard();
        func.winner();
        
}
} 