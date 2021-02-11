import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class fizzBuzzTest {

    fizzBuzz test = new fizzBuzz();

    @Test
    public void testSolveProblemForFizz()
    {
        assertEquals("fizz", test.SolveProblem(3));
        assertEquals("fizz", test.SolveProblem(9));
        assertEquals("fizz", test.SolveProblem(12));
    }
    @Test
    public void testSolveProblemForBuzz()
    {
        assertEquals("buzz", test.SolveProblem(5));
        assertEquals("buzz", test.SolveProblem(10));
        assertEquals("buzz", test.SolveProblem(20));
    }
    
    @Test
    public void testSolveProblemForWoof()
    {
        assertEquals("woof", test.SolveProblem(7));
        assertEquals("woof", test.SolveProblem(14));
        assertEquals("woof", test.SolveProblem(28));
    }

    @Test 
    public void testSolveProblemForFizzBuzz()
    {
        assertEquals("fizzbuzz", test.SolveProblem(15));
        assertEquals("fizzbuzz", test.SolveProblem(30));
        assertEquals("fizzbuzz", test.SolveProblem(45));
    }

    @Test
    public void testSolveProblemForFizzWoof()
    {
        assertEquals("fizzwoof", test.SolveProblem(21));
        assertEquals("fizzwoof", test.SolveProblem(42));
        assertEquals("fizzwoof", test.SolveProblem(63));
    }

    @Test
    public void testSolveProblemForBuzzWoof()
    {
        assertEquals("buzzwoof", test.SolveProblem(35));
        assertEquals("buzzwoof", test.SolveProblem(70));
        assertEquals("buzzwoof", test.SolveProblem(140));
    }

    @Test
    public void testSolveProblemForFizzBuzzWoof()
    {
        assertEquals("fizzbuzzwoof", test.SolveProblem(105));
        assertEquals("fizzbuzzwoof", test.SolveProblem(210));
        assertEquals("fizzbuzzwoof", test.SolveProblem(315));
    }

    @Test
    public void testSolveProblemForAnyOtherNumber()
    {
        assertEquals("1", test.SolveProblem(1));
        assertEquals("2", test.SolveProblem(2));
        assertEquals("8", test.SolveProblem(8));
    }

    
}
