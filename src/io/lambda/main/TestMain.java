package io.lambda.main;

import java.io.File;
import java.io.FileFilter;

public class TestMain {

	public static void main(String[] args) {
		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
	}

	public static void javav() {
		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
		if(myDir.isDirectory()) {
			File[] files = myDir.listFiles(

				new FileFilter() {
					@Override
					public boolean accept(File f) {
						return f.isFile();
					}
				}

			);
		}
	}
	
	public static void javalambda() {

		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
		if(myDir.isDirectory()) {
			File[] files = myDir.listFiles(
				(File f) -> {return f.isFile();}
			);
		}

	}
}