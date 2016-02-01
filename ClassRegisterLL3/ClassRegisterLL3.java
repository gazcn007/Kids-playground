/**
 * ClassRegisterLL3 - student linked list, now with count and delete.
 * 
 * Author: JS
 * Version: 12.11.06
 */

public class ClassRegisterLL3
{
    // This is a dynamic data structure, not static.
    // No need to declare an array to keept the students in, instead create an empty first node
    public static Student front = new Student();

    // the main method
    public static void main(String[] args)
    {
        new ClassRegisterLL3 ();
    }

    // the constructor method
    public ClassRegisterLL3 ()
    {
        // An introduction
        IBIO.output ("CLASS REGISTER");
        IBIO.output ("Now appends, counts, and deletes!");
        IBIO.output ("");
    
        // The choice menu has been left out for simplicity...

        // Input three students
        front = new Student ("Simon",17,32,null);
        front.next = new Student ("Natalie",13,57,null);
        front.next.next = new Student ("Will",15,88,null);
        
        displayRegister();
        
        String newName = IBIO.input ("New student name? ");
        int newAge = IBIO.inputInt ("New student age? ");
        int newMark = IBIO.inputInt ("New student mark? ");
        Student newStudent = new Student (newName, newAge, newMark, null);
        append (newStudent);
        
        displayRegister();
        
        IBIO.output("There are " + countStudents () + " students in the register.");
        
        String unwantedName = IBIO.input ("Who do you want to delete? ");
        boolean deleted = deleteStudent (unwantedName);
        if (!deleted)
        {
            IBIO.output (unwantedName + " was not in the list.");
        }
        
        displayRegister();
        
        IBIO.output("There are " + countStudents () + " students in the register.");
    }
    
    // method to show the register
    public static void displayRegister ()
    {
        IBIO.output ("___________________");
        IBIO.output ("REGISTER:");
        
        Student current = front;
        while (current != null) {
            IBIO.output(current.name + " (age " + current.age + ") scored " + current.mark + "%.");
            current = current.next;
        }  
    }
    
    // method to append a node to the end of the list
    public static void append (Student newStudent)
    {
        if (front == null)
        {
            front = newStudent;
        }
        else
        {
            Student previous = front;
            Student current = front.next;
            while (current != null) {
                // as long as there are more items in the list, skip along it
                previous = current;
                current = current.next;
            }
            previous.next = newStudent;
        }
    }
    
    // method to count how many students in the list
    // returns the number of students in the list
    public static int countStudents ()
    {
        int num=0;
        System.out.println("wtf");
        
            if (front == null)
        {
            return num;
        }
            else
        {   num++;
            Student previous = front;
            Student current = front.next;
            while (current != null) {
                num++;
                previous = current;
                current = current.next;
            }
            return num;
        }
            
        
    }
    
    // method to delete a student from the list
    // only deletes the first occurance of the name
    // returns true if successful, false if item not there
    // tip: recall your string methods for comparing two strings
    public static boolean deleteStudent (String unwantedName)
    {
        boolean deleted = false;
         if (front == null)
        {
            System.out.println("There is no one in the class");
            return deleted;
        }
        else if (front.name==unwantedName)
        {
             System.out.println(front.name+"="+unwantedName);
                front=front.next;
                deleted=true;
                return deleted;
        }
        else
        {
            Student previous = front;
            Student current = front.next;
            while (current != null) {
                System.out.println("current.name is"+current.name+"unwanted is "+unwantedName);
                
                if (current.name.compareTo(unwantedName)==0)
              {
                System.out.println(previous.name+"="+unwantedName);
                previous.next=current.next;
                deleted=true;
                break;
              }
              previous = current;
                current = current.next;
            }
            return deleted;
        }
    }
}