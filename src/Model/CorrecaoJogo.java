package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class CorrecaoJogo {
    
    public static void ale(){
        int [] vet = new int [10];
        String total = "";
        int pontos =0;
        
        Random gera = new Random();
        
        
        for(int c=0; c < 10; c++){//Armazenando Números Aleatórios
            vet[c] = gera.nextInt();
            total = total + vet[c] + " | ";
        }
        
        total = total + "\n\n";
        
        for(int c =0; c < 10;c++){ //
            String x = JOptionPane.showInputDialog(null, "Digite números de 0 a 1\nDigite o numero " + (c+1));
            int resp = Integer.parseInt(x);
            total = total + resp + " | ";
            
            if(vet[c] == resp){
                pontos++;
                
            }
            
            
        }
        
        total = total + "\n\nO total de pontos foi" + pontos; 
        JOptionPane.showMessageDialog(null, total);
    }
    
    
    
}
