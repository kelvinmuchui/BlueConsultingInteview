import java.util.*;
 
class MyMap {
    public static void display(int empId) {
        Map<Integer, String> map
        = new HashMap<Integer, String>();
        map.put(1, "Jack brown");
        map.put(2, "John Doe");
        map.put(3, "Steve Smith");
        map.put(4, "Marry Williams");
        System.out.println("Employee name is : " + map.get(empId));

    }

 
    public static void main(String args[])
    {
        //get map
        
        display(1);
    }
}