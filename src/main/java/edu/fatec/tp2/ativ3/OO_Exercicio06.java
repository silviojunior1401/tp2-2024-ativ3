/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class OO_Exercicio06 {
    public static void main(String[] args) {
        Order order = new Order();
        order.send();
        order.close();

        OrderString orderString = new OrderString();
        orderString.setQuantity(10);
        orderString.setSatisfied(true);

        CorporateClient corporateClient = new CorporateClient();
        corporateClient.setContactName("Fulano da Silva");
        corporateClient.setCreditLimit("10000");
        corporateClient.remind();
        corporateClient.monthBill(3);

        IndividualClient individualClient = new IndividualClient();
        individualClient.setCreditCardNumber("1234567890123456");
    }
}
