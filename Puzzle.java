import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle
{  private String puzzle;
   private String word;
   private String new1="";
private boolean true1=true;
    public Puzzle(){
        this.puzzle = new ArrayList<String>();
        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                this.puzzle.add(tempWord);
            }
            scanner.close();
			
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
   
}
    public boolean isUnsolved(){
      for (int i = 0; i < word.length(); i++) {
            if (!guesses.contains(""+word.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    }
    public boolean makeGuess(String guess){
        if(puzzle.contains(guess)){
           new1=guess;
            return true;  
          
        }else{
            new3=guess;
            return false;
       
        
        }  
    }
   public void show(){
       int i = 0;
       System.out.print("puzzle: ");
        while (i < word.length()) {
            if (guess.contains(""+word.charAt(i))) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_");
            }
            i++;
        }

        System.out.println("Guesses: ");
        int j = 0;
        while (j < guess.length()) {
            System.out.print(guess.charAt(j));
            j++;
            if (j != guess.length()) {
                System.out.print(",");
            }
        }
    }
    public String getWord(){
     return word;  
       
    }
}
