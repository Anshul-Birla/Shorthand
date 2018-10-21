
/**
 * Write a description of class Shorthand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Shorthand
{
    private String input, shorthand, temp;
    
    public Shorthand(String str)
    {
        input = str;
        shorthand = "";
        replacement();
    }
    
    private void replacement()
    {
        int strngLength = input.length();
        String temp2 = "", lowertemp = "";
        for (int x = 0; x<strngLength; x++)
        {
            temp = input.substring(x, x+1);
            temp2 = temp2 + temp;
            lowertemp = temp2.toLowerCase();
            if (temp.equals(" "))
            {
                if (lowertemp.equals("and "))
                {
                    temp2 = "& ";
                }
                if (lowertemp.equals("to "))
                {
                    temp2 = "2 ";
                }
                if (lowertemp.equals("you "))
                {
                    temp2 = "U ";
                }
                if (lowertemp.equals("for "))
                {
                    temp2 = "4 ";
                }
                shorthand = shorthand + temp2;
                temp2 = "";
            }
        
        
        
    }
}   
}
