/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Deivid
 */
public class Fila {
    private int [] people;
    private int first;
    private int last;
    private int total;
    
    public Fila(){
        people = new int[80];
        first = 0;
        last = 0;
        total = 0;
        
    }
    public void insert(int e){
        if(isFull()){
            throw new RuntimeException("Fila Cheia!");
        }
        people[last] = e;
        last += 1 % people.length;
        total++;
    }
    
    public int retirar(){ 
        if(isEmpty()){
            throw new RuntimeException("Fila vazia! Ninguém para atender");
        }
        int person = people[first];
        first += 1 % people.length;
        total--;
        return person;
    }
    
    public boolean isEmpty(){
        return total == 0;
    }
    
    public boolean isFull(){
        return total == people.length;
}
}
