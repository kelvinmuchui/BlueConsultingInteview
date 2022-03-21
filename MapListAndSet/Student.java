import java.util.*;

public class Student {
    public void getStudent(){
        List<String> student = new ArrayList<String>();

        //add elements to the list
        student.add("Mark Henry");
        student.add("Linda Anderson");
        student.add("Rajesh Kumar");
        student.add("James Bond");
        student.add("Adam Smith");
        student.add("John Doe");
        student.add("Adam Smith");
        for (String s : student) {
        
            System.out.println(s);
        }



    }
   
    
}
public class ObjectClass {
    public static void main(String args[])
    {
        Student s = new Student();
        s.getStudent();
    }
 }