/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Deivid
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File log = new File("C:\\Users\\Deivid\\log.txt");
        
            if (! log.exists() ) {
                log.createNewFile();
            }
        
            
        Fila fila = new Fila ();
        Pilha pilha = new Pilha();
        People people = new People();
        int room1[], room2[], room3[], room4[], room5 [];       
        int cont = 10;
        int ticket = 1;
        
        
        for (int i = 1; i <= cont; i++){
            pilha.push(i);
            System.out.println("Acrescentados " + i + " ingressos na pilha" );
        }
        
        System.out.println("Desejar adicionar ou remover alguém da fila? 1 - REMOVE 2 - ADD ");
        
        int menu = sc.nextInt();
        
        switch(menu){
            case 1:
                 if(! fila.isEmpty()){
                    
                    for(int i = 1; i <= cont; i++) {
                        String name = null, phone = null,email = null;
                    
                        System.out.println("Próximo da fila: ");

                        System.out.println("DIGITE UM NOME: ");
                        sc.next(name);
                        people.setName(name);

                        System.out.println("DIGITE UM TELEFONE: ");
                        sc.next(phone);
                        people.setPhone(phone);

                        System.out.println("DIGITE UM EMAIL: ");
                        sc.next(email);
                        people.setEmail(email);

                        fila.retirar();
                        pilha.pop(ticket);
                    } 
                                        
                    break;
                       
                }
            
            case 2:
                
                for(int i = 1; i <= cont; i ++){
                    System.out.println("DIGITE UM NOME: ");
                    String name = sc.next();
                    people.setName(name);

                    System.out.println("DIGITE UM TELEFONE: ");
                    String phone = sc.next();
                    people.setPhone(phone);

                    System.out.println("DIGITE UM EMAIL: ");
                    String email = sc.next();
                    people.setEmail(email);              

                    fila.insert(ticket);
                }
            break;    
        }
        
        
       
        
        
        
    }
    
}
