package Bimestre;
import  Bimestre.Longitudable;
public class cm2m implements Longitudable {
    @Override
    public void convertir(Converter converter){
        double nuevoValor = converter.getValor()/100;
        converter.setValorTransformado(nuevoValor);
    }

}
