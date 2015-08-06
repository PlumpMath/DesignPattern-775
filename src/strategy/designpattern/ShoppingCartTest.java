/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategy.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public class ShoppingCartTest {
 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
         
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
         
        cart.addItem(item1);
        cart.addItem(item2);
         
        //pay by paypal
        cart.pay(new PaypalStrategy("masud.java@gmail.com", "passwd"));
         
        //pay by credit card
        cart.pay(new CreditCardStrategy("Masudur Rahman", "1234567890123456", "786", "12/15"));
    }
 
}
