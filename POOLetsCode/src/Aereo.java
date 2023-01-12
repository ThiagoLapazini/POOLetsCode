public class Aereo extends Veiculo{

    private int turbinas;

    public Aereo(String nome, String marca, double velocidade, boolean isLigado, int turbinas) {
        super(nome, marca, velocidade, isLigado);
        this.turbinas = turbinas;
    }


    public Aereo(){
    };

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public void acelerar() {
        this.velocidade += 5;
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void ligarDesligar() {
        this.isLigado = !this.isLigado;
        System.out.println("Veiculo Ligado = " +this.isLigado);
    }
}
