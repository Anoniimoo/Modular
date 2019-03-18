public class Caminhao extends Carro {

    private int carga;

    public Caminhao(int velocidade, double preco, String cor, int carga) {
        super(velocidade, preco, cor);
        this.carga = carga;
    }

    public double getPrecoVenda() {
        return this.carga > 2000 ? super.getPrecoVenda() - (super.getPrecoVenda() / 10) : super.getPrecoVenda() - ((super.getPrecoVenda() * 2) / 10);
    }

}
