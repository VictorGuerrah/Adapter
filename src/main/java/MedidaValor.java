public class MedidaValor implements Medida{
    private Float valor;

    @Override
    public float getMedida() {
        return this.valor;
    }

    @Override
    public void setMedida(Float valor) {
        this.valor = valor;
    }
}
