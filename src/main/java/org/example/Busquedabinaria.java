package org.example;

public class Busquedabinaria {


    public static int busquedaBinariaIterativa(int[] array, int elemento) {
        int centro;
        int inf = 0;
        int sup = array.length - 1;

        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (array[centro] == elemento) {
                return centro;
            } else if (elemento < array[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = busquedaBinariaIterativa(array, 5);
        System.out.println("Element found at index: " + index);
    }
}