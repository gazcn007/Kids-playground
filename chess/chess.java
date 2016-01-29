
/**
 * Chess Game
 * 
 * Carl Liu
 * 2.0
 * This program will be used by users to play a chess game
 */
public class chess
{
        public static void main(String[] args) {
        new chess();
    }
    public chess()
    {   int correct=0;
        int win=0;
        String [][] board={{" BR ", " BKn", " BB ", " BQ "," BK "," BB "," BKn"," BR "},
                           {" BP ", " BP ", " BP ", " BP "," BP "," BP "," BP "," BP "}, 
                           {"    ", "    ", "    ", "    ","    ","    ","    ","    "},
                           {"    ", "    ", "    ", "    ","    ","    ","    ","    "},
                           {"    ", "    ", "    ", "    ","    ","    ","    ","    "},
                           {"    ", "    ", "    ", "    ","    ","    ","    ","    "},
                           {" WP ", " WP ", " WP ", " WP "," WP "," WP "," WP "," WP "},
                           {" WR ", " WKn", " WB ", " WQ "," WK "," WB "," WKn"," WR "}
                          };
      
                                      
       String player1,player2;
       player1=IBIO.input("Player1, please enter your name: ");
       player2=IBIO.input("Player2, please enter your name: ");
       methods.outputBoard(board);
while (win==0)
{
       while (correct==0)
       {
       methods.player1ChoosesInitialPiece(board,player1);
       methods.player1move(board,player1);
    if (board[methods.initialY][methods.initialX]==" BP ")
    {
       correct=methods.player1movepawn(board,correct);
       if (correct==1&&methods.finalY==7)
       {
        methods.player1upgrade(board,player1);
       }
    }
    else if (board[methods.initialY][methods.initialX]==" BKn")
    {
       correct=methods.player1moveknight(board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" BR ")
    {
        correct=methods.player1moveRook (board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" BB ")
    {
        correct=methods.player1moveBishop (board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" BQ ")
    {
        correct=methods.player1moveQueen (board,correct);
    }
    
      
       methods.outputBoard(board);
    }
    win=0;
    win=methods.checkforWinner1 (board,win);
       if (win==1)
       {
           System.out.println(player1+" you have won the game.");
           break;
        }
    correct=0;
    while (correct==0)
       {
       System.out.println();
       methods.player2ChoosesInitialPiece(board,player2);
       methods.player2move(board,player2);
    if (board[methods.initialY][methods.initialX]==" WP ")
    {
       correct=methods.player2movepawn(board,correct);
       if (correct==1&&methods.finalY==0)
       {
        methods.player2upgrade(board,player2);
       }
    }
    else if (board[methods.initialY][methods.initialX]==" WKn")
    {
       correct=methods.player2moveknight(board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" WR ")
    {
        correct=methods.player2moveRook (board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" WB ")
    {
        correct=methods.player2moveBishop (board,correct);
    }
    else if (board[methods.initialY][methods.initialX]==" WQ ")
    {
        correct=methods.player2moveQueen (board,correct);
    }
    
       methods.outputBoard(board);
    }
    correct=0;
     win=0;
     win=methods.checkforWinner2 (board,win);
       if (win==1)
       {
           System.out.println(player2+" you have won the game.");
           break;
        }
}
}
}