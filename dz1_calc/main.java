import java.io.*;
import java.io.BufferedReader;import java.io.InputStreamReader;import java.lang.Exception;import java.lang.String;import java.lang.System;import java.util.*;import java.util.Scanner;


/**
 * Created by Артём on 09.01.2015.
 */
public class main {
    public static void main(String[] args) {
        String answer = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое значение");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Введите знак");
        try {
            answer = br.readLine();
        } catch (Exception e) {
        }
        System.out.println("Введите второе значение");
        double b = sc.nextDouble();
        calc deyst = new calc();
        if (answer.equals("+")) deyst.plus(a, b);
        if (answer.equals("-")) deyst.minus(a, b);
        if (answer.equals("*")) deyst.umn(a, b);
        if (answer.equals("/")) deyst.mod(a, b);

    }
}
