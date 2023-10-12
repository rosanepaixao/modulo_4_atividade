public class Carro {
    public static final String Azul = "azul";

    private int numeroDePortas;
    private String chassi;
    private String anoDeFabricacao;
    private String combustivel;
    private String cor;


    public Carro(int  numeroDePortas, String chassi, String anoDeFabricacao, String combustivel, String cor) {
        this.numeroDePortas = numeroDePortas;
        this.chassi = chassi;
        this.anoDeFabricacao = anoDeFabricacao;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getChassi() {
        return chassi;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel ;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor = Azul;
    }



}
