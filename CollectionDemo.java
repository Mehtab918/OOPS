//Collection Framework
import java.util.*;
class CollectionDemo
{
    public static void main(String[] args)
    {
        //creation of an array.
        // Array instance creation requires [],
        int arr[] = new int[]{1,2,3,4};
        //creation of vector object
        Vector<Integer> vector = new Vector();
        //creation of HashTable object
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        
        //initializing vector object.
        // Vector element insertion requires addElement(),
         //Vector require ()
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        
        //initializing hashTable object
      // hashtable element insertion requires put()
      // and hastable require ()
        ht.put(1,"Md");
        ht.put(2,"Mehtab");
        ht.put(3,"Khan");
// Accessing the first element of the array, vector and hashtable
System.out.println("array first index values :" +  arr[0]);
System.out.println("vector first element values :" +vector.elementAt(0));
System.out.println("Hashtable first index values :" +ht.get(1));

  // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()
       
       
       
        
        
        
    }
}