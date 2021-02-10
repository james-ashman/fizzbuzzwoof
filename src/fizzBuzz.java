import java.util.*;

public class fizzBuzz {
    String fizz = "fizz";
    String buzz = "buzz";
    String woof = "woof";
    HashMap<Integer, String> cache = new HashMap<Integer,String>();

    String SolveProblem(int num)
    {
        Integer number = num;
        boolean check = false;
        String complete = new String();
        if(!cache.containsKey(num))
        //Checks if number has already been solved
        {
            if(num % 3 == 0) // Checks if numbers are divisible by 3, 5 or 7 with no remainder and adds to the string based on result
            {
                complete = complete + fizz;
                check = true;
            }
            if(num % 5 == 0)
            {
                complete = complete + buzz;
                check = true;
            }
            if(num % 7 == 0)
            {
                complete = complete + woof;
                check = true;
            }
            if (check == true) 
            /*Caches number and complete string in hash table if it is 
            divisible by 3, 5, 7 or any combo of these with no remainder*/
            {
                cache.put(num, complete);
                return complete;
            }
            else
            {
                return number.toString(); //If not divisible without remainded converts int to string
            }
        }
        else if(cache.containsKey(num))
        //if number has already been solved returns the complete string
        {
            return cache.get(num);
        }
        return "Something went wrong"; //Error message in case of rare error
    }
    
}
