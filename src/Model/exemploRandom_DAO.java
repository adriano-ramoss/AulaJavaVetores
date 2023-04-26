package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class exemploRandom_DAO {
    
    public static void GeraAle(){
        
        Random gerador = new Random();
        int []vet = new int [10];
       
       // vet[0] = gerador.nextInt(10); // Armazendado numeros manualmente aleatoriamente de 1 a 10
        
        for(int i =0; i < 3; i++){
            
            vet[i] = gerador.nextInt(10);
            
            
        }
        
        JOptionPane.showMessageDialog(null, vet[0] + " | " + vet[1] + " | " + vet[2]);
        
    }
    
}
