package soccerleague;

import java.util.ArrayList;

import java.lang.String;

public class Teams {
    
    private String teams[] = new String[4]; 
    private int amerStats[] = new int[5];
    private int brazStats[] = new int[5];
    private int mexStats[] = new int[5];
    private int guatStats[] = new int[5];
    private int tempStats[] = new int[2];
    private int gamPl;
    private ArrayList<Integer> games = new ArrayList<Integer>();
    private ArrayList<Integer> temps = new ArrayList<Integer>();
    private ArrayList<String> homTm1 = new ArrayList<String>();
    private ArrayList<String> homTm2 = new ArrayList<String>();
    private ArrayList<String> awTm1 = new ArrayList<String>();
    private ArrayList<String> awTm2 = new ArrayList<String>();
     
    public void addTeam(){
        teams[0] = "America";
        teams[1] = "Brazil";
        teams[2] = "Mexico";
        teams[3] = "Guatamala";
    }
    public void statsInitial(){
        amerStats[0] = 1;   //Wins
        amerStats[1] = 2;   //Losses
        amerStats[2] = 3;   //Ties
        amerStats[3] = 4;   //Goals For
        amerStats[4] = 5;   //Goals Against
        brazStats[0] = 0;
        brazStats[1] = 0;
        brazStats[2] = 0;
        brazStats[3] = 0;
        brazStats[4] = 0;
        mexStats[0] = 0;
        mexStats[1] = 0;
        mexStats[2] = 0;
        mexStats[3] = 0;
        mexStats[4] = 0;
        guatStats[0] = 0;
        guatStats[1] = 0;
        guatStats[2] = 0;
        guatStats[3] = 0;
        guatStats[4] = 0;
        tempStats[0] = 0;   //total temp
        tempStats[1] = -111111111;   //hottest temp
        
    }
    public void addWin(String winTeam){
        if(winTeam.equals("America")){
            amerStats[0] = amerStats[0] + 1;
        }else if(winTeam.equals("Brazil")){
            brazStats[0] = brazStats[0] + 1;
        }else if(winTeam.equals("Mexico")){
            mexStats[0] = mexStats[0] + 1;
        }else if(winTeam.equals("Guatamala")){
            guatStats[0] = guatStats[0] + 1;
        }
    }
    public void addLoss(String loseTeam){
       if(loseTeam.equals("America")){
            amerStats[1] = amerStats[1] + 1;
        }else if(loseTeam.equals("Brazil")){
            brazStats[1] = brazStats[1] + 1;
        }else if(loseTeam.equals("Mexico")){
            mexStats[1] = mexStats[1] + 1;
        }else if(loseTeam.equals("Guatamala")){
            guatStats[1] = guatStats[1] + 1;
        } 
    }
    public void addTie(String tieTeam){
       if(tieTeam.equals("America")){
            amerStats[2] = amerStats[2] + 1;
        }else if(tieTeam.equals("Brazil")){
            brazStats[2] = brazStats[2] + 1;
        }else if(tieTeam.equals("Mexico")){
            mexStats[2] = mexStats[2] + 1;
        }else if(tieTeam.equals("Guatamala")){
            guatStats[2] = guatStats[2] + 1;
        } 
    }
    public void goalsAdd(String team, int goalsSco){
        if(team.equals("America")){
            amerStats[3] = amerStats[3] + goalsSco;
        }else if(team.equals("Brazil")){
            brazStats[3] = brazStats[3] + goalsSco;
        }else if(team.equals("Mexico")){
            mexStats[3] = mexStats[3] + goalsSco;
        }else if(team.equals("Guatamala")){
            guatStats[3] = guatStats[3] + goalsSco;
        }
    }
    public void goalsGiv(String team, int goalsGiv){
        if(team.equals("America")){
            amerStats[4] = amerStats[4] + goalsGiv;
        }else if(team.equals("Brazil")){
            brazStats[4] = brazStats[4] + goalsGiv;
        }else if(team.equals("Mexico")){
            mexStats[4] = mexStats[4] + goalsGiv;
        }else if(team.equals("Guatamala")){
            guatStats[4] = guatStats[4] + goalsGiv;
        }
    }
    public void tempAvg(int temp){
        tempStats[0] = tempStats[0] + temp;
    }
    public void hotTemp(int temp){
        if(temp > tempStats[1]){
            tempStats[1] = temp;
        }else;
    }
    public void printStats(){
        System.out.println("Team America");
            System.out.println("Wins: " + amerStats[0] + ", Losses: " + amerStats[1] + ", Ties: " + amerStats[2]);
            System.out.println("Goals Scored: " + amerStats[3] + ", Goals Allowed: " + amerStats[4]);
        System.out.println("Team Brazil");
            System.out.println("Wins: " + brazStats[0] + ", Losses: " + brazStats[1] + ", Ties: " + brazStats[2]);
            System.out.println("Goals Scored: " + brazStats[3] + ", Goals Allowed: " + brazStats[4]);
        System.out.println("Team Mexico");
            System.out.println("Wins: " + mexStats[0] + ", Losses: " + mexStats[1] + ", Ties: " + mexStats[2]);
            System.out.println("Goals Scored: " + mexStats[3] + ", Goals Allowed: " + mexStats[4]);
        System.out.println("Team Guatamala");
            System.out.println("Wins: " + guatStats[0] + ", Losses: " + guatStats[1] + ", Ties: " + guatStats[2]);
            System.out.println("Goals Scored: " + guatStats[3] + ", Goals Allowed: " + guatStats[4]);
        
    
}
    public void addGamPl(int gamePl){
        gamPl = gamePl;
    }
    public String[] getTeams(){
        return teams;
    }
   
    public void printTemp(){
        System.out.println("Hottest Temp: " + tempStats[1]);
        double avgTemp = (tempStats[0]/gamPl);
        System.out.println("Average Temp: " + avgTemp);
    }
    public void addGames(int gamP){
        games.add(gamP);
    }
    public void addTemps(int temp){
        temps.add(temp);
    }
    public void addHm1(String team){
        homTm1.add(team);
    }
    public void addHm2(String team){
        homTm2.add(team);
    }
    public void addaw1(String team){
        awTm1.add(team);
    }
    public void addaw2(String team){
        awTm2.add(team);
    }
    public void printGame(int gameNo){
        gameNo = gameNo - 1;
        System.out.println("Game #" + games.get(gameNo));
        System.out.println("Temperature: " + temps.get(gameNo));
        System.out.println("Away Teams: " + awTm1.get(gameNo) + ", " + awTm2.get(gameNo));
        System.out.println("Home Teams: " + homTm1.get(gameNo) + ", " + homTm2.get(gameNo));
        System.out.println("");
    }
}