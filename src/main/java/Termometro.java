public class Termometro {
    Medida medidaValor;
    MedidaAdapter persistencia;

    public Termometro() {
        medidaValor = new MedidaValor();
        persistencia = new MedidaAdapter(medidaValor);
    }

    public void setMedida(Float valor) {
       medidaValor.setMedida(valor);
       persistencia.salvarMedida();
    }

    public Float getCelsius() {
        return persistencia.recuperarMedida();
    }

    public Float getFahrenheit() {
        return medidaValor.getMedida();
    }
}
