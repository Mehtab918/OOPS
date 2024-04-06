import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddingElementIntoArrayList
{
    public static void main (String[] args) {
        
        //1- first way of creating arraylist objet , use direct class arraylist
        
        ArrayList arrayList = new ArrayList();
        // add() -> to insert the elements in the arraylist
        arrayList.add(10);
        arrayList.add("mehtab");
        arrayList.add(3422.223);
        
        System.out.println(arrayList);  // [ 10, mehtab, 3422.223]
        
        // using Generic type we can provide only specific type of datatype value.
        List<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        
        System.out.println(arrayList1);
        
        List<String> arrayList2 = new ArrayList<String>();
        
               // ArrayList array method has two parameters - add(Int index , Element e) 
        // index is optional when we want to add the elements ,
        // but when we want to assign any element at specific index then we need to put index also)
        
        arrayList2.add("HTML");
        arrayList2.add("CSS");
        arrayList2.add("JS");
        
         
        System.out.println(arrayList2);
        
        Scanner sc =new Scanner(System.in);
         System.out.println("Want to Enter element at specifix index:");
        int index = sc.nextInt();
     
        arrayList2.add(index,"Java");
        
        System.out.println(arrayList2);
        
        // ArrayIndexOutOfBoundsException will raise when we the index is out of range.
        
        // 2.get(int index) - is use to get or fetch the value from the arrayList.
        System.out.println(arrayList2.get(2));
        
         // java.lang.IndexOutOfBoundsException when we are assiging any value out of the index range.
        
        // 3.addAll() 
        
       ArrayList<String> arrayList3 = new ArrayList<String>();
       
       arrayList3.add("Frontend");
       arrayList3.add("Backend");
       
       ArrayList<String> program = new ArrayList<String>();
       program.add("Java program");
       
       //addAll method will add(append) two collections and make one object.
       
       program.addAll(0,arrayList3);
       
       System.out.println(program);
        
        
        ArrayList<Integer> primeNumber = new ArrayList<Integer>();
        primeNumber.add(1);
        primeNumber.add(3);
        primeNumber.add(5);
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(2);
        number.add(4);
        
        number.addAll(1,primeNumber);
        System.out.println(number);
    }
}