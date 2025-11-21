import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BusquedaBinaria {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            String[] parts = sc.nextLine().split(" ");
            int[] arr = new int[parts.length];

            for (int i = 0; i < parts.length; i++)
                arr[i] = Integer.parseInt(parts[i]);

            int target = sc.nextInt();
            sc.close();

            int result = binarySearch(arr, target);

            if (result == -1)
                System.out.println("Número NO encontrado.");
            else
                System.out.println("Número encontrado en la posición: " + result);

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt no encontrado");
        }
    }
}
