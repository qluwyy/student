package student8;
import java.util.Random;
public class normal_random {
    static String getscore() {
        Random r = new Random();
        int num = 0;
        StringBuffer sb = new StringBuffer();
        while (true) {
            int a = (int) (r.nextGaussian() * Math.sqrt(60) + 80);
            if (a <= 100) {
                num++;
                sb.append(a);
                sb.append("q");
            }
            if (num == 100000) break;
        }
        String str = new String(sb);
        return str;
    }
    }
