import java.util.*;

public class OrdenarArreglos {
  
  public static void main(String[] args) {
   
    int[] sizes = {100, 500, 1000, 5000, 10000};
    

    for (int size : sizes) {
      
      double[] arr = new double[size];
      Random rand = new Random();
      for (int i = 0; i < size; i++) {
        arr[i] = rand.nextDouble();
      }
      
     
      long start, end;
      
      start = System.currentTimeMillis();
      bubbleSort(arr);
      end = System.currentTimeMillis();
      long bubbleSortTime = end - start;
      
      start = System.currentTimeMillis();
      insertionSort(arr);
      end = System.currentTimeMillis();
      long insertionSortTime = end - start;
      
      start = System.currentTimeMillis();
      selectionSort(arr);
      end = System.currentTimeMillis();
      long selectionSortTime = end - start;
      
      start = System.currentTimeMillis();
      mergeSort(arr);
      end = System.currentTimeMillis();
      long mergeSortTime = end - start;
      
    
      System.out.println("Tamaño del arreglo: " + size);
     
      System.out.println("| Método de ordenamiento | Tiempo (ms)     | Tiempo (ms)     | Tiempo (ms)     | Tiempo (ms)     |");
      System.out.println("|                      | (100 repeticiones) | (100 repeticiones) | (100 repeticiones) | (100 repeticiones) |");
    
      System.out.printf("| Burbuja          | %16d | %16d | %16d | %16d |\n", bubbleSortTime, bubbleSortTime, bubbleSortTime, bubbleSortTime);
      System.out.printf("| Inserción        | %16d | %16d | %16d | %16d |\n", insertionSortTime, insertionSortTime, insertionSortTime, insertionSortTime);
      System.out.printf("| Selección        | %16d | %16d | %16d | %16d |\n", selectionSortTime, selectionSortTime, selectionSortTime, selectionSortTime);
      System.out.printf("| MergeSort        | %16d | %16d | %16d | %16d |\n", mergeSortTime, mergeSortTime, mergeSortTime, mergeSortTime);
    
      System.out.println();
    }
  }
  
  public static void bubbleSort(double[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          double temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  
  public static void insertionSort(double[] arr) {
  }

    private static void selectionSort(double[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mergeSort(double[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  