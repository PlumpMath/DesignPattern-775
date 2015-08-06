/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package composite.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public class Triangle implements Shape {
 
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
 
}
