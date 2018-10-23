import apcslib.*;
import chn.util.*;
/**
 * Write a description of class ShortClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShortClient
{
    public static void main(String args[])
    {
        ConsoleIO keyboard = new ConsoleIO();
        String input;
        do{
        System.out.print("Enter your string:");
        input  = keyboard.readLine();
        
        Shorthand script = new Shorthand(input);
        if(input.equals("Q"))
        {
            System.out.println("You have ended the program");
        }
        else
        {
            System.out.println("Shorthand:"+script.run());
        }
        
        
    }while(!(input.equals("Q")));
        
    }
}
