import java.awt.Dimension;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.swing.JFrame;
public class FileIO extends SelectionUI{
	public static void main(String args[])
	{
		
	try {
	PDDocument newDoc = new PDDocument();
	PDPage newPage = new PDPage();
	newDoc.addPage(newPage);
	PDPageContentStream content = new PDPageContentStream(newDoc,newPage);
	
	content.beginText();
	content.setFont(PDType1Font.TIMES_BOLD, 26);
	content.moveTo(220, 750);
	content.showText("HELLO WORLD");
	content.endText();
	System.out.println(System.getProperty("user.dir"));
	
	
	
	
	
	
	content.close();
	newDoc.save("ResumeBuilder.pdf");
	newDoc.close();
	
	}
	catch(Exception e)
	{
		
	}
}
}
