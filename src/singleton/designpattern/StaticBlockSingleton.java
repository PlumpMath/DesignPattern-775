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
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
 
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
 
    private StaticBlockSingleton() {
        // ...
    }
}