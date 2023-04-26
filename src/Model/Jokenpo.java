package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jokenpo {

    public static void Jogo() {

        Random gerador = new Random();
        int jogador;
        int pc = gerador.nextInt(3)+1;
        String x =  JOptionPane.showInputDialog(null , "[1] - Pedra \n [2] - Tesoura \n [3] - Papel ");
        jogador = Integer.parseInt(x);
        
        if(jogador == pc){
            JOptionPane.showMessageDialog(null, "Empate!");
            
        }else if(jogador == 1 && pc == 2){
            JOptionPane.showMessageDialog(null, "O Jogador ganhou! ");
            
        }else if(jogador == 2 && pc == 3){
            JOptionPane.showMessageDialog(null, "Você Ganhou! ");
            
        }else if(jogador == 2 && pc == 3){
            JOptionPane.showMessageDialog(null, "Você Ganhou! ");
            
        }else if(jogador == 3 && pc == 1){
            JOptionPane.showMessageDialog(null, "Você Ganhou! ");
            
        }else if(pc == 1 && jogador == 2){
            JOptionPane.showMessageDialog(null, "Você Perdeu! ");
        }else if(pc == 2 && jogador == 3){
            JOptionPane.showMessageDialog(null, "Você Perdeu! ");
        }else if(pc == 3 && jogador == 1){
            JOptionPane.showMessageDialog(null, "Você Perdeu! ");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! ");
        }
            
       
            
           
            


        }

        
       
            

        }

   

