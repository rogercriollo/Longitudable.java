package Bimestre;

public class km2cm implements Longitudable {
        @Override
        public void convertir(Converter converter){
            double nuevoValor = converter.getValor()/10000;
            converter.setValorTransformado(nuevoValor);
        }
}
