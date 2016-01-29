/* Student
* 
* Each player has two pointers, left and right
* The structure of the database is defined elsewhere in another class
* Author Frank Wang
* Date : 13.02.19
 */

public class Player
{
    private String name;
    private char gender;
    private String team;
    private int rank; 
    private Player left;
    private Player right;
 
    // constructor for an empty student
    public Player ()
    {
        name = null;
        gender = ' ';
        team = null;
        rank = -1; 
        left = null;
        right = null;
    }

    // constructor for a new student
    public Player (String newName, char newGender, String newTeam,int newRank )
    {
        name = newName;
        gender = newGender;
        team = newTeam;
        rank = newRank; 
        left = null;
        right = null;
    }

    // Getter (or accessor) methods
    public String getName ()
    {
        return name;
    }
    public char getGender ()
    {
        return gender;
    }
    public String getTeam ()
    {
        return team;
    }
    public int getRank ()
    {
        return rank;
    }
    public Player getLeft ()
    {
        return left;
    }
    public Player getRight ()
    {
        return right;
    }

    // Setter (or mutator) methods
    public void setName (String newName)
    {
        name = newName;
    }
    public void setGender (char newGender)
    {
        gender = newGender;
    }
    public void setTeam (String newTeam)
    {
        team = newTeam;
    }
    public void setRank (int newRank)
    {
        rank = newRank;
    }
    public void setLeft (Player newLeft)
    {
        left = newLeft;
    }
    public void setRight (Player newRight)
    {
        right = newRight;
    }
}