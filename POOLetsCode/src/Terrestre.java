public class Terrestre extends Veiculo {

    private int rodas;

    public Terrestre(int rodas,String nome, String marca, double velocidade, boolean isLigado) {
        super(nome, marca, velocidade,isLigado);
        this.rodas = rodas;
    }

    public Terrestre() {

    };

    public void acelerar() {
        this.velocidade += 5;
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void ligarDesligar() {
        this.isLigado = !this.isLigado;
        System.out.println("Veiculo Ligado = " +this.isLigado);
    }

}
