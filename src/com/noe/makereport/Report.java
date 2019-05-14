package com.noe.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Report {
    private String nameFile;
    private String title;
    private String content;
    private String extension;

    public String getContent() {
        return content;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeReport() {
        if ((getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
            // crear archivo
            try{

            File file= new File(getNameFile()+"."+getExtension()) ; 
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw =new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(getContent());
            bw.close();     
            } 
            catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Ingrese los datos del archivo");
        }
    }

}