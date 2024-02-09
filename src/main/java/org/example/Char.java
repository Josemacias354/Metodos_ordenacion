package org.example;

public class Char {
    public static int busquedaSecuencial(char[] array, char valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String palabra = "hola";
        char[] array = palabra.toCharArray();
        int index = busquedaSecuencial(array, 'a');
        System.out.println("El valor 'a' se encuentra en el índice: " + index);
    }
}