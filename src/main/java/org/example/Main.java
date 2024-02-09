package org.example;

public class Main {
   public static int busquedaSecuencial(int[] array, int valor) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == valor) {
            return i;
         }
      }
      return -1;
   }
    public static void main(String[] args){
       int[] array = {1,2,3,4,5,6,7,8,9,10};
       int index = busquedaSecuencial(array, 5);
         System.out.println("El valor 5 se encuentra en el índice: " + index);

    }

}