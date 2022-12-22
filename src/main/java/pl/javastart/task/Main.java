package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int arrays = sc.nextInt();
        double[] array = new double[arrays];
        System.out.println("Wprowadź " + arrays + " liczb:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double x : array) {
            sum += Math.pow(x, 2);
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to: " + sum);
    }
}
