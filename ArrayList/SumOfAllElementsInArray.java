public class SumOfAllElementsInArray
{
    public static void main (String[] args) {
        
        Integer i[] = new Integer[3];
        
        i[0]= 10;
        i[1]= 20;
        i[2]= 30;
        
        int total =0;
        for(Integer num : i)
        {
            total = num+total;
        }
        System.out.println(total);
    }
    
}