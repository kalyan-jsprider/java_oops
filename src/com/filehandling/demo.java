package com.filehandling;

import java.io.File;

public class demo {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Kalyan_Sahu\\Desktop\\kalyans");
if(f.mkdir()) {
	System.out.println("file is created");
}
}
}
