package Bimestre;

import java.util.List;
import
        java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double valor;
        String unidadOrigen;
        String unidadDestino;
        double valorTransformado = 0;
        List<String> unidadesSportadas = List.of("cm", "m", "km");
        do {
            System.out.print("Ingrese el valor a transformar: ");
            valor = lector.nextDouble();
        } while (!esValorValido(valor));
        do {
            System.out.printf("Ingrese la unidad de origen: ");
            unidadOrigen = lector.next();
        } while (!esUnidadValida(unidadesSportadas, unidadOrigen));
        do {
            System.out.print("Ingrese la unidad de destino: ");
            unidadDestino = lector.next();
        } while (!esUnidadValida(unidadesSportadas, unidadDestino));
        if (unidadOrigen.equals("cm") && unidadDestino.equals("m")) {
            valorTransformado = cm2M(valor);
        } else if (unidadOrigen.equals("cm") && unidadDestino.equals("km")) {
            valorTransformado = cm2Km(valor);
        } else if (unidadOrigen.equals("m") && unidadDestino.equals("cm")) {
            valorTransformado = m2Cm(valor);
        } else if (unidadOrigen.equals("m") && unidadDestino.equals("km")) {
            valorTransformado = m2Km(valor);
        } else if (unidadOrigen.equals("km") && unidadDestino.equals("cm")) {
            valorTransformado = km2Cm(valor);
        } else if (unidadOrigen.equals("km") && unidadDestino.equals("m")) {
            valorTransformado = km2M(valor);
        } else {
            System.out.println("No se pueden transformar");
            System.exit(-1);
        }
        System.out.printf("En %.2f%s existen %.2f%s\n", valor, unidadOrigen, valorTransformado, unidadDestino);
    }

    private static double cm2M(double centimetros) {
        return centimetros / 100;
    }

    private static double cm2Km(double centimetros) {
        return cm2M(centimetros) / 1000;
    }

    private static double m2Cm(double metros) {
        return metros * 100;
    }

    private static double m2Km(double metros) {
        return cm2Km(m2Cm(metros));
    }

    private static double km2M(double kilometros) {
        return kilometros * 1000;
    }

    private static double km2Cm(double kilometros) {
        return m2Cm(km2M(kilometros));
    }

    private static boolean esValorValido(double valor) {
        return valor > 0;
    }

    private static boolean esUnidadValida(List<String> unidades, String unidad) {
        return unidades.contains(unidad.toLowerCase());
    }
}


