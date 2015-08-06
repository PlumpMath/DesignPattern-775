/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public class SupportPopupDecorator extends ColumDecorator{
 
    public SupportPopupDecorator(Report report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }
     
    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}