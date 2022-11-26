import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class test {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int n = scan.nextInt();
        int[] array = new int[n];
        int c=0;
        int firstinv=0;
        for (int j = 0; j < n; j++) {
            int a = scan.nextInt();
            array[j]=a;
            if (a==1)
                c++;
            else
                firstinv+=c;
        }
        System.out.println(firstinv);
    }
}