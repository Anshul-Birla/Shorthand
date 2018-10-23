
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
        String temp2 = "";
        String temp3 = "";
        String lowertemp = "";
        String temp;
        for (int x = 0; x<strngLength; x++)
        {
            temp = input.substring(x, x+1);
            lowertemp = temp.toLowerCase();
            
            if ((lowertemp.compareTo("0") >= 0 && lowertemp.compareTo("9") <= 0) || 
                (lowertemp.compareTo("a") >= 0 && lowertemp.compareTo("z") <= 0))
            {
               temp2+=lowertemp;
               temp3+=temp;
            }
            else
            {
                if(temp2.equals("and"))
                {
                    temp3 = "& ";
                }
                if(temp2.equals("for"))
                {
                    temp3 = "4 ";
                }
                if(temp2.equals("you"))
                {
                    temp3 = "U ";
                }
                if (temp2.equals("to"))
                {
                    temp3 = "to ";
                }
                shorthand+=temp3;
                temp3 = "";
                temp2 = "";
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
            if (!(temp2.equals("U"))||(temp2.equals("I ")))
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
