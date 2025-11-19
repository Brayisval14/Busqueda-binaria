public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izq = 0;
        int der = arr.length - 1;

        while (izq <= der) {
            int mid = (izq + der) / 2;

            if (arr[mid] == objetivo) return mid;
            if (arr[mid] < objetivo) izq = mid + 1;
            else der = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {1, 3, 5, 7, 9};
        int pos = busquedaBinaria(datos, 7);
        System.out.println("Posición: " + pos);
    }
}
