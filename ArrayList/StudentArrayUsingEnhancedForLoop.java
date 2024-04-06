import java.util.ArrayList;

class Student
{
    int roll;
    String name;
    int marks;
}

public class StudentArrayUsingEnhancedForLoop
{
    public static void main (String[] args) {
        
        // int num[] = new int[3];
        // num[0]= 1;
        // num[1]= 2;
        // num[2]= 3;
        
        
        // //Enhance for each loop
        // for(int n : num)
        // {
        //     System.out.println(n);
        // }
        
        Student student1 = new Student();
        student1.roll = 1;
        student1.name = "Mehtab";
        student1.marks = 87;
        
        Student student2 = new Student();
        student2.roll = 2;
        student2.name = "Nakool";
        student2.marks = 82;
        
        Student student3 = new Student();
        student3.roll = 3;
        student3.name = "Ankit";
        student3.marks = 93;
        
        Student  students[] = new Student[3];
        students[0]= student1;
        students[1]= student2;
        students[2]= student3;
       
	// Advanced For loop - Enhance For loop 
       for(Student std : students)
       {
       System.out.println(std.name + " : " + std.roll);
       }
	
       	
        
        
        
    }
}