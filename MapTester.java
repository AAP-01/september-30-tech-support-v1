import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phoneBook;
    
    public MapTester()
    {
        phoneBook = new HashMap();
    }
    
    public void enterNumber(String name, String number)
    {
        phoneBook.put(name,number);
    }
    
    public String lookupNumber(String name)
    {
        if (phoneBook.containsKey(name))
        {
            return (String) phoneBook.get(name);
        }
        return null;
    }
    
    public boolean lookupName(String name)
    {
        boolean nameInTheBook = false;
        if (phoneBook.containsKey(name))
        {
            return nameInTheBook = true;
        }
        return nameInTheBook;
    }
    
    public void listAllNames()
    {
        for(String key : phoneBook.keySet()) {
            System.out.println(key);
        }
    }
}