
/**
 * StudentListRunner
 * 
 * 
 */
import java.util.*;
public class StudentListRunner
{
    public static void main (String[] args)
    {
        Scanner scr = new Scanner (System.in);
        StudentList list = new StudentList();
        int control = menuNumber();
        while (control != -1) { 
            if (control == 1)
            {
                list.addStudentToList();
            }
            
            if (control == 2)
            {
                System.out.print("Student List\n");
                list.printStudentList();
            }
            
            if (control == 3)
            {
                System.out.print ("Which student would you like to delete? \nEnter a last name or a student ID: ");
                list.deleteStudent(scr.nextLine());
            }
            
            if (control == 4) {
                System.out.print ("Which student would you like to edit? \nEnter a last name or a student ID: ");
                list.editStudent(scr.nextLine());
            }
            
            if (control == 5)
            {
                list.clearList();
            }
            
            if (control == 6)
            {
                System.out.print ("Which student would you like to find? \nEnter a last name or a student ID: ");
                list.findStudent(scr.nextLine());
            }
            
            if (control == 7)
            {
                list.filterSearchStudentList();
            }
            
            if (control == 8)
            {
                list.sortByNumber();
            }
            
            System.out.print ("\n\nAction Complete! Press any key to return to the main menu.");
            String clearScanner = scr.nextLine();
            System.out.println("\u000c");
            control = menuNumber();
            System.out.print("\n");
            
        }
        
        System.out.println("\nProgram ended");
    }
    
    public static int menuNumber()
    {
        Scanner scr = new Scanner (System.in);
        String [] menu = new String[8];
        menu[0] = "Add Student";
        menu[1] = "Print Student List";
        menu[2] = "Delete Student";
        menu[3] = "Edit Student";
        menu[4] = "Clear Student List";
        menu[5] = "Find Student";
        menu[6] = "Filter Search";
        menu[7] = "Sort students by student number";
        System.out.println ("Select an option from the menu below by entering the item number");
        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(i+1 + "  " + menu[i]);
        }
        System.out.print("\nSelect an item number or press 'q' to quit: ");
        boolean notValid = true; //true while the user hasn't entered anything or while the user enteres an invalid input
        while (notValid)
        {
            if (scr.hasNext("q"))
            {
                return -1;
            }else if (scr.hasNextInt()){
                int input = scr.nextInt();
                if (input > 0 && input <= menu.length)
                {
                    return input;
                }else{
                    System.out.println ("Invalid Input. Select an option from the menu above or press 'q' to quit.");
                }
            }else{
                System.out.println ("Invalid Input. Select an option from the menu above or press 'q' to quit.");
                String clearScanner = scr.nextLine();
            }
        }
        return -1;
    }
}
