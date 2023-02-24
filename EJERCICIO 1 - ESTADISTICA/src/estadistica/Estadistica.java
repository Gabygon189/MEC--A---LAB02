package estadistica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el tamaño del arreglo: ");
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        Random rand = new Random();
        for (int j = 0; j < n; j++) {
            arr[j] = rand.nextInt(101);
        }
        System.out.println("El arreglo es: " + Arrays.toString(arr));
        
        
        double media = 0;
        for (int j = 0; j < n; j++) {
            media += arr[j];
        }
        media /= n;
        System.out.println("La media es: " + media);
        
      
        Arrays.sort(arr);
        double mediana = 0;
        if (n % 2 == 0) {
            mediana = (arr[n/2] + arr[n/2 - 1]) / 2.0;
        } else {
            mediana = arr[n/2];
        }
        System.out.println("La mediana es: " + mediana);
        
       
        double varianza = 0;
        for (int j = 0; j < n; j++) {
            varianza += Math.pow(arr[j] - media, 2);
        }
        varianza /= n;
        System.out.println("La varianza es: " + varianza);
        
      
        double desviacion = Math.sqrt(varianza);
        System.out.println("La desviación estándar es: " + desviacion);
        
        
        int moda = arr[0];
        int maxCount = 1;
        int count = 1;
        for (int j = 1; j < n; j++) {
            if (arr[j] == arr[j-1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    moda = arr[j-1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            moda = arr[n-1];
            System.out.print("La moda es: " + moda);
        }
    }
}