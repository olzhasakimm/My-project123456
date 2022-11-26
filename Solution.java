import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            array.add(scan.nextInt());
        }
        Collections.sort(array);
        array.add(0,size);
        int count = 0;
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)> array.size() && array.get(i)-array.get(i-1)>=3){
                count++;
            }else{
                int a = array.get(i-1);
                array.remove(i);
                array.add(i,a);
            }
        }
        System.out.println(count);
    }
}