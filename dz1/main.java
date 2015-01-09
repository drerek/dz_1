import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args){
        String answer = null;
        while (true) {
        System.out.println("1-едем, 2-стоим, 3-заправляемся, 0-выход");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                answer = br.readLine();
            }
            catch (Exception e) {
            }
            auto honda = new auto();
            if (answer.equals("1")) honda.Ehat();
            if (answer.equals("2")) honda.Stoyat();
            if (answer.equals("3")) {
                System.out.println("На сколько литров заправиться:");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                honda.ZapravkaBenzinom(a);
            }
            if (answer.equals("0")) System.exit(0);
        }

    }
}

