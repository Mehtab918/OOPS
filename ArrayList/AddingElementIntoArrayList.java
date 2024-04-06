import java.util.ArrayList;
import java.util.List;
public class ArrayListAddPrograms
{
    public static void main (String[] args) {
        
        //1- first way of creating arraylist objet , use direct class arraylist
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("mehtab");
        arrayList.add(3422.223);
        
        System.out.println(arrayList);  // [ 10, mehtab, 3422.223]
        
        // using Generic type we can provide only specific type of datatype value.
	// We are using List interface , as we can't create interface obj but we can take reference name for creating its implementation class object.
        List<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        
        System.out.println(arrayList1);
        
        List<String> arrayList2 = new ArrayList<String>();
        
        arrayList2.add("ABC");
        arrayList2.add("XYZ");
        arrayList2.add("MNO");
        
        System.out.println(arrayList2);
        
        
        
        
        
    }
}