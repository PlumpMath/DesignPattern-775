/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}