/**
 * Carl's Tic Tac Toe
 * 
 * Author: CL
 * Version: Rocking 1.1
 * This program is a tictactoe game program, have fun with it!
 */

public class TicTacToe
{
    // all projects have a main method somewhere that allows them to run
    public static void main(String[] args)
    {
        new TicTacToe();
    }

    // Constructor method to actually make objects of the class TemperatureConverter

    public TicTacToe () 
    {
   //declare important variables
   int times=0;
   char [][] board=new char [3][3];
   String player1,player2;   
   int stop=0,repetition=1,outofRange=0;
   int Yaxis=0,Xaxis=0,Yaxis1=0,Xaxis1=0;
   //let the players to input their names and show their takon
   player1=input("Player1, please enter your name: ");
   player2=input("Player2, please enter your name: ");
   System.out.println();
   System.out.print(player1+", A will be your symbol.");
   System.out.println();
   System.out.print(player2+", B will be your symbol.");
   //first it will print out an initial board that has no token on it
   System.out.println();
   System.out.println("  1 2 3");
   for (int y=0;y<=2;y++)
   {    System.out.print(y+1);
       for (int x=0; x<=2; x++)
       {
           System.out.print(" ");
           board[y][x]='~';
           System.out.print(board[y][x]);
        }//end for loop
       System.out.println();
       
    }//end for loop
    //this while loop will keep the codes in it running until somebody wins or the board is full.
   while (stop==0)
   {    
       //this while loop will keep running until a player enters a right location of his token.
       while (outofRange==0)
       {Yaxis=inputInt ("What is your horizontal location "+player1+": ");
        Xaxis=inputInt ("What is your vertical location "+player1+": ");
        //this if statement will check if the location is in the correct range.
        if(Yaxis>3||Yaxis<1||Xaxis>3||Xaxis<1)
        {
            System.out.println ("Sorry, your location is out of range.");
        }//end if statement
        //this one will check if the location is not occupied by other token.
        else if(board[Yaxis-1][Xaxis-1]=='~')
        {
            outofRange=1;
            break;
        }//end if statement
        //any other cases should be wrong whatever what the user does, let the user re-enter the value.
        else
        {
            System.out.println("Sorry, there are some errors in your location, please re-enter it.");
        }//end if statement
    }//end while loop
        //reset outofRange variable so that upper codes will be run in the next turn if nobody wins in this turn.
       outofRange=0;
       //put a token to the location player inputs.
       board[Yaxis-1][Xaxis-1]='A';
       //prints out the board so the players know what is going on clearly. 
   System.out.println("  1 2 3");
   for (int y=0;y<=2;y++)
   {    System.out.print(y+1);
       for (int x=0; x<=2; x++)
       {
           System.out.print(" ");
           System.out.print(board[y][x]);
        }//end for loop
       System.out.println();
       
    }//end for loop
        
       //below if statements are for the checking process, i wrote all the possible ways to win the game, once any of these is qualified, that means player1 has won the game, then end the game. 
       if(board[0][0]=='A'&&board[0][1]=='A'&&board[0][2]=='A')
    {   
        System.out.println (player1+" wins!");
        stop=1;
        break;
    }
    else if(board[1][0]=='A'&&board[1][1]=='A'&&board[1][2]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[2][0]=='A'&&board[2][1]=='A'&&board[2][2]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[0][2]=='A'&&board[1][1]=='A'&&board[2][0]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[0][0]=='A'&&board[1][1]=='A'&&board[2][2]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[0][0]=='A'&&board[1][0]=='A'&&board[2][0]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[0][1]=='A'&&board[1][1]=='A'&&board[2][1]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
    else if(board[0][2]=='A'&&board[1][2]=='A'&&board[2][2]=='A')
    {   
        System.out.println(player1+" wins!");
        stop=1;
        break;
    }
        else if(times==4)
    {
        System.out.println("Looks like none wins, this is a tie!");
        stop=1;
        break;
    }
        
    //all codes below are a copy version of upper codes, but these codes will be run for player2.
        
    
        while(outofRange==0)
       {Yaxis1=inputInt ("What is your horizontal location "+player2+": ");
        Xaxis1=inputInt ("What is your vertical location "+player2+": ");
        if(Yaxis1>3||Yaxis1<1||Xaxis1>3||Xaxis1<1)
        {
         System.out.println ("Sorry, your location is out of range.");
        }//end if statement
        else if (board[Yaxis1-1][Xaxis1-1]!='~')
        {
         System.out.println("Your location already has been occupied! Plrease choose another one.");
        }//end if statement
        else if(board[Yaxis1-1][Xaxis1-1]=='~')
        {
            outofRange=1;
        }//end if statement
        else
        {
            System.out.println("Sorry, there are some errors in your location, please re-enter it.");
        }//end else statement
        }//end while loop
       
       outofRange=0;
       //because this is player2 now, so he has a different token.
       board[Yaxis1-1][Xaxis1-1]='B';
       
   System.out.println("  1 2 3");
   for (int y=0;y<=2;y++)
   {    System.out.print(y+1);
       for (int x=0; x<=2; x++)
       {
           System.out.print(" ");
           System.out.print(board[y][x]);
        }//end for loop
       System.out.println();
       
    }//end for loop
        
        //same logic to those codes for player2, these codes check if player2 wins or not, and out put the result if player2 wins.
    if(board[0][0]=='B'&&board[0][1]=='B'&&board[0][2]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
        else if(board[1][0]=='B'&&board[1][1]=='B'&&board[1][2]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
        else if(board[2][0]=='B'&&board[2][1]=='B'&&board[2][2]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
        else if(board[0][0]=='B'&&board[1][1]=='B'&&board[2][2]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
        else if(board[0][2]=='B'&&board[1][1]=='B'&&board[2][0]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
     else if(board[0][0]=='B'&&board[1][0]=='B'&&board[2][0]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
        else if(board[0][1]=='B'&&board[1][1]=='B'&&board[2][1]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
    else if(board[0][2]=='B'&&board[1][2]=='B'&&board[2][2]=='B')
    {   
        System.out.println(player2+" wins!");
        stop=1;
        break;
    }
    else if(times==4)
    {
        System.out.println("Looks like none wins, this is a tie!");
        stop=1;
        break;
    }
    //this variable will count for how many turns have been completed, once this number becomes 9, it means the whole board is full, then the game will be tie.
    times++;
    }

       
    
                
            
     
    
}






/* ------- DO NOT EDIT BELOW THIS LINE ---------------*/

/* IBIO standard input and output 
* ============================================================ 
* Copy these into the source code for all algorithms or save them as a separate Class
* Use them but remember to give the IBO credit for these methods (don't claim them as your own)
* You need to understand the USE of these methods, not memorize their code. 
* ============================================================ 
*/

// Output methods

   static void output (String info) 
   {
      System.out.println (info);
   } 
   
   static void output (char info) 
   {
      System.out.println (info);
   }
   
   static void output (byte info) 
   {
      System.out.println (info);
   } 
   
   static void output (int info) 
   {
      System.out.println(info);
   } 
   
   static void output (long info) 
   {
      System.out.println (info);
   } 
   
   static void output (double info) 
   {
      System.out.println (info);
   }
   
   static void output (boolean info) 
   {
      System.out.println(info);
   } 

// Input methods

   static String input (String prompt) 
   {
      String inputLine = ""; 
      System.out.print (prompt); 
      try 
      {
         inputLine = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine(); 
      } 
      catch (Exception e) 
      {
         String err = e.toString(); 
         System.out.println(err); 
         inputLine = ""; 
      } 
      return inputLine; 
   }
   
   static String inputString (String prompt) 
   {
      return input (prompt);
   } 
   
   static String input () 
   {
      return input ("");
   }
   
   static int inputInt () 
   {
      return inputInt ("");
   }
   
   static double inputDouble () 
   {
      return inputDouble ("");
   } 
   
   static char inputChar (String prompt) 
   {
      char result = (char) 0; 
      try
      {
         result=input (prompt).charAt(0);
      }
      catch (Exception e)
      {
         result = (char) 0;
      } 
      return result; 
   }
   
   static byte inputByte (String prompt) 
   {
      byte result = 0; 
      try
      {
         result = Byte.valueOf(input(prompt).trim()).byteValue();
      } 
      catch (Exception e)
      {
         result = 0;
      } 
      return result; 
   }
   
   static int inputInt (String prompt) 
   {
      int result = 0; 
      try
      {
         result = Integer.valueOf(input(prompt).trim()).intValue();
      } 
      catch (Exception e)
      {
         result = 0;
      } 
      return result; 
   }
   
   static long inputLong (String prompt) 
   {
      long result = 0; 
      try
      {
         result = Long.valueOf(input(prompt).trim()).longValue();
      } 
      catch (Exception e)
      {
         result = 0;
      } 
      return result; 
   }
   
   static double inputDouble (String prompt) 
   {
      double result = 0; 
      try
      {
         result = Double.valueOf(input(prompt).trim()).doubleValue();
      } 
      catch (Exception e)
      {
         result = 0;
      } 
      return result; 
   }
   
   static boolean inputBoolean (String prompt) 
   {
      boolean result = false; 
      try
      {
         result = Boolean.valueOf(input(prompt).trim()).booleanValue();
      } 
      catch (Exception e)
      {
         result = false;
      } 
      return result; 
   }
   
//=========== end IBIO methods ===========================================// 

}