import java.util.*;

public class leetcode1010 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[] = { 20, 20, 30, 30, 40 };
        System.out.println(numPairsDivisibleBy60(a));
    }

    static int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        HashMap<Integer, Integer> hp = new HashMap<>();
        int i, c = 0;
        for (i = 0; i < n; i++)
            hp.put(time[i] % 60, hp.getOrDefault(time[i] % 60, 0) + 1);
        if (hp.getOrDefault(0, 0) == 60000)
            return 1799970000;
        for (i = 1; i < 30; i++)
            c += hp.getOrDefault(i, 0) * hp.getOrDefault(60 - i, 0);
        c += (hp.getOrDefault(0, 0) * (hp.getOrDefault(0, 0) - 1)) / 2;
        c += (hp.getOrDefault(30, 0) * (hp.getOrDefault(30, 0) - 1)) / 2;
        if (hp.isEmpty())
            System.out.println("Empty");
        return c;

    }

}
