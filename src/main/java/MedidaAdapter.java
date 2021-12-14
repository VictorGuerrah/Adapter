public class MedidaAdapter extends MedidaValor{

    private Medida medida;

    public MedidaAdapter(Medida medida) {
        this.medida = medida;
    }

    public MedidaAdapter() {

    }

    public Float recuperarMedida() {
        float fahrenheit = (float) (this.getMedida() * 1.8 + 32);
        medida.setMedida(fahrenheit);
        return medida.getMedida();
    }

    public void salvarMedida() {
        float celsius = (float) ((medida.getMedida() - 32) * (5/9));
        this.setMedida(celsius);
    }
}
