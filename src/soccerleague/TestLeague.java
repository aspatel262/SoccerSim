package soccerleague;

import java.util.Scanner;


public class TestLeague {
    private Scheduler sch = new Scheduler();
    private static int gamesPlayed;
    private Teams tm = new Teams();
    

    public static void main(String[] args) {

        Games gm = new Games();
        TestLeague tl = new TestLeague();
        Scanner sc = new Scanner(System.in);        
        
        gamesPlayed = 0;
    
        
        do{
            
            tl.setTemp();
            if(!tl.getWint()){
                gamesPlayed++;
                gm.gameSim(tl);
            }else;
        }while(tl.getWint() == false);
        System.out.println("*********RESULTS*********");   
        System.out.println("");
        System.out.println("");
        tl.getTeams().printStats();
        
        System.out.println("");
        
        tl.getTeams().printTemp();
        
        System.out.println("");
        
        for(int i = 1; i <= gamesPlayed; i++){
            tl.getTeams().printGame(i);
        }
    }
    public int getGamPlay(){
        return gamesPlayed;
    }
    public int getTemp() {
        return sch.getTemp();
    }
    public boolean getWint() {
        return sch.getWint();
    }
    public void setTemp(){
        sch.setTemp();
    }
    public Teams getTeams(){
        return tm;
    }

}
