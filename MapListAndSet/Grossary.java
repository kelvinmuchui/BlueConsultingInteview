import java.util.*;
public class Grossary {

    public void myItems(){
        Set<String> Set = new HashSet<String>();
         
        // Adding Elements 
        Set.add("Apple");
        Set.add("Orange");
        Set.add("Banana");
        Set.add("Apple");
        Set.add("Kales");
    }

     public static void main(String args[])
    {
        Grossary g = new Grossary();
        g.myItems();
    }
    
      
}
