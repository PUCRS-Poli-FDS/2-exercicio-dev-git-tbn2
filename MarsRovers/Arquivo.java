package MarsRovers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Arquivo{
    public void Read(String Caminho) {
        ControleRover cr1 = new ControleRover(new Rover(1,1,2,PontoCardeal.N), new Planteau(5,5));
       String conteudo = "";
       ArrayList <String> comandos = new ArrayList<>(20);
       String aux = "";
       try {    
           FileReader arq = new FileReader(Caminho);
           BufferedReader lerArq  = new BufferedReader(arq);
           String linha;
            try {
                linha = lerArq.readLine();
                int i = 0;
                while(linha != null ){
                     comandos.add(i, aux);
                     cr1.moverRover(comandos.get(i));
                     i++;
                }
            } catch (Exception e) {
                System.out.println("Erro ao ler Arqivo");
            }
       } catch (Exception e) {
           System.out.println("Erro ao achar Arqivo");
       }
    }





}