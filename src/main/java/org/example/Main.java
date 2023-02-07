package org.example;

public class Main {


    public static String obtenerSignoNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }


    public static void whileLoop() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void doWhileLoop() {
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);
    }

    public static void forLoop() {
        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void switchCase(String estacion) {
        switch (estacion) {
            case "primavera" -> System.out.println("Primavera");
            case "verano" -> System.out.println("Verano");
            case "otoño" -> System.out.println("Otoño");
            case "invierno" -> System.out.println("Invierno");
            default -> System.out.println("Estación no reconocida");
        }

    }

}