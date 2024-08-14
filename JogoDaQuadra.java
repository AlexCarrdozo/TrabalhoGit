import javax.swing.JOptionPane;

public class JogoDaQuadra {
    public static void main(String[] args) {
        double premio = 0, premioPorGanhador;
        int cartelas [] [] = new int [10] [4];
        int numrsSorteados [] = new int [4];
        int acertos, countPremiadas = 0;

        // Pede para informar o valor do prêmio;
        String num = JOptionPane.showInputDialog(null, "Informe o valor do prêmio: ");
        premio = Integer.parseInt(num);

        // Pede para informar os 4 números de 10 cartelas diferentes;
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "Informe os números da cartela "+(i + 1));
            for (int j = 0; j < 4; j++) {
                String numrs = JOptionPane.showInputDialog(null, "Número "+ (j + 1));
                cartelas [i] [j] =  Integer.parseInt(numrs); 
            }
        }

        // Pede para informar os 4 números sorteados;
        JOptionPane.showMessageDialog(null, "Informe os 4 números sorteados: ");
        for (int i = 0; i < 4; i++) {
                String numrs = JOptionPane.showInputDialog(null, "Número "+ (i + 1)+ ": ");
                numrsSorteados [i] =  Integer.parseInt(numrs); 
        }

        // Verifica se há alguma cartela sorteada
        for (int i = 0; i < 10; i++) {
            acertos = 0;
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 4; j2++) {
                    if (cartelas [i] [j] == numrsSorteados[j2]) {
                        acertos++; 
                    }
                }
                if (acertos == 4) {
                    countPremiadas++;
                }
            }
        }

        // Divide o prêmio por todos os ganhadores e se não houver, o prêmio é zerado;
        if (countPremiadas > 0) {
            premioPorGanhador = premio / countPremiadas;
        }
        else{
            premioPorGanhador = 0;
        }

        // Imprime o resultado de quantos ganhadores e qual o valor que cada um irá receber;
        JOptionPane.showMessageDialog(null, "Número de cartelas premiadas: "+ countPremiadas);
        JOptionPane.showMessageDialog(null, "Valor do prêmio por ganhador: "+ premioPorGanhador);
        
    }
}