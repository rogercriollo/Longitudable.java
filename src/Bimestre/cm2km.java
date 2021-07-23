package Bimestre;

public class cm2km  implements Longitudable {

        @Override
        public void convertir(Converter converter){
            double nuevoValor = converter.getValor()/ 100000;
            converter.setValorTransformado(nuevoValor);
        }
}
