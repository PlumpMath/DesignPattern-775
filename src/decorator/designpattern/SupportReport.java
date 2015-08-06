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
public class SupportReport implements Report {
 
    @Override
    public Object[][] getReportData(String reportId) {
        return null;
    }
 
    @Override
    public String getFirstColumnData() {
        return "Support data";
    }
     
}
