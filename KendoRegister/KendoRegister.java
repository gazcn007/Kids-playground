
/**
 * Main class of my KendoRegister 
 * Builds and operates the data structure for players and games 
 * Frank Wang 
 * 13.02.19
 */
public class KendoRegister
{
    // every tree starts with a root node
    public static Player root;
    public static Game front; 
    public static Game back=front;
    
    
    // the main class
    public static void main(String[] args)
    {
        new KendoRegister ();
    }
    
    // the constructor method 
    public KendoRegister ()
    {
        // An introduction and welcome message
        
        System.out.println("Welcome to XXXXX Kendo Tournament! Hope you have fun and succeed in the game");
        
    
    
    // the option menu
    while(true)
    {
      System.out.println("");
      System.out.println("Type 1 to add a player; 2 to run a game; 3 to display the players;");
      System.out.println("Type 4 to display the game results; 5 to search for a player; 6 to track a player's performance in games; ");
      System.out.println("Type 0 to exit;");
      int choice =IBIO.inputInt(); 
      
      if(choice == 0)
      {
        break; 
        }
      
      else if(choice == 1)
      {
        String newName=IBIO.inputString("Name? ");
        char newGender=IBIO.inputChar("Gender? "); 
        String newTeam=IBIO.inputString("Team? ");
        int newRank = IBIO.inputInt("Rank? ");
        Player newPlayer = new Player( newName,  newGender,  newTeam, newRank);
        insertNode (newPlayer);
          
        }
        
       else if(choice==2)
       {
           String newDate = IBIO.inputString("Date? ");
           String newName1= IBIO.inputString("Player1's name? ");
           String newName2= IBIO.inputString("Player2's name? ");
           String newScore1=IBIO.inputString("Player1's score? (Type it in a sequence of characters continuously, M for head, K for wrist, D for body, and T for throat). ");
           String newScore2=IBIO.inputString("Player1's score? (Type it in a sequence of characters continuously, M for head, K for wrist, D for body, and T for throat). ");
           String newWinner=IBIO.inputString("Winner? "); 
           Game newGame = new Game(newDate, newName1, newName2, newScore1, newScore2, newWinner);
           insertGame( newGame);
        }
        
      else if(choice == 3)
      {
        displayRegister (root);
          
        }
        
       else if (choice==4)
       {
         displayGames (front); 
           
        }
      else if (choice==5)
      {
        String wantedName = IBIO.inputString("Whose information do you want to view? ");
        searchFor(wantedName); 
          
        }
        
      else if(choice==6)
      {
        
          String wantedName = IBIO.inputString("Whose performance in games do you want to view? ");
          
          trackFor(wantedName); 
        }
      
      
      
    } // end while 
    
  } // KendoRegister
  
  // method to append a terminal node to the correct branch
  static void insertNode (Player newPlayer)
    {
        // if the tree is empty...
        if (root == null)
            root = newPlayer;
        
        else
        {
        // if not, a temporary node to traverse the tree
        Player runner;
        runner = root;
        while (true) //keep going until correct position is found and then insert
        {
            // compare the two names
            // if the new name comes before, go left...
            if (newPlayer.getName().compareTo (runner.getName()) < 0)
            {
                // and if that node is empty...
                if (runner.getLeft() == null )
                {
                    runner.setLeft(newPlayer);
                    break;
                }
                else // otherwise just go left  
                    runner = runner.getLeft();

            }
            else
            {
                // new name comes after so we go right...
                if (runner.getRight() == null) 
                {
                    runner.setRight(newPlayer);
                    break;
                }
                else
                    runner = runner.getRight();
            }
        }
    }
    }
    // a method to put the latest game played into the queue of games played in the same event
    public static void insertGame (Game newGame)
    {
    
        //check if the queue is empty 
        if(back==null)
        {
        
            front=newGame;
            back=newGame;
            newGame.setNext(null);
        }
        // if not, insert it to the end
        else 
        {
        
            Game current = back; 
            current.setNext(newGame);
            back=newGame;
            newGame.setNext(null); 
        }
    }
    // a recursive method for displaying the contents of the tree in alphabetical order
    public static void displayRegister (Player node)
    {
      
        if(node!=null)
        {
        
            displayRegister(node.getLeft());
            System.out.println("Name: "+node.getName());
            System.out.println("Gender: "+node.getGender());
            System.out.println("Team: "+node.getTeam());
            System.out.println("Rank: "+node.getRank());
            System.out.println(" ");
            displayRegister(node.getRight()); 
        }
    }
    
    public static void displayGames (Game runner)
    {
    
        while(runner!=null)
        {
        
            System.out.println(" ");
            System.out.println("Date: " + runner.getDate() );
            System.out.println("Player1's name: " + runner.getName1() );
            System.out.println("Player2's name: " + runner.getName2() );
            System.out.println("Player1's score: " + runner.getScore1() );
            System.out.println("Player2's score: " + runner.getScore2() );
            System.out.println("Winner: " + runner.getWinner() );
            System.out.println(" ");
            runner=runner.getNext();
        }
    }
    
    // a recursive method for searchiing for a player in alphabetical order
    public static void searchFor (String wantedName)
    {
         // if the tree is empty...
        if (root == null)
        {
            System.out.println("Sorry, this person has not yet registered in the game. ");
        }
        
        else
        {
        // if not, a temporary node to traverse the tree
        Player runner;
        runner = root;
        while (true) //keep going until correct position is found and then insert
        {
            // compare the two names 
            // if this is the wanted name
            if(wantedName.compareTo (runner.getName()) == 0)
            {
            
                System.out.println("Name: "+runner.getName());
                System.out.println("Gender: "+runner.getGender());
                System.out.println("Team: "+runner.getTeam());
                System.out.println("Rank: "+runner.getRank());
                System.out.println(" ");
                break;
            }
            // if the new wanted name comes before, go left...
            else if (wantedName.compareTo (runner.getName()) < 0)
            {
                // and if that node is empty...
                if (runner.getLeft() == null )
                {
                    System.out.println("Sorry, this person has not yet registered in the game. ");
                    break;
                }
                else // otherwise just go left  
                    runner = runner.getLeft();

            }
            else
            {
                // new name comes after so we go right...
                if (runner.getRight() == null) 
                {
                    System.out.println("Sorry, this person has not yet registered in the game. ");
                    break;
                }
                else
                    runner = runner.getRight();
            }
        }
    }
    }
    
    public static void trackFor(String wantedName)
    {
    
        Game runner = front; 
        while(runner!=null)
        {
        
            if(runner.getName1().compareTo(wantedName)==0 ||runner.getName2().compareTo(wantedName)==0 )
            {
              System.out.println(" ");
              System.out.println("Date: " + runner.getDate() );
              System.out.println("Player1's name: " + runner.getName1() );
              System.out.println("Player2's name: " + runner.getName2() );
              System.out.println("Player1's score: " + runner.getScore1() );
              System.out.println("Player2's score: " + runner.getScore2() );
              System.out.println("Winner: " + runner.getWinner() );
              System.out.println(" ");
              
                
            }
            runner=runner.getNext();
        }
    }
}