import java.io.*;
import java.util.*;

public class BlackJack
{
    public void play(){
        int dealer, player;
        int dc1, dc2, pc1, pc2, dr;
        Scanner sc = new Scanner(System.in);
        
        String s;
        
        System.out.println("Welcome to Mitchell's blackjack program!");
        pc1 = (int)(Math.random() * 11 + 2);
        pc2 = (int)(Math.random() * 11 + 2);
        System.out.println("You get a " +  pc1 + " and a " +pc2+ " .");
        int pct = pc1 + pc2;
        System.out.println("Your total is " + pct);
        dc1 = (int)(Math.random() * 11 + 2);
        dc2 = (int)(Math.random() * 11 + 2);
        System.out.println("The dealer has a " + dc1+ " showing, and a hidden card.");
        int dct = dc1 + dc2;
        System.out.println("His total is hidden, too.");
        
        while(pct <= 21){
            System.out.println("Would you like to 'hit' or 'stay'?");
            s = sc.nextLine();
            if(s.equals("hit")){
                dr = (int)(Math.random() * 12 + 1);
                System.out.println("You drew a " + dr);
                pct += dr;
                System.out.println("Your total is " + pct);
            }
            if(pct > 21){
                System.out.println("Dealer wins automatically");
                break;
            }
                
            if(s.equals("stay")){
                System.out.println("Okay, dealer's turn.");
                System.out.println("His hidden card was a " + dc2);
                System.out.println("His total was " + dct);
                break;
            }
        }
        if(pct <= 21){
            
                while(dct <= 21){
                s = sc.nextLine();
                if(s.equals("hit")){
                    System.out.println("Dealer chooses to hit.");
                    dr = (int)(Math.random() * 12 + 1);
                    System.out.println("He drews a " + dr);
                    dct += dr;
                    System.out.println("His total is " + dct);
                }
                if(s.equals("stay")){
                    System.out.println("Dealer Stays.");
                    break;
                }
            }
        
            System.out.println("Dealer total is " + dct);
            System.out.println("Your total is " + pct);
            
            if(dct < pct)
                System.out.println("YOU WIN!");
            else
               System.out.println("DEALER WINS"); 
        }
            
    }
        
}
