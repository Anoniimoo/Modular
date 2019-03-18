import javax.swing.*;

public class AgenciaDeVeiculos {

    public static void main(String[] args) {
        Caminhao caminhaoS = new Caminhao(150, 100000, "vermelho", 1500);
        Caminhao caminhaoG = new Caminhao(150, 150000, "vermelho", 2500);

        Fiat uno = new Fiat(200, 40000, "branco", 5);

        Sedan siennaS = new Sedan(200, 30000, "prata", 5);
        Sedan siennaG = new Sedan(200, 35000, "prata", 8);

        JOptionPane.showMessageDialog(null, "Velocidade: 150\nPreço: " + caminhaoS.getPrecoVenda() + "\nCor: Vermelho\nCarga: 1500", "CaminhãoS", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Velocidade: 150\nPreço: " + caminhaoG.getPrecoVenda() + "\nCor: Vermelho\nCarga: 2500", "CaminhãoG", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Velocidade: 200\nPreço: " + uno.getPrecoVenda() + "\nCor: Branco\nDesconto de fábrica: 5%", "Uno", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Velocidade: 200\nPreço: " + siennaS.getPrecoVenda() + "\nCor: Prata\nComprimento: 5 metros", "SiennaS", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Velocidade: 200\nPreço: " + siennaG.getPrecoVenda() + "\nCor: Prata\nComprimento: 8 metros", "SiennaG", JOptionPane.INFORMATION_MESSAGE);
    }
}
