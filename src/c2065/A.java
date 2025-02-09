package c2065;

// 제목 : Skibidus and Amog'u

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String string = br.readLine();
            sb.append(string, 0, string.length() - 2).append("i\n");
        }

        System.out.print(sb);
    }
}
