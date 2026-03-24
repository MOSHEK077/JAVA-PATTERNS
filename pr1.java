
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Uses a HashSet to track seen numbers. For each element, checks if its complement (20 − x) was already seen. 
// Stores pairs in a TreeSet to avoid duplicates like (8,12) and (12,8).

public class pr1 {
    public static List<int[]> findPairs(int[] arr,int target){

    Set<Integer> seen = new HashSet<>();
    Set<String> used = new HashSet<>();
    List<int[]> result = new ArrayList<>();

    for(int num : arr){

        int complement = target - num;

        if(seen.contains(complement)){
            int a = Math.min(num, complement);
            int b = Math.max(num, complement);
            String key = a + ","+b;

            if(used.add(key)){
                result.add(new int[]{a,b});
            }
        }

        // ✅ Move this OUTSIDE
        seen.add(num);
    }

   return result;
}     public static  void main(String args[]){
        int[] arr ={4, 16, 8, 12, -4, 24, 10, 10, 6, 14};
        List<int[]> pairs = findPairs(arr, 20);
        for(int[] p : pairs){
            System.out.println("("+p[0]+", "+p[1]+")");
        }
            
    }
}