public class Fiat extends Carro {

    private int descontoDeFabrica;

    public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
        super(velocidade, preco, cor);
        this.descontoDeFabrica = descontoDeFabrica;
    }

    public double getPrecoVenda(){
        return super.getPrecoVenda() - ((super.getPrecoVenda() * this.descontoDeFabrica)/100);
    }

}
