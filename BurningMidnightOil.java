import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BurningMidnightOil {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = 1;
        while (l <= n) {
            int m = l + (n - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                System.out.println(m);
                break;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                n = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }
}
