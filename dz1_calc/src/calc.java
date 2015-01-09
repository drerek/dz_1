import java.lang.System; /**
 * Created by Артём on 09.01.2015.
 */
public class calc {
    void plus (double a, double b){
        double rez = 0;
        rez = a + b;
        System.out.println("Результат="+rez);
    };
    void minus (double a, double b){
        double rez = 0;
        rez = a - b;
        System.out.println("Результат="+rez);
    };
    void mod (double a, double b){
        double rez = 0;
        rez = a / b;
        System.out.println("Результат="+rez);
    };
    void umn (double a, double b){
        double rez = 0;
        rez = a * b;
        System.out.println("Результат="+rez);
    };
}
