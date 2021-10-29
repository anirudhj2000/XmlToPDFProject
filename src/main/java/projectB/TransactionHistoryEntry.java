package projectB;
//
//import java.util.Date;


public class TransactionHistoryEntry {
	private String financialTransactionId;
	private String transactionStatus;
	private String transferType;
	private String startDate;
	private String commitDate;
	private int fxRate;
	private String initiateUser;
	private String realUser;
	private String initiatingAccountHolder;
	private String realAccountHolder;
	private String from;
	private String fromAccount;
	private String fromAccountHolder;
	private String to;
	private String toAccount;
	private String mainInstructionId;
	private String instructionId;
	private String externalTransactionId;
	private String toAccountHolder;
	private String fromFirstName;
	private String fromLastName;
	private String fromHandlerFirstName;
	private String fromHandlerLastName;
	private String communicationChannel;
	private String fitype;
	private Amount fromAmount;
	private Amount fromAvailableBalance;
	private Amount fromTotalBalance;
	private Amount fromCommitedBalance;
	private Amount originalAmount;
	private Amount amount;
	private Amount toAmount;
	
	public TransactionHistoryEntry() {
		super();
	}
	public String getFinancialTransactionId() {
		return financialTransactionId;
	}
	public void setFinancialTransactionId(String financialTransactionId) {
		this.financialTransactionId = financialTransactionId;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCommitDate() {
		return commitDate;
	}
	public void setCommitDate(String commitDate) {
		this.commitDate = commitDate;
	}
	public int getFxRate() {
		return fxRate;
	}
	public void setFxRate(int fxRate) {
		this.fxRate = fxRate;
	}
	public String getInitiateUser() {
		return initiateUser;
	}
	public void setInitiateUser(String initiateUser) {
		this.initiateUser = initiateUser;
	}
	public String getRealUser() {
		return realUser;
	}
	public void setRealUser(String realUser) {
		this.realUser = realUser;
	}
	public String getInitiatingAccountHolder() {
		return initiatingAccountHolder;
	}
	public void setInitiatingAccountHolder(String initiatingAccountHolder) {
		this.initiatingAccountHolder = initiatingAccountHolder;
	}
	public String getRealAccountHolder() {
		return realAccountHolder;
	}
	public void setRealAccountHolder(String realAccountHolder) {
		this.realAccountHolder = realAccountHolder;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getFromAccountHolder() {
		return fromAccountHolder;
	}
	public void setFromAccountHolder(String fromAccountHolder) {
		this.fromAccountHolder = fromAccountHolder;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getMainInstructionId() {
		return mainInstructionId;
	}
	public void setMainInstructionId(String mainInstructionId) {
		this.mainInstructionId = mainInstructionId;
	}
	public String getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}
	public String getExternalTransactionId() {
		return externalTransactionId;
	}
	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}
	public String getToAccountHolder() {
		return toAccountHolder;
	}
	public void setToAccountHolder(String toAccountHolder) {
		this.toAccountHolder = toAccountHolder;
	}
	public String getFromFirstName() {
		return fromFirstName;
	}
	public void setFromFirstName(String fromFirstName) {
		this.fromFirstName = fromFirstName;
	}
	public String getFromLastName() {
		return fromLastName;
	}
	public void setFromLastName(String fromLastName) {
		this.fromLastName = fromLastName;
	}
	public String getFromHandlerFirstName() {
		return fromHandlerFirstName;
	}
	public void setFromHandlerFirstName(String fromHandlerFirstName) {
		this.fromHandlerFirstName = fromHandlerFirstName;
	}
	public String getFromHandlerLastName() {
		return fromHandlerLastName;
	}
	public void setFromHandlerLastName(String fromHandlerLastName) {
		this.fromHandlerLastName = fromHandlerLastName;
	}
	public String getCommunicationChannel() {
		return communicationChannel;
	}
	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	public String getFitype() {
		return fitype;
	}
	public void setFitype(String fitype) {
		this.fitype = fitype;
	}
	public Amount getFromAmount() {
		return fromAmount;
	}
	public void setFromAmount(Amount fromAmount) {
		this.fromAmount = fromAmount;
	}
	public Amount getFromAvailableBalance() {
		return fromAvailableBalance;
	}
	public void setFromAvailableBalance(Amount fromAvailableBalance) {
		this.fromAvailableBalance = fromAvailableBalance;
	}
	public Amount getFromTotalBalance() {
		return fromTotalBalance;
	}
	public void setFromTotalBalance(Amount fromTotalBalance) {
		this.fromTotalBalance = fromTotalBalance;
	}
	public Amount getFromCommitedBalance() {
		return fromCommitedBalance;
	}
	public void setFromCommitedBalance(Amount fromCommitedBalance) {
		this.fromCommitedBalance = fromCommitedBalance;
	}
	public Amount getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(Amount originalAmount) {
		this.originalAmount = originalAmount;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Amount getToAmount() {
		return toAmount;
	}
	public void setToAmount(Amount toAmount) {
		this.toAmount = toAmount;
	}
	
	
}
