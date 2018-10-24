
/**
 * Ncessary Methods to make shorthand
 *
 * @Anshul
 * @v1
 */
class Shorthand
{
    private String input, shorthand, finalShort;
    
    /**
     * Constructor for Shorthand class to intialize all objects
     * @param str                 string you want converted
     */
    public Shorthand(String str)
    {
        input = str+" ";
        shorthand = "";
        finalShort = "";
        
    }
    
    //replaces and for to you with their respective shorthand equivalent
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
            
            if ((lowertemp.compareTo("!") >= 0 && lowertemp.compareTo("?") <= 0) || 
                (lowertemp.compareTo("a") >= 0 && lowertemp.compareTo("z") <= 0))
            {
               temp2+=lowertemp;
               temp3+=temp;
            }
            
            else
            {
                if(temp2.equals("and"))
                {
                    temp3 = "&";
                }
                if(temp2.equals("for"))
                {
                    temp3 = "4";
                }
                if(temp2.equals("you"))
                {
                    temp3 = "U";
                }
                if (temp2.equals("to"))
                {
                    temp3 = "2 ";
                }
                else
                {
                    temp3+=" ";
                }
                shorthand+=temp3;
                temp3 = "";
                temp2 = "";
            }
            
   
        } 
        
    }
    
    //deltes all vovels in the string
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
    
    /**
     * Runs all neceassry methods for the conversion to take place
     * @ param        none
     * @ return       String that is shorthand for input
     */
    public String run()
    {
        replacement();
        noVovels();
        return finalShort;
    }
}
