
/**
 * This class collects all the methods that would be called in the main class.
 * 
 * Carl Liu
 * 2.0
 */
public class methods
{
      static  int initialX=0,initialY=0;
      static  int finalX=0,finalY=0;
    public static void outputBoard(String board [][])
    {
       System.out.println();
       System.out.println("Here is your chess board");
       System.out.println("    a    b    c    d    e    f    g    h");
       System.out.println("  -----------------------------------------");
       for (int y=0;y<=7;y++)
    {   System.out.print(y+" ");
        for (int x=0;x<=7;x++)
        {
            System.out.print("|");
            System.out.print(board[y][x]);
        }
        System.out.print("|");
        System.out.println();
        System.out.println("  -----------------------------------------");
    }
    }
    
    public static void player1ChoosesInitialPiece (String board[][],String player1)
    { String initialLocation;
      int noError=0,noError1=0;
      String temp;
      int temp1;
     while (noError==0)
     {   
         while(noError1==0)
       {
       System.out.println();
       initialLocation=IBIO.input(player1+" , you are using the black pieces. You will go first. Which chess piece do you want to move (row column): ");
       if (initialLocation.length()!=2)
       {
           break;
        }
       temp1 = Character.getNumericValue(initialLocation.charAt(0));
       if (temp1>=0&&temp1<=7&&initialLocation.charAt(1)>='a'&&initialLocation.charAt(1)<='h')
       {
           initialY=temp1;
           noError1=1;
           if(initialLocation.charAt(1)=='a')
           {
               initialX=0;
            }
           else if(initialLocation.charAt(1)=='b')
           {
               initialX=1;
            }
           else if(initialLocation.charAt(1)=='c')
           {
               initialX=2;
            }
           else if(initialLocation.charAt(1)=='d')
           {
               initialX=3;
            }
           else if(initialLocation.charAt(1)=='e')
           {
               initialX=4;
            }
            else if(initialLocation.charAt(1)=='f')
           {
               initialX=5;
            }
            else if(initialLocation.charAt(1)=='g')
           {
               initialX=6;
            }
            else
           {
               initialX=7;
            }
        }
       else 
       {noError1=0;
        System.out.println();
        System.out.println("There is an error in your input, please check if you are inputing a right location");
        }
      }
      temp=board[initialY][initialX];
      if (temp.charAt(1)!='B')
      {
         noError=0;
         noError1=0;
         System.out.println();
         System.out.println("The location you input doesn't not have a chess piece that belongs to you.");
         System.out.println();
         System.out.println("Please re-type your location.");
       }
       else
       {break;}
      }
    }
    
     public static void player2ChoosesInitialPiece (String board[][],String player2)
    { String initialLocation;
      int noError=0,noError1=0;
      String temp;
      int temp1;
     while (noError==0)
     {   
         while(noError1==0)
       {
       System.out.println();
       initialLocation=IBIO.input(player2+" , you are using the white pieces. You will go first. Which chess piece do you want to move (row column): ");
       if (initialLocation.length()!=2)
       {
           break;
        }
       temp1 = Character.getNumericValue(initialLocation.charAt(0));
       if (temp1>=0&&temp1<=7&&initialLocation.charAt(1)>='a'&&initialLocation.charAt(1)<='h')
       {
           initialY=temp1;
           noError1=1;
           if(initialLocation.charAt(1)=='a')
           {
               initialX=0;
            }
           else if(initialLocation.charAt(1)=='b')
           {
               initialX=1;
            }
           else if(initialLocation.charAt(1)=='c')
           {
               initialX=2;
            }
           else if(initialLocation.charAt(1)=='d')
           {
               initialX=3;
            }
           else if(initialLocation.charAt(1)=='e')
           {
               initialX=4;
            }
            else if(initialLocation.charAt(1)=='f')
           {
               initialX=5;
            }
            else if(initialLocation.charAt(1)=='g')
           {
               initialX=6;
            }
            else
           {
               initialX=7;
            }
        }
       else 
       {noError1=0;
        System.out.println();
        System.out.println("There is an error in your input, please check if you are inputing a right location");
        }
      }
      temp=board[initialY][initialX];
      if (temp.charAt(1)!='W')
      {
         noError=0;
         noError1=0;
         System.out.println();
         System.out.println("The location you input doesn't not have a chess piece that belongs to you.");
         System.out.println();
         System.out.println("Please re-type your location.");
       }
       else
       {
        break;}
      }
    }
    
    public static void player1move(String board[][],String player1)
    { String finalLocation;
      int noError=0,noError1=0;
      String temp;
      int temp1;
      while(noError1==0)
       {
       System.out.println();
       finalLocation=IBIO.input(player1+" , where do you want to move this piece to (row column): ");
       if (finalLocation.length()!=2)
       {
           break;
        }
       temp1 = Character.getNumericValue(finalLocation.charAt(0));
       if (temp1>=0&&temp1<=7&&finalLocation.charAt(1)>='a'&&finalLocation.charAt(1)<='h')
       {
           finalY=temp1;
           noError1=1;
           if(finalLocation.charAt(1)=='a')
           {
               finalX=0;
            }
           else if(finalLocation.charAt(1)=='b')
           {
               finalX=1;
            }
           else if(finalLocation.charAt(1)=='c')
           {
               finalX=2;
            }
           else if(finalLocation.charAt(1)=='d')
           {
               finalX=3;
            }
           else if(finalLocation.charAt(1)=='e')
           {
               finalX=4;
            }
            else if(finalLocation.charAt(1)=='f')
           {
               finalX=5;
            }
            else if(finalLocation.charAt(1)=='g')
           {
               finalX=6;
            }
            else
           {
               finalX=7;
            }
        }
       else 
       {noError1=0;
        System.out.println();
        System.out.println("There is an error in your input, please check if you are inputing a right location");
        }
      }
    }
    
    public static void player2move(String board[][],String player2)
    { String finalLocation;
      int noError=0,noError1=0;
      String temp;
      int temp1;
      while(noError1==0)
       {
       System.out.println();
       finalLocation=IBIO.input(player2+" , where do you want to move this piece to (row column): ");
       if (finalLocation.length()!=2)
       {
           break;
        }
       temp1 = Character.getNumericValue(finalLocation.charAt(0));
       if (temp1>=0&&temp1<=7&&finalLocation.charAt(1)>='a'&&finalLocation.charAt(1)<='h')
       {
           finalY=temp1;
           noError1=1;
           if(finalLocation.charAt(1)=='a')
           {
               finalX=0;
            }
           else if(finalLocation.charAt(1)=='b')
           {
               finalX=1;
            }
           else if(finalLocation.charAt(1)=='c')
           {
               finalX=2;
            }
           else if(finalLocation.charAt(1)=='d')
           {
               finalX=3;
            }
           else if(finalLocation.charAt(1)=='e')
           {
               finalX=4;
            }
            else if(finalLocation.charAt(1)=='f')
           {
               finalX=5;
            }
            else if(finalLocation.charAt(1)=='g')
           {
               finalX=6;
            }
            else
           {
               finalX=7;
            }
        }
       else 
       {noError1=0;
        System.out.println();
        System.out.println("There is an error in your input, please check if you are inputing a right location");
        }
      }
    }
    
    public static int player1movepawn(String board[][],int correct)
    {
        if (initialY==1&&finalX==initialX&&finalY-initialY==2&&board[initialY+1][initialX]=="    "&&board[finalY][finalX]=="    ")
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX==initialX&&finalY-initialY==1&&board[finalY][finalX]=="    ")
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)=='W'||finalX-initialX==-1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)=='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
        
    }
    
    public static int player2movepawn(String board[][],int correct)
    {
        if (initialY==6&&finalX==initialX&&finalY-initialY<=-2&&board[initialY-1][initialX]=="    "&&board[finalY][finalX]=="    ")
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX==initialX&&finalY-initialY==-1&&board[finalY][finalX]=="    ")
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)=='B'||finalX-initialX==-1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)=='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
    }
    
        public static int player1moveknight(String board[][],int correct)
    {
        if (finalX-initialX==2&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX-initialX==2&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-2&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-2&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==2&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==-2&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-1&&finalY-initialY==2&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-1&&finalY-initialY==-2&&board[finalY][finalX].charAt(1)!='B')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
    }
    
            public static int player2moveknight(String board[][],int correct)
    {
        if (finalX-initialX==2&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";
            correct=1;
        }
        else if(finalX-initialX==2&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-2&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-2&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==2&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==1&&finalY-initialY==-2&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-1&&finalY-initialY==2&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else if(finalX-initialX==-1&&finalY-initialY==-2&&board[finalY][finalX].charAt(1)!='W')
        {
            board[finalY][finalX]=board[initialY][initialX];
            board[initialY][initialX]="    ";       
            correct=1;
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
    }
    
    public static int player1moveRook(String board[][],int correct)
    {   int temp=0;
        if (finalX==initialX&&board[finalY][finalX].charAt(1)!='B')
        {
            if (finalY>initialY)
            {
                for(int y=initialY+1; y<finalY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                    if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
                
            }
            else if (finalY<initialY)
            {
                for(int y=finalY+1; y<initialY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)    
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
            }
        }
        
        else if (finalY==initialY&&board[finalY][finalX].charAt(1)!='B')
        {
            if (finalX>initialX)
            {
                for(int x=initialX+1; x<finalX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
            else if (finalX<initialX)
            {
                for(int x=finalX+1; x<initialX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
    }
    
    public static int player2moveRook(String board[][],int correct)
    {
        int temp=0;
        if (finalX==initialX&&board[finalY][finalX].charAt(1)!='W')
        {
            if (finalY>initialY)
            {
                for(int y=initialY+1; y<finalY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
            else if (finalY<initialY)
            {
                for(int y=finalY+1; y<initialY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
               if (temp==0)
               {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
        }
        else if (finalY==initialY&&board[finalY][finalX].charAt(1)!='W')
        {
            if (finalX>initialX)
            {
                for(int x=initialX+1; x<finalX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
                
            }
            else if (finalX<initialX)
            {
                for(int x=finalX+1; x<initialX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
                
                }
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
    }


    public static int player1moveBishop (String board[][],int correct)
    {
       int temp=0;
    if (finalX-initialX==finalY-initialY&&board[finalY][finalX].charAt(1)!='B')
    {   
           if (finalX-initialX>0)
           {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
            }
            if (temp==0)
            {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
            }  
            
           }
    
            else if (finalX-initialX<0)
            {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
            }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
            }
    }
    else if (finalX-initialX==-(finalY-initialY)&&board[finalY][finalX].charAt(1)!='B')
    {   
            if (finalX>initialX)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
            }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }  
            
            }
            else if (finalX<initialX)
            {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
           }
    }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        
    

return correct;
}

 public static int player2moveBishop (String board[][],int correct)
    {
       int temp=0;
     if (finalX-initialX==finalY-initialY&&board[finalY][finalX].charAt(1)!='W')
        {   
            if (finalX-initialX>0)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }  
            }
            else if (finalX-initialX<0)
            {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
              }
         }
     else if (finalX-initialX==-(finalY-initialY)&&board[finalY][finalX].charAt(1)!='W')
        {   
            if (finalX>initialX)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }  
            
        }
        else if (finalX<initialX)
        {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
        }
    }
    else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        
    

        return correct;
}

public static int player1moveQueen(String board[][],int correct)
    {
       int temp=0;
        if (finalX==initialX&&board[finalY][finalX].charAt(1)!='B')
           {
            if (finalY>initialY)
            {
                for(int y=initialY+1; y<finalY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                }
                
           }
        
           else if (finalY<initialY)
          {
                for(int y=finalY+1; y<initialY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)    
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
            }
        }
        else if (finalY==initialY&&board[finalY][finalX].charAt(1)!='B')
        {
            if (finalX>initialX)
            {
                for(int x=initialX+1; x<finalX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
            else if (finalX<initialX)
            {
                for(int x=finalX+1; x<initialX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
        }
       else if (finalX-initialX==finalY-initialY&&board[finalY][finalX].charAt(1)!='B')
        {   
            if (finalX-initialX>0)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
            {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
            }  
            }
        else if (finalX-initialX<0)
        {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY+x][initialY+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
        }
    }
        else if (finalX-initialX==-(finalY-initialY)&&board[finalY][finalX].charAt(1)!='B')
        {   
            if (finalX>initialX)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }  
            
            }
            else if (finalX<initialX)
           {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
            }
        }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        
    

        return correct;
    }
    
   
    public static int player2moveQueen(String board[][],int correct)
    {
        int temp=0;
        if (finalX==initialX&&board[finalY][finalX].charAt(1)!='W')
        {
            if (finalY>initialY)
            {
                for(int y=initialY+1; y<finalY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                    if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
                
            }
            else if (finalY<initialY)
            {
                for(int y=finalY+1; y<initialY;y++)
                {
                    if (board[y][finalX]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)    
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }
                }
         }
        
        else if (finalY==initialY&&board[finalY][finalX].charAt(1)!='W')
        {
            if (finalX>initialX)
            {
                for(int x=initialX+1; x<finalX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
            else if (finalX<initialX)
            {
                for(int x=finalX+1; x<initialX;x++)
                {
                    if (board[finalY][x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
                if (temp==0)
                {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    
                }
            }
        }
       else if (finalX-initialX==finalY-initialY&&board[finalY][finalX].charAt(1)!='W')
        {   
            if (finalX-initialX>0)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY+x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
            {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
            }  
            
        }
        else if (finalX-initialX<0)
        {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY+x][initialY+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
        }
    }
        else if (finalX-initialX==-(finalY-initialY)&&board[finalY][finalX].charAt(1)!='W')
        {   
            if (finalX>initialX)
            {
            for (int x=1; x<finalX-initialX;x++)
            {
                    if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    }  
            
        }
        else if (finalX<initialX)
        {
            for (int x=-1;x>finalX-initialX;x--)
            {
                if (board[initialY-x][initialX+x]!="    ")
                    {
                      correct=0;
                      System.out.println();
                      System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
                      temp=1;
                      break;
                    }
                }
            if (temp==0)
                    {
                        board[finalY][finalX]=board[initialY][initialX];
                        board[initialY][initialX]="    ";       
                        correct=1;
                    } 
            
        }
    }
        else
        {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        
    

        return correct;
}
    
     public static int player1moveKing(String board[][],int correct)
     {
         if (finalX-initialX==1&&finalY-initialY==0&&board[finalY][finalX].charAt(1)!='B'||finalX-initialX==1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='B'||finalX-initialX==1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='B')
         {
             board[finalY][finalX]=board[initialY][initialX];
             board[initialY][initialX]="    ";       
             correct=1;
         } 
         else if (finalX-initialX==-1&&finalY-initialY==0&&board[finalY][finalX].charAt(1)!='B'||finalX-initialX==-1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='B'||finalX-initialX==-1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='B')
         {
             board[finalY][finalX]=board[initialY][initialX];
             board[initialY][initialX]="    ";       
             correct=1;
         } 
         else
         {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
        }
        
        public static int player2moveKing(String board[][],int correct)
     {
         if (finalX-initialX==1&&finalY-initialY==0&&board[finalY][finalX].charAt(1)!='W'||finalX-initialX==1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='W'||finalX-initialX==1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='W')
         {
             board[finalY][finalX]=board[initialY][initialX];
             board[initialY][initialX]="    ";       
             correct=1;
         } 
         else if (finalX-initialX==-1&&finalY-initialY==0&&board[finalY][finalX].charAt(1)!='W'||finalX-initialX==-1&&finalY-initialY==1&&board[finalY][finalX].charAt(1)!='W'||finalX-initialX==-1&&finalY-initialY==-1&&board[finalY][finalX].charAt(1)!='W')
         {
             board[finalY][finalX]=board[initialY][initialX];
             board[initialY][initialX]="    ";       
             correct=1;
         } 
         else
         {
            correct=0;
            System.out.println();
            System.out.println("Sorry, you cannot move to there, please move to somewhere else.");
        }
        return correct;
        }
         public static int checkforWinner1 (String board[][],int win)
     {
         win=1;
         for (int y=0;y<=7;y++)
         {  for (int x=0;x<=7;x++)
            {
                if (board[y][x]==" WK ")
                {
                    win=0;
                    break;
                }

            }
        }
        return win;
}

         public static int checkforWinner2 (String board[][],int win)
     {
         win=1;
         for (int y=0;y<=7;y++)
         {  for (int x=0;x<=7;x++)
            {
                if (board[y][x]==" BK ")
                {
                    win=0;
                    break;
                }

            }
        }
        return win;
}

public static void player1upgrade (String board[][],String player1)
     {   int choose=0;
         System.out.println("Congrats "+player1+", now you get a chance to upgrade your pawn into the following things:");
         System.out.println("1.Knight");
         System.out.println("2.Rook");
         System.out.println("3.Bishop");
         System.out.println("4.Queen");
         choose=IBIO.inputInt("Which one do you want to upgrade to: ");
         if (choose==1)
         {
             board[finalY][finalX]=" BKn";
            }
         else if(choose==2)
         {
             board[finalY][finalX]=" BR ";
            }
         else if (choose==3)
         {
             board[finalY][finalX]=" BB ";
            }
         else if (choose==4)
         {
             board[finalY][finalX]=" BQ ";
            }
}


public static void player2upgrade (String board[][],String player2)
     {   int choose=0;
         System.out.println("Congrats "+player2+", now you get a chance to upgrade your pawn into the following things:");
         System.out.println("1.Knight");
         System.out.println("2.Rook");
         System.out.println("3.Bishop");
         System.out.println("4.Queen");
         choose=IBIO.inputInt("Which one do you want to upgrade to: ");
         if (choose==1)
         {
             board[finalY][finalX]=" WKn";
            }
         else if(choose==2)
         {
             board[finalY][finalX]=" WR ";
            }
         else if (choose==3)
         {
             board[finalY][finalX]=" WB ";
            }
         else if (choose==4)
         {
             board[finalY][finalX]=" WQ ";
            }
}

}

