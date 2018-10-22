
/**
 * Write a description of class Shorthand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Shorthand
{
    private String input, shorthand, finalShort;
    
    public Shorthand(String str)
    {
        input = str;
        shorthand = "";
        finalShort = "";
        replacement();
        noVovels();
    }
    
    private void replacement()
    {
        int strngLength = input.length();
        String temp2 = "", lowertemp = "", temp;
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
            else  
                if(x==strngLength-1)
                {
                    shorthand += temp2;
                }
        }
    } 
    
    private void noVovels()
    {
        int strngLength = shorthand.length();
        String temp, temp2;
        for (int x = 0; x<strngLength; x++)
        {
            temp = shorthand.substring(x, x+1);
            temp2 = temp;
            if (!(temp2.equals("U ")))
                temp2 = temp.toLowerCase();
            if(temp2.equals("a")||temp2.equals("e")||
                temp2.equals("i")||temp2.equals("o")||
                temp2.equals("u"))
                {
                    temp ="";
                }
            finalShort +=temp;
            
        }
    }
}
