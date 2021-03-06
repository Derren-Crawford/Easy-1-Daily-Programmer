package easy.pkg1;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class EASY1 {

    public static void main(String[] args) throws FileNotFoundException {
        //create new person object
        Person p1 = new Person();
        //create scanner object
        Scanner scanIn = new Scanner(System.in);
                
        System.out.println("Please enter your name:");
        //read in user input
        String nameIn = scanIn.nextLine();
        //assign user input to name of object
        p1.setName(nameIn);
        
        System.out.println("Please enter your age:");
        //read in user input
        int ageIn = Integer.parseInt(scanIn.nextLine());
        //assign user input to age of object
        p1.setAge(ageIn);
        
        System.out.println("Please enter your user name:");
        //read user input
        String userNameIn = scanIn.nextLine();
        //assign user input to user name of object
        p1.setUserName(userNameIn);
        
        //display entered information
        System.out.println(p1.outputString());
        
         try(PrintWriter out = new PrintWriter("C:\\Users\\Nicola\\Documents\\NetBeansProjects\\EASY 1\\src\\easy\\pkg1\\text.txt"))
        {
            out.println(p1.outputString());
        }
        
        
        
    }
    
}
