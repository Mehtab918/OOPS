import java.util.ArrayList;
public class TraverseCollectionElement
{
    public static void main (String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Md");
        arrayList.add("Mehtab");
        arrayList.add("khan");
        
        for(String myName : arrayList)
        {
            System.out.println(myName);
        }
        
    }
}