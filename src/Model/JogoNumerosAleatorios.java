package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class JogoNumerosAleatorios {

    public static void NumerosRandom() {
        Random gerador = new Random();
        int contAcertos = 0;
        String NumAle = " ";
        String NumUser = " ";
        int NumerosAle[] = new int[10];
        int NumerosUser[] = new int[10];

        for (int i = 0; i < 10; i++) { //Vetor com Números Aleatórios

            NumerosAle[i] = gerador.nextInt(2);

        }

        for (int c = 0; c < 10; c++) { //Numeros Digitados pelo usúario

            String x = JOptionPane.showInputDialog(null, "Digite 10 números de 0 a 2: ");
            NumerosUser[c] = Integer.parseInt(x);

        }

        for (int cont = 0; cont < 10; cont++) {

            if (NumerosUser[cont] == NumerosAle[cont]) {
                contAcertos++;

            }

            NumAle += NumerosAle[cont] + " ";
            NumUser += NumerosUser[cont] + " ";

        }

        JOptionPane.showMessageDialog(null, "Números Sorteados: " + NumAle + "\nNumeros Digitados:   " + NumUser + "\nO Usúario acertou: " + contAcertos);

    }

}
