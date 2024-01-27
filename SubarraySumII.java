import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SubarraySumII {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }
        int sum;
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            sum = 0;
            sum += arr[i];
            if(sum == target){
                ans++;
            }
            for(int j = i + 1; j < n; j++){
                sum += arr[j];
                if(sum == target){
                    ans++;
                }
            }
        }
        out.println(ans);
        out.close();
    }
}
