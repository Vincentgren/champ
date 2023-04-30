/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekt2;
import java.util.Scanner;

/**
 *
 * @author vincent.holmgren
 */
public class Projekt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner (System.in);
        int[] platser =new int[21];
        for(int j=0; j<100; j++){
        System.out.println("Välj ett av valen");
        System.out.println("Skriv 1 För att se hur många lediga platser som finns");
        System.out.println("skriv 2 För att boka en plats");
         System.out.println("skriv 3 för att kolla vinsten");
        int val=scan.nextInt();
        
        
        switch (val) {
            case 1: 
                antalLed(platser);
                scan.nextLine();
                break;
            case 2:
             boka(platser);
             scan.nextLine();
             break;
            case 3:
            summaVinst(platser);
            scan.nextLine();
                
        }
             
                            
                    
        }
    }
    static void antalLed(int[] platser){
        int antal_lediga=0;
        for (int i = 0; i<platser.length; i++) {
            if(platser[i]==0){
           antal_lediga+=1;
            
            }
            
        }
       System.out.println(antal_lediga);
    }
     static int[] boka(int[] platser){
        System.out.println("");
        for (int i = 0; i<platser.length; i++) {
            if(platser[i]==0){
                platser[i]+=1;
                System.out.println("Plats bokad");
                break;
              }
            
        }
        return platser;
      
    }
     
     static void summaVinst(int[] platser){
        int vinst=0;
        for (int i = 0; i<platser.length; i++) {
            if(platser[i]==1){
                vinst+=299.90;
           
            
            }
            
        }
       System.out.println(vinst);
    }

}

