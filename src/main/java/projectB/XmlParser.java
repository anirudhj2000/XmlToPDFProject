package projectB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XmlParser {

	private TransactionHistoryResponse transactionHistoryResponse;
	
	private File file;

	public XmlParser(File file) {
		super();
		this.file = file;
		parseXml(this.file);
		
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public TransactionHistoryResponse getTransactionHistoryResponse() {
		return transactionHistoryResponse;
	}

	public void setTransactionHistoryResponse(TransactionHistoryResponse transactionHistoryResponse) {
		this.transactionHistoryResponse = transactionHistoryResponse;
	}

	
	public void parseXml(File file) {
		List<TransactionHistoryEntry> transactionHistoryEntriesList = new ArrayList<TransactionHistoryEntry>();

		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder dBuilder;
			Document doc = null;
			try {
				dBuilder = dbFactory.newDocumentBuilder();
				doc = dBuilder.parse(file);
				doc.getDocumentElement().normalize();
			}
			catch(ParserConfigurationException e) {
				e.printStackTrace();
			}
			
			//getting all the transactionhistoryentries
			NodeList nTransactionHistoryEntries = doc.getElementsByTagName("transactionhistoryentry");
			
			//parsing through all the transactionhistoryentries
			for(int i=0;i < nTransactionHistoryEntries.getLength(); i++) {
				
				//single transactionHistoryEntry
				Node nTransactionHistoryEntry = nTransactionHistoryEntries.item(i);
				
				//parsing and story from a individual transactionhistoryentry
				TransactionHistoryEntry transactionHistoryEntry = new TransactionHistoryEntry();
				Amount fromAmount = new Amount();
				Amount fromAvailableBalance = new Amount();
				Amount fromTotalBalance = new Amount();
				Amount fromCommitedBalance = new Amount();
				Amount originalAmount = new Amount();
				Amount amount = new Amount();
				Amount toAmount = new Amount();
				
				if(nTransactionHistoryEntry.getNodeType() == Node.ELEMENT_NODE) {
					
					Element element = (Element) nTransactionHistoryEntry;
					
					if(element.getElementsByTagName("financialtransactionid").getLength() != 0) {
						transactionHistoryEntry.setFinancialTransactionId((String)element.getElementsByTagName("financialtransactionid").item(0).getTextContent());
					}
					if(element.getElementsByTagName("transactionstatus").getLength() != 0) {
						transactionHistoryEntry.setTransactionStatus((String)element.getElementsByTagName("transactionstatus").item(0).getTextContent());
					}
					if(element.getElementsByTagName("transfertype").getLength() != 0) {
						transactionHistoryEntry.setTransferType((String)element.getElementsByTagName("transfertype").item(0).getTextContent());
					}
					if(element.getElementsByTagName("startdate").getLength() != 0) {
						transactionHistoryEntry.setStartDate((String)element.getElementsByTagName("startdate").item(0).getTextContent());
					}
					if(element.getElementsByTagName("commitdate").getLength() != 0) {
						transactionHistoryEntry.setCommitDate((String)element.getElementsByTagName("commitdate").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fxrate").getLength() != 0) {
						transactionHistoryEntry.setFxRate(Integer.parseInt((String)element.getElementsByTagName("fxrate").item(0).getTextContent()));
					}
					if(element.getElementsByTagName("initiatinguser").getLength() != 0) {
						transactionHistoryEntry.setInitiateUser((String)element.getElementsByTagName("initiatinguser").item(0).getTextContent());
					}
					if(element.getElementsByTagName("realuser").getLength() != 0) {
						transactionHistoryEntry.setRealUser((String)element.getElementsByTagName("realuser").item(0).getTextContent());
					}
					if(element.getElementsByTagName("initiatingaccountholder").getLength() != 0) {
						transactionHistoryEntry.setInitiatingAccountHolder((String)element.getElementsByTagName("initiatingaccountholder").item(0).getTextContent());
					}
					if(element.getElementsByTagName("realaccountholder").getLength() != 0) {
						transactionHistoryEntry.setRealAccountHolder((String)element.getElementsByTagName("realaccountholder").item(0).getTextContent());
					}
					if(element.getElementsByTagName("from").getLength() != 0) {
						transactionHistoryEntry.setFrom((String)element.getElementsByTagName("from").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromaccount").getLength() != 0) {
						transactionHistoryEntry.setFromAccount((String)element.getElementsByTagName("fromaccount").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromaccountholder").getLength() != 0) {
						transactionHistoryEntry.setFromAccountHolder((String)element.getElementsByTagName("fromaccountholder").item(0).getTextContent());
					}
					if(element.getElementsByTagName("to").getLength() != 0) {
						transactionHistoryEntry.setTo((String)element.getElementsByTagName("to").item(0).getTextContent());
					}
					if(element.getElementsByTagName("toaccount").getLength() != 0) {
						transactionHistoryEntry.setToAccount((String)element.getElementsByTagName("toaccount").item(0).getTextContent());
					}
					if(element.getElementsByTagName("maininstructionid").getLength() != 0) {
						transactionHistoryEntry.setMainInstructionId((String)element.getElementsByTagName("maininstructionid").item(0).getTextContent());
					}
					if(element.getElementsByTagName("instructionid").getLength() != 0) {
						transactionHistoryEntry.setInstructionId((String)element.getElementsByTagName("instructionid").item(0).getTextContent());
					}
					if(element.getElementsByTagName("externaltransactionid").getLength()!=0) {
						transactionHistoryEntry.setExternalTransactionId((String)element.getElementsByTagName("externaltransactionid").item(0).getTextContent());
					}
					if(element.getElementsByTagName("toaccountholder").getLength() != 0) {
						transactionHistoryEntry.setToAccountHolder((String)element.getElementsByTagName("toaccountholder").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromfirstname").getLength() != 0) {
						transactionHistoryEntry.setFromFirstName((String)element.getElementsByTagName("fromfirstname").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromlastname").getLength() != 0) {
						transactionHistoryEntry.setFromLastName((String)element.getElementsByTagName("fromlastname").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromhandlerfirstname").getLength() != 0) {
						transactionHistoryEntry.setFromHandlerFirstName((String)element.getElementsByTagName("fromhandlerfirstname").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromhandlerlastname").getLength() != 0) {
						transactionHistoryEntry.setFromHandlerLastName((String)element.getElementsByTagName("fromhandlerlastname").item(0).getTextContent());
					}
					if(element.getElementsByTagName("communicationchannel").getLength() != 0) {
						transactionHistoryEntry.setCommunicationChannel((String)element.getElementsByTagName("communicationchannel").item(0).getTextContent());
					}
					if(element.getElementsByTagName("fromavailablebalance").getLength() != 0) {
						Element eFromAvailableBalance = (Element)element.getElementsByTagName("fromavailablebalance").item(0);
						fromAvailableBalance.setAmount(Double.parseDouble((String) eFromAvailableBalance.getElementsByTagName("amount").item(0).getTextContent()));
						fromAvailableBalance.setCurrency((String) eFromAvailableBalance.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setFromAvailableBalance(fromAvailableBalance);
					}
					if(element.getElementsByTagName("fromamount").getLength() != 0) {
						Element eFromAmount = (Element)element.getElementsByTagName("fromamount").item(0);
						fromAmount.setAmount(Double.parseDouble((String) eFromAmount.getElementsByTagName("amount").item(0).getTextContent()));
						fromAmount.setCurrency((String) eFromAmount.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setFromAmount(fromAmount);
					}
					if(element.getElementsByTagName("fromavailablebalance").getLength() != 0) {
						Element eFromTotalBalance = (Element)element.getElementsByTagName("fromavailablebalance").item(0);
						fromTotalBalance.setAmount(Double.parseDouble((String) eFromTotalBalance.getElementsByTagName("amount").item(0).getTextContent()));
						fromTotalBalance.setCurrency((String) eFromTotalBalance.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setFromTotalBalance(fromTotalBalance);
					}
					if(element.getElementsByTagName("fromcommittedbalance").getLength() != 0) {
						Element efromCommitedBalance = (Element)element.getElementsByTagName("fromcommittedbalance").item(0);
						fromCommitedBalance.setAmount(Double.parseDouble((String) efromCommitedBalance.getElementsByTagName("amount").item(0).getTextContent()));
						fromCommitedBalance.setCurrency((String) efromCommitedBalance.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setFromCommitedBalance(fromCommitedBalance);
					}
					if(element.getElementsByTagName("originalamount").getLength() != 0) {
						Element eOriginalAmount = (Element)element.getElementsByTagName("originalamount").item(0);
						originalAmount.setAmount(Double.parseDouble((String) eOriginalAmount.getElementsByTagName("amount").item(0).getTextContent()));
						originalAmount.setCurrency((String) eOriginalAmount.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setOriginalAmount(originalAmount);
					}
					if(element.getElementsByTagName("toamount").getLength() != 0) {
						Element eToAmount = (Element)element.getElementsByTagName("toamount").item(0);
						toAmount.setAmount(Double.parseDouble((String) eToAmount.getElementsByTagName("amount").item(0).getTextContent()));
						toAmount.setCurrency((String) eToAmount.getElementsByTagName("currency").item(0).getTextContent());
						transactionHistoryEntry.setToAmount(toAmount);
					}
					transactionHistoryEntriesList.add(transactionHistoryEntry);
				}
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// storing the transaction entry list into TransactionHistoryEntries object
		TransactionHistoryEntries transactionHistoryEntries = new TransactionHistoryEntries();
		transactionHistoryEntries.setTransactionHistoryEntry(transactionHistoryEntriesList);
		
		//storing TransactionHistoryEntries object into TransactionHistoryResponse
		TransactionHistoryResponse transactionHistoryResponse = new TransactionHistoryResponse();
		transactionHistoryResponse.setTransactionHistoryEntries(transactionHistoryEntries);
		this.setTransactionHistoryResponse(transactionHistoryResponse);
	}
	
}
