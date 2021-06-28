/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discretizer;



//package keel.Algorithms.Genetic_Rule_Learning.Globals;

import java.io.*;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.*;
//import java.lang.*;

public class FileManagement {
    FileInputStream fileInput;
    FileOutputStream fileOutput;
    
    public FileManagement() {
    }

       public void initRead(String _name) throws Exception {
	fileInput = new FileInputStream(_name);
    }
    
        public void initWrite(String _name) throws Exception {
	fileOutput = new FileOutputStream(_name);
    }
    
    
    public char readChar() throws Exception {
        return (char)fileInput.read();
    }
    
        public void writeChar(char _c) throws Exception {
        byte[] b=new byte[1];
        b[0]=(byte)_c;
        fileOutput.write(b);
    }

    
    public String readLine() throws Exception {
            char c;
            String a="";
            c = (char) fileInput.read();
            do {
                    a=a+c;
                    c = (char) fileInput.read();
            }while ((fileInput.available()!=0)&&(c!='\n'));
            if (c!=' ')	{
                    a=a+c;
            }
            return a;		
    }

        public void writeLine(String _line) throws Exception {
        for (int i=0; i<_line.length(); i++)
            writeChar(_line.charAt(i));
    }
    
       public int fin() throws Exception {
        return fileInput.available();	
    }

       public void closeRead() throws Exception {
	fileInput.close();
    }
    
        public void closeWrite() throws Exception {
	fileOutput.close();
    }
    
 
     public String readAllFile() {
        String ret="";
        try {
            while (fin()!=0) {
                ret += readLine();
            }
            return ret;
        }catch(Exception e) {
            return null;	
        }
     }
}

