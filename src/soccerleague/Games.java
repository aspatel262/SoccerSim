package soccerleague;


import java.util.ArrayList;
import java.util.Random;

public class Games {
    
    private int amerScore; //team #0
    private int mexScore;  //team #1
    private int brazScore;  //team #2
    private int guatScore;  //team #3
    private String hT1;
    private String hT2;
    private String aT1;
    private String aT2;
    private ArrayList<String> teasm=new ArrayList<String>();
    private String[] tmz = new String[4];
    
    private int[] scrs = new int[4];
    //Methods
     
   
    
    
    public void gameSim(TestLeague tl){
        System.out.println("Match Played");
      
        
        Random rand = new Random();
        Teams tm = tl.getTeams();
        int tempature = tl.getTemp();
        int gamesPlayed = tl.getGamPlay();
        tm.addGamPl(gamesPlayed);
        tm.hotTemp(tempature);
        tm.tempAvg(tempature);
        teasm.add("America");
        teasm.add("Brazil");
        teasm.add("Mexico");
        teasm.add("Guatamala");
        tmz[0] = "America";
        tmz[1] = "Brazil";
        tmz[2] = "Mexico";
        tmz[3] = "Guatamala";
        scheduleGames();
        tm.addGames(gamesPlayed);
        tm.addTemps(tempature);
        tm.addHm1(hT1);
        tm.addHm2(hT2);
        tm.addaw1(aT1);
        tm.addaw2(aT2);
        if(tempature >= 32 && tempature < 40){
            amerScore = rand.nextInt(2);
            mexScore = rand.nextInt(2);
            brazScore = rand.nextInt(2);
            guatScore = rand.nextInt(2);
        }else if(tempature >= 40 && tempature <60){
            amerScore = rand.nextInt(4);
            mexScore = rand.nextInt(4);
            brazScore = rand.nextInt(4);
            guatScore = rand.nextInt(4);
        }else if(tempature >= 60 && tempature < 80){
            amerScore = rand.nextInt(6);
            mexScore = rand.nextInt(6);
            brazScore = rand.nextInt(6);
            guatScore = rand.nextInt(6);
        }else if(tempature >= 80 && tempature <100){
            amerScore = rand.nextInt(8);
            mexScore = rand.nextInt(8);
            brazScore = rand.nextInt(8);
            guatScore = rand.nextInt(8);
        }else if(tempature >= 100){
            amerScore = rand.nextInt(14);
            mexScore = rand.nextInt(14);
            brazScore = rand.nextInt(14);
            guatScore = rand.nextInt(14);
        }else;
        tm.goalsAdd("America", amerScore);
        tm.goalsAdd("Brazil", brazScore);
        tm.goalsAdd("Guatamala", guatScore);
        tm.goalsAdd("Mexico", mexScore);
        
        
        /*    if(guatScore > brazScore){ 
            tm.addWin("Guatamala");
            tm.addLoss("Brazil");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }
        */
        
        
        if(hT1.equals("America")){
            if(aT1.equals("Mexico")){
                if(amerScore > mexScore){
            tm.addWin("America");
            tm.addLoss("Mexico");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else if(amerScore < mexScore){
            tm.addWin("Mexico");
            tm.addLoss("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else{
            tm.addTie("Mexico");
            tm.addTie("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }
                
                
            }else if(aT1.equals("Guatamala")){
                if(amerScore > guatScore){
            tm.addWin("America");
            tm.addLoss("Guatamala");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else if(amerScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }
                
                
            }else if(aT1.equals("Brazil")){
                if(amerScore > brazScore){
            tm.addWin("America");
            tm.addLoss("Brazil");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else if(amerScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore);   
        }
                
                
            }else;
            
            
        }else if(hT1.equals("Mexico")){
            if(aT1.equals("America")){
                if(amerScore > mexScore){
            tm.addWin("America");
            tm.addLoss("Mexico");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else if(amerScore < mexScore){
            tm.addWin("Mexico");
            tm.addLoss("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else{
            tm.addTie("Mexico");
            tm.addTie("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
            
            
        }
            }else if(aT1.equals("Guatamala")){
                if(mexScore > guatScore){
            tm.addWin("Mexico");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else if(mexScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
            
            
        }
            }else if(aT1.equals("Brazil")){
                if(mexScore > brazScore){ 
            tm.addWin("Mexico");
            tm.addLoss("Brazil");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }
                
                
            }else;
        }else if(hT1.equals("Guatamala")){
            if(aT1.equals("Mexico")){
                if(mexScore > guatScore){
            tm.addWin("Mexico");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else if(mexScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }
                
                
            }else if(aT1.equals("America")){
                if(amerScore > guatScore){
            tm.addWin("America");
            tm.addLoss("Guatamala");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else if(amerScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }
                
                
            }else if(aT1.equals("Brazil")){
                if(guatScore > brazScore){ 
            tm.addWin("Guatamala");
            tm.addLoss("Brazil");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }  
            }else;
            
        }else if(hT1.equals("Brazil")){
            if(aT1.equals("Mexico")){
                if(mexScore > brazScore){ 
            tm.addWin("Mexico");
            tm.addLoss("Brazil");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }
                
                
            }else if(aT1.equals("America")){
                if(amerScore > brazScore){
            tm.addWin("America");
            tm.addLoss("Brazil");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else if(amerScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }
            }else if(aT1.equals("Guatamala")){
                if(guatScore > brazScore){ 
            tm.addWin("Guatamala");
            tm.addLoss("Brazil");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }
                
                
            }else;

        }else;
        
        
        
        
       
        
        if(hT2.equals("America")){
            if(aT2.equals("Mexico")){
                if(amerScore > mexScore){
            tm.addWin("America");
            tm.addLoss("Mexico");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else if(amerScore < mexScore){
            tm.addWin("Mexico");
            tm.addLoss("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else{
            tm.addTie("Mexico");
            tm.addTie("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }
            }else if(aT2.equals("Guatamala")){
                if(amerScore > guatScore){
            tm.addWin("America");
            tm.addLoss("Guatamala");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else if(amerScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }
            }else if(aT2.equals("Brazil")){
                if(amerScore > brazScore){
            tm.addWin("America");
            tm.addLoss("Brazil");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else if(amerScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }
            }else; 
        }else if(hT2.equals("Mexico")){
            if(aT2.equals("America")){
                if(amerScore > mexScore){
            tm.addWin("America");
            tm.addLoss("Mexico");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else if(amerScore < mexScore){
            tm.addWin("Mexico");
            tm.addLoss("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }else{
            tm.addTie("Mexico");
            tm.addTie("America");
            tm.goalsGiv("America", mexScore);
            tm.goalsGiv("Mexico", amerScore); 
        }
            }else if(aT2.equals("Guatamala")){
                if(mexScore > guatScore){
            tm.addWin("Mexico");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else if(mexScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }
             
                
            }else if(aT2.equals("Brazil")){
                if(mexScore > brazScore){ 
            tm.addWin("Mexico");
            tm.addLoss("Brazil");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }
            }else;
             
            
        }else if(hT2.equals("Guatamala")){
            if(aT2.equals("Mexico")){
                if(mexScore > guatScore){
            tm.addWin("Mexico");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else if(mexScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", guatScore);
            tm.goalsGiv("Guatamala", mexScore); 
        }
            }else if(aT2.equals("America")){
                  if(amerScore > guatScore){
            tm.addWin("America");
            tm.addLoss("Guatamala");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else if(amerScore < guatScore){
            tm.addWin("Guatamala");
            tm.addLoss("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }else{
            tm.addTie("Guatamala");
            tm.addTie("America");
            tm.goalsGiv("America", guatScore);
            tm.goalsGiv("Guatamala", amerScore); 
        }
            }else if(aT2.equals("Brazil")){
                if(guatScore > brazScore){ 
            tm.addWin("Guatamala");
            tm.addLoss("Brazil");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }
            }else;
        }else if(hT2.equals("Brazil")){
            if(aT2.equals("Mexico")){
                if(mexScore > brazScore){ 
            tm.addWin("Mexico");
            tm.addLoss("Brazil");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Mexico");
            tm.goalsGiv("Mexico", brazScore);
            tm.goalsGiv("Brazil", mexScore); 
        }
            }else if(aT2.equals("America")){
                if(amerScore > brazScore){
            tm.addWin("America");
            tm.addLoss("Brazil");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else if(amerScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("America");
            tm.goalsGiv("America", brazScore);
            tm.goalsGiv("Brazil", amerScore); 
        }
            }else if(aT2.equals("Guatamala")){
                if(guatScore > brazScore){ 
            tm.addWin("Guatamala");
            tm.addLoss("Brazil");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else if(mexScore < brazScore){
            tm.addWin("Brazil");
            tm.addLoss("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }else{
            tm.addTie("Brazil");
            tm.addTie("Guatamala");
            tm.goalsGiv("Guatamala", brazScore);
            tm.goalsGiv("Brazil", guatScore); 
        }
            }else;
        }else;
        int hT1G = 0;
        int hT2G = 0;
        int aT1G = 0;
        int aT2G = 0;
        scrs[0] = amerScore;
        scrs[1] = brazScore;
        scrs[2] = mexScore;
        scrs[3] = guatScore;
        for(int i = 0; i < 4; i++){
            if(hT1.equals(tmz[i])){
                hT1G = scrs[i];
            }else if(hT2.equals(tmz[i])){
                hT2G = scrs[i];
            }else if(aT1.equals(tmz[i])){
                aT1G = scrs[i];
            }else if(aT2.equals(tmz[i])){
                aT2G = scrs[i];
            }else;

        }

        System.out.println("MATCHDAY SCORES:");
        System.out.println(hT1 + " " + hT1G + ", " + aT1 + " " + aT1G);
        System.out.println(hT2 + " " + hT2G + ", " + aT2 + " " + aT2G);

    }
    
    public void scheduleGames() {
         Random rand = new Random();
        int homeTeam1 =  rand.nextInt(teasm.size());
        hT1 = teasm.get(homeTeam1);
        teasm.remove(homeTeam1);
        int homeTeam2 = rand.nextInt(teasm.size());
        hT2 = teasm.get(homeTeam2);
        teasm.remove(homeTeam2);
        int awayTeam1 = rand.nextInt(teasm.size());
        aT1 = teasm.get(awayTeam1);
        teasm.remove(awayTeam1);
        int awayTeam2 = rand.nextInt(teasm.size());
        aT2 = teasm.get(awayTeam2);
        teasm.remove(awayTeam2); 
    }
    
}
