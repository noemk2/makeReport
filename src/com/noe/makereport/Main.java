package com.noe.makereport;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.setNameFile("Reporte");
        report.setExtension("txt");
        report.setTitle(":::REPORTE::: \n");
        String content = report.getTitle();
        for (int i = 0; i < 5; i++) {
            content += "\n Reporte: "+i;
        }

        report.setContent(content);
        report.makeReport();
    }

}