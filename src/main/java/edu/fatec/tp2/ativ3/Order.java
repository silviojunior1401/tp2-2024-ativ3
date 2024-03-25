/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.Currency;
import java.util.Date;

/**
 *
 * @author Silvio Junior
 */
public class Order {

    private Date receive;
    private boolean paid;
    private String number;
    private Currency price;
    private OrderString[] orderString;

    public Date getReceive() {
        return receive;
    }

    public void setReceive(Date receive) {
        this.receive = receive;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public OrderString[] getOrderString() {
        return orderString;
    }

    public void setOrderString(OrderString[] orderString) {
        this.orderString = orderString;
    }

    public void send() {
        
    }

    public void close() {
        
    }
}
