import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        generator = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printMultiRandom(int howMany)
    {
        int i = 0;
        
        while(i < howMany)
        {
            System.out.println(generator.nextInt());
            i++;
        }
    }
    
    public void printOneRandom()
    {
        System.out.println(generator.nextInt());
    }
    
    public int throwDice()
    {
        int number = generator.nextInt(6);
        System.out.println(number);
        return number;
    }
}
