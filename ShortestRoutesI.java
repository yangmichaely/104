import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ShortestRoutesI {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int connections = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
        for(int i = 0; i < connections; i++){
            st = new StringTokenizer(in.readLine());
            ArrayList<Integer> connection = new ArrayList<>();
            connection.add(Integer.parseInt(st.nextToken()));
            connection.add(Integer.parseInt(st.nextToken()));
            connection.add(Integer.parseInt(st.nextToken()));
            nodes.add(connection);
        }



        out.close();
    }
}
