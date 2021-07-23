package Bimestre;

public class m2km implements Longitudable{
    @Override
    public void convertir(Converter converter){
        double nuevoValor = converter.getValor()/1000;
        converter.setValorTransformado(nuevoValor);
    }

}
