import apcslib.*;
import chn.util.*;
/**
 * Converts things to Shorthand
 *
 * @Anshul
 * @v1
 */
public class ShortClient
{
    public static void main(String args[])
    {
        //initialize
        ConsoleIO keyboard = new ConsoleIO();
        String input;
        
        do{
         //accept user input 
        System.out.print("Enter your string:");
        input  = keyboard.readLine();
        
        //construct later because of necessary information needed
        Shorthand script = new Shorthand(input);
        if(input.equals("Q"))
        {
            System.out.println("You have ended the program");
        }
        else
        {
            //prints the shorthand
            System.out.println("Shorthand:"+script.run());
        }
        
        
    }while(!(input.equals("Q")));
        
    }
}
