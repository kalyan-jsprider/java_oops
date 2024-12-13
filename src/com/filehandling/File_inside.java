package com.filehandling;

import java.io.File;
import java.io.IOException;

public class File_inside {
	public static void main(String[] args) {
	File f=new File("C:\\Users\\Kalyan_Sahu\\Desktop\\kalyans\\new") ;
		
	try {
		if(f.createNewFile()) {
		System.out.println("file has been create ");	
		}
		else {
			System.out.println("file not create.");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}