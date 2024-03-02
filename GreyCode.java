import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class GreyCode {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        double len = Math.pow(2, n);
        StringBuilder s = new StringBuilder();
        HashSet<StringBuilder> strings = new HashSet<>();
        s.append("0".repeat(Math.max(0, n)));
        strings.add(s);
        int count = 1;
        for(int i = 0; i < len - 1; i++){
            for(int j = n - 1; j >= 0; j--){
                if(i % 2 == 0){
                    s.setCharAt(j, '1');
                    System.out.println(s);
                }
                else {
                    s.setCharAt(j, '0');
                    System.out.println(s);
                }
                count++;
                if(count >= len){
                    System.exit(0);
                }
            }
        }
    }
}
