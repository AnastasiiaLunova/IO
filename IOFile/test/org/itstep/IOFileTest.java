package org.itstep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IOFileTest {

	@Test
	void testReadDataFromFile() {
		String filePath = "D:\\test\\foto.jpg";
		IOData ioData = new IOData();
		byte[] masiv = ioData.readDataFromFile(filePath);
		assertTrue(masiv.length > 0);
		
	}

	@Test
	void testReadTextFromFile() {
		String filePath = "D:\\test\\test.txt";
		String text = IOData.readTextFromFile(filePath);
		assertNotNull(text);
		
		
	}

}
