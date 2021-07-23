package Bimestre;

import javax.swing.*;

public class Converciones {
    public static void main(String[] args) {
        String valueTxt;
        double value;
        String unidadDeOrigen;
        String  unidadDeDestino;
        double valorTransformado =0;

        valueTxt = JOptionPane.showInputDialog("Ingrese el valor:");
        unidadDeOrigen = JOptionPane.showInputDialog("Ingrese la unidad de origen:");
        unidadDeDestino = JOptionPane.showInputDialog("Ingrese la unidad de destino:");
        value = Double.parseDouble(valueTxt);
        Converter converter = new Converter(value,unidadDeOrigen,unidadDeDestino);

        if (unidadDeOrigen.equals("cm") && unidadDeDestino.equals("m")) {
            cm2m convercion1 = new cm2m();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();
        }
        if (unidadDeOrigen.equals("cm") && unidadDeDestino.equals("km")) {
            cm2km convercion1 = new cm2km();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();

        }
        if (unidadDeOrigen.equals("m") && unidadDeDestino.equals("km")) {
             m2km convercion1 = new m2km();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();

        }
        if (unidadDeOrigen.equals("km") && unidadDeDestino.equals("cm")) {
            km2cm convercion1 = new km2cm();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();


        }
        if (unidadDeOrigen.equals("km") && unidadDeDestino.equals("cm")) {
            km2cm convercion1 = new km2cm();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();

        }
        if (unidadDeOrigen.equals("km") && unidadDeDestino.equals("m")) {
            km2m convercion1 = new km2m();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();

        }
        if (unidadDeOrigen.equals("m") && unidadDeDestino.equals("cm")) {
            m2Cm convercion1 = new m2Cm();
            convercion1.convertir(converter);
            valorTransformado = converter.getValorTransformado();

        }







            JOptionPane.showMessageDialog(null, "En " + value + " "+unidadDeOrigen+" hay "+ valorTransformado+ " "+ unidadDeDestino);


        }






    }
