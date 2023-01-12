public final class Carro extends Terrestre{


    public Carro(){

    }
    public Carro(String nome, String marca, double velocidade, boolean isLigado) {
        super(4, nome, marca, velocidade, isLigado);
    }

    public void buzinar(){
        System.out.println("HONK HONK HONK!!!");
    }
}
