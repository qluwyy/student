package student8;
public class random_number {
    static String getnumber() {
        int num = 0;
        StringBuffer sb = new StringBuffer();
        int[] k = new int[100000000];
        while (true) {
            int a = (int) (1000000 + Math.random() * (10000000 - 1000000 + 1));
            k[a]++;
            if (k[a] == 1) {
                sb.append(a);
                sb.append("q");
                num++;
            }
            if (num == 100000) break;
        }
        String str = new String(sb);
        return str;
    }
}
