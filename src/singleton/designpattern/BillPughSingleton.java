/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class LazyHolder {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
