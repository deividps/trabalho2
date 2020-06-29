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
public class People {
    private String name;
    private String phone;
    private String email;
    private int ticket;
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName (){
        return name;
    }
    
    public void setPhone (String Phone){
        this.phone = Phone;
    }
    
    public String getPhone (){
        return phone;
    }
    
    public void setEmail (String Email) {
        this.email = Email;
    }
    
    public String getEmail () {
        return email;
    }
    
    private int getTicket () {
        return ticket;
    }
    
    private void setTicket (int ticket) {
        this.ticket = ticket;
    }
}
