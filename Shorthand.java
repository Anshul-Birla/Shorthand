
/**
 * Write a description of class Shorthand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Shorthand
{
    private String input, shorthand, temp, temp2;
    
    public Shorthand(String str)
    {
        input = str;
        replacement();
    }
    
    private void replacement()
    {
        int strngLength = input.length();;
        for (int x = 0; x<strngLength; x++)
        {
            temp = input.substring(x, x+1);
            temp2 = temp2 + temp;
            if (temp.equals(" "))
            {
                if (temp2.equals("and "))
                {
                    temp2 = "& ";
                }
                if (temp2.equals("to "))
                {
                    temp2 = "2 ";
                }
                if (temp2.equals("you "))
                {
                    temp2 = "U ";
                }
                if (temp2.equals("for "))
                {
                    temp2 = "4 ";
                }
                shorthand = shorthand + temp2;
                temp2 = "";
            }
        
        
        
    }
}   
}
