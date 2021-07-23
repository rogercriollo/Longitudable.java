package Bimestre;

public class Converter {
    private double valor;
    private String unidadOrigen;
    private String unidadDestino;
    private double valorTransformado ;



    public Converter(double valor, String unidadOrigen, String unidadDestino ) {
        this.valor = valor;
        this.unidadOrigen = unidadOrigen;
        this.unidadDestino = unidadDestino;
    }
    public void convertir(Longitudable longitudable){
        longitudable.convertir(this);

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(String unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public String getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(String unidadDestino) {
        this.unidadDestino = unidadDestino;
    }

    public double getValorTransformado() {
        return valorTransformado;
    }

    public void setValorTransformado(double valorTransformado) {
        this.valorTransformado = valorTransformado;
    }
}
