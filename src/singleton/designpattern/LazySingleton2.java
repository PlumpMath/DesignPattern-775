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
public class LazySingleton2 {
    private static volatile LazySingleton2 instance = null;
 
    // private constructor
    private LazySingleton2() {
    }
 
    public static LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton2.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}