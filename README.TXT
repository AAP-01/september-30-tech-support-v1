TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

24. Map is used to store values. HashMap is based on Map
25. isEmpty, containsValue, size, etc. I think both parameters can use 
the same type
26. By using the method size
27. MapTester class:
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap phoneBook;
    
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
    
}

28. If i add a new entry (the phone number) with a key ("john") that 
already exists in the map (phoneBook, HashMap), the new value overrides 
the former
29. if i add two keys containing the same value, calling both will return 
the same value
30. lookupName method
    public boolean lookupName(String name)
    {
        boolean nameInTheBook = false;
        if (phoneBook.containsKey(name))
        {
            return nameInTheBook = true;
        }
        return nameInTheBook;
    }
    
31. Calling a value that doesn't have a key in the mapp will return null
32. listAllNames method
    public void listAllNames()
    {
        for(String key : phoneBook.keySet()) {
            System.out.println(key);
        }
    }

33. 