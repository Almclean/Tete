package Tete;

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("Hello", "World");
        myMap.put("This", "isAValue");
        myMap.put("Key", "Value");

        for ( Map.Entry e : myMap.entrySet() ) {
            System.out.println( e.getKey() + " : " + e.getValue() );
        }
    }
}
