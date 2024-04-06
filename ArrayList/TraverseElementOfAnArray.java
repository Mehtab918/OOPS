public class TraverseElementOfAnArray
{
    public static void main (String[] args) {
    int arr[] = {1,3,24,42,5};
    
    for(int i : arr)
    {
        System.out.println(i);
    }
    
    System.out.println("----------");
    // can i use Wrapper class instead of primitive datatype.
    for(Integer i : arr)
    {
        System.out.println(i);
    }
    }
}