public class HangingMan {
    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                           
                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",
                           
                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",
                               
                               
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",
                               
                               
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",
                               
                               
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
 public HangingMan(){
    }
 public void show(){
     System.out.println(HangmanImage[numWrongGuesses]);
    }
 public void dieSomeMore(){
     numWrongGuesses= numWrongGuesses+1;
    // System.out.println(HangmanImage[x]);
    
    }
    public  boolean isntDead(){
        if(numWrongGuesses==6){
         return false;  
        }else{
        return true;
    }    }
}



