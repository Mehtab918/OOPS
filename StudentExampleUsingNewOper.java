public class StudentExampleUsingNewOper
{

private String name;

private int roll;

public void setName(String name)
{
this.name = name;
}

public String getName()
{
return name;
}

public void setRoll(int roll)
{
this.roll = roll;
}

public int getRoll()
{
return roll;
}

public StudentExampleUsingNewOper(String name , int roll)
{
super();
this. name = name;
this.roll = roll;
}

public static void main(String [] args)
{
// LHS part =>StudentExampleUsingNewOper   class name , std is reference variable , RHS => new is an operator which allocates some memory in Heap & stack, 
//RHS part => StudentExampleUsingNewOper is a constructor which is used to initialize an Object
StudentExampleUsingNewOper std1 = new StudentExampleUsingNewOper("Mehtab" , 101);
StudentExampleUsingNewOper std2 = new StudentExampleUsingNewOper("Khan", 102);

// We can access it by using get method
System.out.println(std1.getName() + "  " +  std1.getRoll());

std1.setName("Ajay");
std1.setRoll(105);

System.out.println(std1.getName() + "  " +  std1.getRoll());

}
}

