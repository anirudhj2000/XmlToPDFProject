package projectB;

import com.google.gson.Gson;

public class ToJSON {

	private TransactionHistoryResponse transactionHistoryResponse;

	public ToJSON(TransactionHistoryResponse transactionHistoryResponse) {
		super();
		this.transactionHistoryResponse = transactionHistoryResponse;
	}
	
	public String getJSONObject() {
		
		String JsonString = new Gson().toJson(this.transactionHistoryResponse);
		return JsonString;
		
	}
}
