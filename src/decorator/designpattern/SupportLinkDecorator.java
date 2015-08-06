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
public class SupportLinkDecorator extends ColumDecorator{
 
    public SupportLinkDecorator(Report report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }
     
    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}