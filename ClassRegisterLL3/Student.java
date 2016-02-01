/* Student
* Creates  a template for an object (i.e. a student) in a school register database
* The structure of the database is defined elsewhere in another class
 * Author: JS
 * Version: 12.11.06
 */

public class Student 
{
    // Declare the fields for each record - these are all properties of a student
    // For simplicity, we declare them public at first
    public String name;
    public int age;
    public int mark;
    //etc. if you wish
    public Student next; // the pointer to the next Student
 

    // There follows 2 constructor methods for a student
    // To create an empty record:
    public Student () 
    {
        this.name = "-";
        age = -1;
        mark = -1;
        next = null;
        //etc.
    }

    // To create a 'normal' record:
    public Student (String newName, int newAge, int newMark, Student newStudent)
    {
        name = newName;
        age = newAge;
        mark = newMark;
        next = newStudent;
        //etc.
    }

    /* Temporarily out of action...
    // Getter (or accessor) methods
    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }
    public int getMark () {
        return mark;
    }
    public Student getNext () {
        return next;
    }

    // Setter (or mutator) methods
    public void setName (String newName) {
        name = newName;
    }
    public void setAge (int newAge) {
        age = newAge;
    }
    public void setMark (int newMark) {
        mark = newMark;
    }
    public void setNext (Student newNext) {
        next = newNext;
    }
    */
}