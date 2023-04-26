package Model;

import javax.swing.JOptionPane;

public class Lista_DAO {

    public static void ex01() {
        double[] vet = new double[10];
        double Nn = 0;
        double Np = 0;

        for (int i = 0; i < 10; i++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (i + 1));
            vet[i] = Double.parseDouble(x);

            if (vet[i] < 0) {
                Nn++;

            } else {
                Np = Np + vet[i];

            }

        }

        JOptionPane.showMessageDialog(null, "A quantidade de negativos é " + Nn);
        JOptionPane.showMessageDialog(null, "A soma dos positivos é " + Np);

    }

    public static void ex02() {

        double[] vet = new double[5];
        double Nn = 0;
        double Np = 0;

        for (int i = 0; i < 10; i++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (i + 1));
            vet[i] = Double.parseDouble(x);

            if (vet[i] >= 0) {
                JOptionPane.showMessageDialog(null, "O Numero" + vet[i] + " É positivo");

            }
        }

    }

    public static void ex03() {

        double[] vet = new double[7];
        double mod2 = 0;
        double Np = 0;

        for (int i = 0; i < 7; i++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor " + (i + 1));
            vet[i] = Double.parseDouble(x);

            if (vet[i] % 2 == 0 && vet[i] % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O Numero" + vet[i] + " É Multiplo de 2 e 3");

            } else if (vet[i] % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O Numero" + vet[i] + " É Multiplo de 2");

            } else if (vet[i] % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O Numero" + vet[i] + " É Multiplo de 3 ");

            }

        }

    }

}
