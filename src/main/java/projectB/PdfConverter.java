package projectB;
//
//import java.io.FileNotFoundException;  
import java.net.MalformedURLException;
import java.util.List;

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;  
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.element.Paragraph;


public class PdfConverter {
	
	private TransactionHistoryResponse transactionHistoryResposne;

	public TransactionHistoryResponse getTransactionHistoryResposne() {
		return transactionHistoryResposne;
	}

	public void setTransactionHistoryResposne(TransactionHistoryResponse transactionHistoryResposne) {
		this.transactionHistoryResposne = transactionHistoryResposne;
	}
	
	public String writeToPdf() {
		
		PdfWriter writer =null;
		PdfDocument pdfDoc =null;
		Document doc =null;
		
		// Initialising pdf writer and creating a pdf document
		try {
			writer = new PdfWriter("C:\\Users\\anirudh.joshi\\Documents\\ProjectWorkspace\\projectB\\TransactionHistoryEntries.pdf");
			pdfDoc = new PdfDocument(writer);
			doc = new Document(pdfDoc);
			doc.setFontSize(9);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//create transactionhistoryrentries object
		TransactionHistoryEntries transactionHistoryEntries = this.transactionHistoryResposne.getTransactionHistoryEntries();
		List<TransactionHistoryEntry> transactionHistoryEntryList = transactionHistoryEntries.getTransactionHistoryEntry();
		
	    //create image object and adding it to the table
		String imagePath = "logo_comviva.png";
		ImageData data = null;
		try {
			data = ImageDataFactory.create(imagePath);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Image image = new Image(data);
		image.setFixedPosition(100,500);
		image.setOpacity((float) 0.5);
		doc.add(image);
		
		//adding heading to the document
		Paragraph heading = null;
		try {
			heading = new Paragraph("Transaction History Entries");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		heading.setTextAlignment(TextAlignment.CENTER);
		heading.setFontSize(16);
		heading.setBold();
		doc.add(heading);
		doc.add(new Paragraph("\n\n"));
		
		//creating table object
		float [] pointColumnWidths = {10F, 10F, 10F,10F,10F,10F,10F,10F,10F};   
		Table table = null;
		try {
			table = new Table(pointColumnWidths);
		}
		catch(Exception e) {
			 e.printStackTrace();
		}	
		
		//adding column names
	    table.addCell(new Cell().add(new Paragraph("Sr. No")));
	    table.addCell(new Cell().add(new Paragraph("Transaction Id")));
	    table.addCell(new Cell().add(new Paragraph("Name")));
	    table.addCell(new Cell().add(new Paragraph("Transfer Type")));
	    table.addCell(new Cell().add(new Paragraph("Start Date")));
	    table.addCell(new Cell().add(new Paragraph("From")));
	    table.addCell(new Cell().add(new Paragraph("To")));
	    table.addCell(new Cell().add(new Paragraph("Amount")));
	    table.addCell(new Cell().add(new Paragraph("Transaction Status")));
		
		int count =1;
		for(TransactionHistoryEntry transactionHistoryEntry : transactionHistoryEntryList) {
			
			table.addCell(new Cell().add(new Paragraph(""+count)));
			try {
				if(transactionHistoryEntry.getFinancialTransactionId()!=null)
					table.addCell(new Cell().add(new Paragraph(transactionHistoryEntry.getFinancialTransactionId())));
				
				if(transactionHistoryEntry.getFromFirstName()!=null && transactionHistoryEntry.getFromLastName()!=null)
					table.addCell(new Cell().add(new Paragraph(transactionHistoryEntry.getFromFirstName()+" "+transactionHistoryEntry.getFromLastName())));
				
				if(transactionHistoryEntry.getTransferType()!=null)
					table.addCell(new Cell().add(new Paragraph(transactionHistoryEntry.getTransferType())));
				
				if(transactionHistoryEntry.getStartDate()!=null) {
					String date = transactionHistoryEntry.getStartDate();
					table.addCell(new Cell().add(new Paragraph(date.substring(0,date.indexOf("T")))));
				}
				if(transactionHistoryEntry.getFrom()!=null) {
					String from = transactionHistoryEntry.getFrom();
					table.addCell(new Cell().add(new Paragraph(from.substring(from.indexOf(":")+1,from.indexOf(":")+13))));
				}
				if(transactionHistoryEntry.getTo()!=null) {
					String to = transactionHistoryEntry.getTo();
					table.addCell(new Cell().add(new Paragraph(to.substring(to.indexOf(":")+1,to.indexOf(":")+13))));
				}
				if(transactionHistoryEntry.getOriginalAmount() != null)
					table.addCell(new Cell().add(new Paragraph(transactionHistoryEntry.getOriginalAmount().getAmount()+transactionHistoryEntry.getOriginalAmount().getCurrency())));
				
				if(transactionHistoryEntry.getTransactionStatus()!=null)
					table.addCell(new Cell().add(new Paragraph(transactionHistoryEntry.getTransactionStatus())));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			count++;
			
		}
		doc.add(table);
		doc.close();
		return "Files Written Successfully";
		
	}

}
