package c1400;

// 제목 : String Similarity

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int length = 2 * Integer.parseInt(br.readLine()) - 1;
            String string = br.readLine();

            for (int index = 0; index < length; index += 2) {
                sb.append(string.charAt(index));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
