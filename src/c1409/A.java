package c1409;

// 제목 : Yet Another Two Integers Problem

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append((Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()))
                    + 9) / 10).append("\n");
        }

        System.out.print(sb);
    }
}
