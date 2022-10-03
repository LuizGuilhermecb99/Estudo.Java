package Prateleiradejogos; 

  

import javax.swing.JOptionPane; 

  

public class Menu { 

         

    public static void main(String[] args) { 

        

       

    String a = null; 

    int b = 0; 

    int c = 0; 

       

    int y; //variavel que guarda se o usuário quer add  mais jogos ou se só quer ver so que ja tem 

     

    int num = 0; // numero de jogos na biblioteca 

     

  //  if (y==1){ 

         

  Jogos iGame = new Jogos(); 

             

    iGame.setNameGame(a); 

    iGame.setReleaseYear(b);             

    iGame.setHoursPlayed(c); 

     

     

    y = Integer.parseInt(JOptionPane.showInputDialog("Deseja Adicionar jogos ou somente ver a biblioteca ? \n \t \t \t [1]Add \t [2]Ver")); 

     

        if (y == 1){ 

             

           int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Jogos a serem adicionadas")); 

             

                for ( int i = 1; i <= x; i++){ 

                     

            System.out.println(i+"° Game :"); 

             

            a = JOptionPane.showInputDialog("Digite o Nome do Jogo que Quer adicionar na Biblioteca");  

  

            b = Integer.parseInt(JOptionPane.showInputDialog("Digite O ano de lançamento do Jogo")); // transforma em inteiro o "parseInt"  

  

            c = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas jogadas")); 

             

            iGame.setNameGame(a); 

            iGame.setReleaseYear(b);             

            iGame.setHoursPlayed(c); 

             

             

             

            num += num; 

            

               

            System.out.println("Sua Biblioteca de Games \n" + "Nome do Jogo : "+iGame.getNameGame() +"\n"+ "Ano de Lançamento : "+iGame.getReleaseYear()+"\n" + "Horas Jogadas : "+iGame.getHoursPlayed()); 

             

                } 

     

             

             

        }else { 

             

            if(num == 0){ 

                 

                System.out.println("Você não possui jogos na biblioteca !"); 

                 

            }else{            

                 

                System.out.println("Sua Biblioteca de Games \n" + "Nome do Jogo : "+iGame.getNameGame() +"\n"+ "Ano de Lançamento : "+iGame.getReleaseYear() +"\n" + "Horas Jogadas : "+iGame.getHoursPlayed()); 

          

            } 

        } 

                         

             

     

     } 

     

} 

         

         

         

         

         

         
