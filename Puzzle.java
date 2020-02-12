import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle
{  private String puzzle;
   private String new1="";
   private String new3="";
private String new4="";
private String new5="";
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
       if(true1){
          return true; 
        }else{
            return false;}
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
       int j=this.puzzle.length();
        new4=new4+" "+new3;
        new5=new5+new1;
      for(int i=0;i<new5.length();i++){
         
    for(int z=0;z<this.puzzle.length();z++){
        String new6=new5.substring(i,i+1);
        String new2=this.puzzle.substring(z,z+1);
             if(new6.equals(new2)){
                 System.out.print(new6);
                 j--;
        }else{
           System.out.print("_");  
        j--;}
        }
      while(j>0){
           System.out.print("_");  
          j--;
        }
    }
    if(new5.length()>=this.puzzle.length()){
    for(int i=0;i<new5.length();i++){
       
       
    }
}
       System.out.println(" ");
       System.out.print("Wrong:");
     
         System.out.print(new4);
    }
    public String getWord(){
     return this.puzzle;  
       
    }
}
