import java.util.*;

public class HashMapSolve {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashMap<String,String> hm = new HashMap<>();
        for (int i = 0; i<pair_left.length;i++){
            hm.put(pair_left[i]+" "+pair_right[i],null );
            System.out.println(hm.size());
        }
        s.close();
    }
}