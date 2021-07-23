package Bimestre;

public class m2Cm implements Longitudable{
        @Override
        public void convertir(Converter converter){
            double nuevoValor = converter.getValor() *100;
            converter.setValorTransformado(nuevoValor);
        }
}
