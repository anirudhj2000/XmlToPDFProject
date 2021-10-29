package projectB;

import java.io.File;

public class DomParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("XmlSample.xml");
		
		//Parsing XML file to Object
		XmlParser xmlParser = new XmlParser(file);
		TransactionHistoryResponse transactionHistoryResponse = xmlParser.getTransactionHistoryResponse();
		
		//Converting java object to JSON
		ToJSON toJSON = new ToJSON(transactionHistoryResponse);
		System.out.println(toJSON.getJSONObject());
		
		//finally converting to PDF
		PdfConverter pdfConverter = new PdfConverter();
		pdfConverter.setTransactionHistoryResposne(transactionHistoryResponse);
		System.out.println(pdfConverter.writeToPdf()); 
	
	}

}
