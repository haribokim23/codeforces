package c2059;

// 제목 : Milya and Two Arrays

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            HashSet<Integer> a = new HashSet<>();
            HashSet<Integer> b = new HashSet<>();

            for (int index = 0; index < n; index++) {
                a.add(Integer.parseInt(st1.nextToken()));
                b.add(Integer.parseInt(st2.nextToken()));

                if (a.size() * b.size() >= 3) {
                    break;
                }
            }

            sb.append(a.size() * b.size() >= 3 ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}
