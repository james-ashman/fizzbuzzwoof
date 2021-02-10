import java.util.*;

public class randomNumber {
    public static void main(String args[])
    {
        Random rand = new Random();
        fizzBuzz tester = new fizzBuzz();
        String fizzBuzzWoof = "fizzbuzzwoof";
        int count = 0;
        for(int i = 0; i < 1000; i++)
        //loops through 1000 numbers and passes them through the fizzbuzzwoof algorithm
        {
            String temp = tester.SolveProblem(rand.nextInt());
            if(temp.equals(fizzBuzzWoof))
            //counts occurances of 'fizzbuzzwoof'
            {
                count++;
            }
        }
        //Prints result
        System.out.println("There are/is " + count + " occurance(s) of fizzbuzzwoof");
    }
}
