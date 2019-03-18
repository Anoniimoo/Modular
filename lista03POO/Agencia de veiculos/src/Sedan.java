public class Sedan extends Carro {

    private int comprimento;

    public Sedan(int velocidade, double preco, String cor, int comprimento) {
        super(velocidade, preco, cor);
        this.comprimento = comprimento;
    }

    public double getPrecoVenda(){
        return this.comprimento > 6 ? super.getPrecoVenda() - ((super.getPrecoVenda() * 5)/100) : super.getPrecoVenda() - (super.getPrecoVenda()/10);
    }

}
