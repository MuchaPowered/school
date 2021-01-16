package ruleta;

import java.util.*;
import java.util.Scanner;
public class Ruleta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cervenecisla[]={1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        int ciernecisla[]={2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
    int Love = 100;
    String farba = "";
   
    while (Love > 0){
    int cfarby = 10;
    int stavka = 0 ;
    int vyhra= 0;   
    int sfarba = 10;
    int love1 = 0;
     System.out.println("Tvoj stav penazí je: " +Love + "€");
     System.out.println("Vyber farbu ,Zelená = 0, ,Červená = 1,Čierna = 2,");
     sfarba = scan.nextInt();
    while (sfarba > 2)
    {
       System.out.println("Vyber farbu ,Zelená = 0, ,Červená = 1,Čierna = 2,");
       sfarba = scan.nextInt();
    }
    System.out.println("Zadaj svoju stávku");
     stavka = scan.nextInt();
     love1 = Love - stavka;
    while (stavka > Love){
     System.out.println("Zadaj svoju stávku");
     stavka = scan.nextInt();
     love1 = Love - stavka;
    }

    Random rn = new Random();
    int odpoved = rn.nextInt(37) + 1;
    if (odpoved == 37)
    {
        odpoved = 0;
        farba = "zelená";
        cfarby = 0;
    }
    
     else if(ciernecisla[0]==odpoved
             ||ciernecisla[1]==odpoved
             ||ciernecisla[2]==odpoved
             ||ciernecisla[3]==odpoved
             ||ciernecisla[4]==odpoved
             ||ciernecisla[5]==odpoved
             ||ciernecisla[6]==odpoved
             ||ciernecisla[7]==odpoved
             ||ciernecisla[8]==odpoved
             ||ciernecisla[9]==odpoved
             ||ciernecisla[10]==odpoved
             ||ciernecisla[11]==odpoved
             ||ciernecisla[12]==odpoved
             ||ciernecisla[13]==odpoved
             ||ciernecisla[14]==odpoved
             ||ciernecisla[15]==odpoved
             ||ciernecisla[16]==odpoved
             ||ciernecisla[17]==odpoved)
     {
     odpoved = odpoved;
     farba = "Čierna";
      cfarby = 2;
     }
     else {
        odpoved = odpoved;
        farba = "Červená";
         cfarby = 1;
     }
    System.out.println("Číslo padlo: "+odpoved+"\nFarba padla: "+farba);
    System.out.println("-----------------------------------------------");
    
        if ( sfarba == cfarby)
        {
            vyhra = 1;
        }
           if (vyhra == 0){
           System.out.println("Netrafil si farbu!");     
            love1 = love1 ; 
            }
        if (vyhra == 1 && cfarby == 0){
            System.out.println("Trafil si farbu!");   
            stavka = stavka * 14;
            love1 = stavka + love1;
        }
              if (vyhra == 1 && cfarby == 1){
            System.out.println("Trafil si farbu!");   
            stavka = stavka * 2;
            love1 = stavka + love1;
        }
             if (vyhra == 1 && cfarby == 2){
            System.out.println("Trafil si farbu!");   
            stavka = stavka * 2;
            love1 = stavka + love1;
        }
           Love = love1;
    System.out.println("-----------------------------------------------");
  }
       System.out.println("Nemaš koruny možeš hrať znova o.O");   
    }
}