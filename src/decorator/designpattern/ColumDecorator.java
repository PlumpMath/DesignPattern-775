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
public abstract class ColumDecorator implements Report
{
    private Report decoratedReport;
     
    public ColumDecorator(Report report){
        this.decoratedReport = report;
    }
     
    public String getFirstColumnData() {
        return decoratedReport.getFirstColumnData();
    }
     
    @Override
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
}