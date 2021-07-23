package Bimestre;

public class km2m implements Longitudable {

    @Override
    public void convertir(Converter converter){
        double nuevoValor = converter.getValor()*1000;
        converter.setValorTransformado(nuevoValor);
    }
}

