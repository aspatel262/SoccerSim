package soccerleague;

import java.util.Scanner;

public class Scheduler {
    Scanner sc = new Scanner(System.in);
    private boolean winter = false;
    private int temp;
    
    
    
    
 //Methods
   public void setTemp() {
       Games gm = new Games();
       TestLeague tl = new TestLeague();
       System.out.println("Enter Temperature");
       temp = sc.nextInt();
       
        if(temp < 32){
        System.out.println("Too cold to play.");
        System.out.println("Enter Temperature");
        temp = sc.nextInt();
        if(temp < 32){
            System.out.println("Too cold to play.");
            System.out.println("Enter Temperature");
            temp = sc.nextInt();
            if(temp < 32){
            System.out.println("Too cold to play.");
            winter = true;
            }else{
                
            }
        }else{
            
        }
        
    }else{
           
        }   
   } 
   public int getTemp(){
       return temp;
   }
   public boolean getWint(){
       return winter;
   }
}
