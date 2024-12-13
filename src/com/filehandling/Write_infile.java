package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_infile {
public static void main(String[] args) {
	 File n = new File("C:\\\\Users\\\\Kalyan_Sahu\\\\Desktop\\\\kalyans\\\\new");
	 try {
		FileWriter fw=new FileWriter(n);
		fw.write("jhdhdhjdjdjjdjhdh");
		fw.flush();
		System.out.println("success");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}