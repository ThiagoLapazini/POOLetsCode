public class Aquatico extends Veiculo{

    private boolean isSubaquatico;

    public boolean isSubaquatico() {
        return isSubaquatico;
    }

    public void setSubaquatico(boolean subaquatico) {
        isSubaquatico = subaquatico;
    }
    public Aquatico(){

    };
    public Aquatico(String nome, String marca, double velocidade, boolean isLigado, boolean isSubaquatico) {
        super(nome, marca, velocidade, isLigado);
        this.isSubaquatico = isSubaquatico;
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
