/* Game 
* As a tonurnament goes, games are played 1 by 1. 
* The tonurnament manager types the names,  the points and the winner of the players retaining the order in the pile.
* 
* 
* Author Frank Wang 
* Date : 13.02.19
 */

public class Game
{
    // Declare the fields for each game
    private String date; 
    private String name1;
    private String name2;
    private String score1;
    private String score2;
    private String winner; 
    
    public Game next; // the pointer to the next game  
 

    // The  constructor methods for a gmae
    // To create an empty record:
    public Game () {
        date = null;
        name1 = null;
        name2 = null;
        score1=null;
        score2=null; 
        winner=null; 
        next = null;
    }

    // To create a record with inputted information:
    public Game (String newDate, String newName1, String newName2, String newScore1, String newScore2,String newWinner)
    {
        date = newDate; 
        name1 = newName1;
        name2 = newName2;
        score1= newScore1;
        score2= newScore2;
        winner= newWinner; 
        next = null;
    }
    
    

    // Getter (or accessor) methods
    public String getDate ()
    {
        return date;
    }
    public String getName1 ()
    {
        return name1;
    }
    public String getName2 ()
    {
        return name2;
    }
    public String getScore1 ()
    {
        return score1;
    }
     public String getScore2 ()
    {
        return score2;
    }
     public String getWinner ()
     {
        
         return winner;
        }
    public Game getNext ()
     {
        
         return next;
        }

    // Setter (or mutator) methods
     public void setDate (String newDate)
    {
        date=newDate;
    }
    public void setName1 (String newName1)
    {
        name1=newName1;
    }
    public void setName2 (String newName2)
    {
         name2=newName2;
    }
    public void setScore1 (String newScore1)
    {
         score1=newScore1;
    }
     public void setScore2 (String newScore2)
    {
         score2=newScore2;
    }
     public void setWinner (String newWinner)
     {
        
         winner=newWinner;
        }
    public void setNext (Game newNext)
     {
        
          next=newNext;
        }
}