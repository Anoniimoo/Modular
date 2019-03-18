public class Carro {

    protected int velocidade;
    protected double preco;
    protected String cor;

    public Carro(int velocidade, double preco, String cor) {
        this.velocidade = velocidade;
        this.preco = preco;
        this.cor = cor;
    }

    public double getPrecoVenda(){
        return this.preco;
    }


}
