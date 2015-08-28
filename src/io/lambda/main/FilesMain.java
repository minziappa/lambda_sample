package io.lambda.main;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class FilesMain {

	public static void main(String[] args) {
		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
		
		final LongAdder dirCount = new LongAdder(); 
		final LongAdder filCount = new LongAdder(); 
		if (myDir.isDirectory()) { 
			myDir.listFiles( (File f) -> { 
								if (f.isDirectory()) { 
									dirCount.increment(); 
									return false; 
								}
								if (f.isFile()) { 
									filCount.increment();
									return false; 
								}
								return false; 
							}
			);
		}

		// javav();
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

			List<File> fileList = Arrays.asList(files);
			fileList.forEach((file) -> System.out.print(file.getName() + "; "));

		}
	}
	
	public static void javalambda() {

		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
		if(myDir.isDirectory()) {
			File[] files = myDir.listFiles(
				(File f) -> {return f.isFile();}
			);
			
			List<File> fileList = Arrays.asList(files);
			fileList.forEach(System.out::println);
		}

	}
	
	public static void javalambda2() {

		File myDir = new File("//Users//kim_woongjoon//git//jquery_sample/");
		if(myDir.isDirectory()) {
			File[] files = myDir.listFiles(File::isFile);
		}

	}

}