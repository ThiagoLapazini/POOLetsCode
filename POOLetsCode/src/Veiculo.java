import java.util.Objects;

public abstract class Veiculo {
    private String nome;
    private String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return isLigado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return nome.equals(veiculo.nome) && marca.equals(veiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca);
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public Veiculo(){

    };

    public Veiculo(String nome, String marca, double velocidade, boolean isLigado) {
        this.nome = nome;
        this.marca = marca;
        this.velocidade = velocidade;
        this.isLigado = isLigado;
    }

    protected double velocidade = 0.0;

    protected boolean isLigado = true;

    abstract void acelerar();

    abstract void ligarDesligar();

    final public void abastecer(){
        System.out.println("Abastecendo");
    }
}
