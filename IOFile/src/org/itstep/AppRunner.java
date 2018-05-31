package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		String fromPath = "D:\\test\\foto.jpg";
		String toPath = "D:\\test\\test2\\foto.jpg";
		IOData fileIO = new IOData();
		fileIO.copyFile(fromPath, toPath);
		System.out.println("JPG file copied!");
		
		String fromPath2 = "D:\\test\\test.txt";
		String toPath2 = "D:\\test\\test2\\test.txt";
		IOData.copyTextFile(fromPath2, toPath2);
		System.out.println("TXT file copied!");

	}

}
