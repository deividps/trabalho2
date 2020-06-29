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
public class Pilha {
    int tamanho [];
    int top;
    
    public Pilha() {
        tamanho = new int [10];
        top = -1;
    }
    
    public boolean isFull() {
        return (top == 10);
    }
    
    public boolean isEmpty(){
        return top == -1;    
    }
    
    public void push(int e) {
        top ++;
        tamanho[top] = e;
    }
    
    public int pop(int e){     
        e = tamanho[top];
        top -=1;
        return e;
        
    }
}
