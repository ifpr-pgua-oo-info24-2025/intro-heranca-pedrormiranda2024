package main.java.com.rodrigo.pedro.models;

public class Moto extends Veiculo {
    private String tipoGuidao;

    public Moto(String marca, String modelo, int ano, String tipoGuidao) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + "[tipoGuidao=" + tipoGuidao + "]";
    }

}
