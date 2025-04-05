package tr.com.soap.example.soapuserservice.model;

public class AddUserResult {

    private String resultCode;   // Sonuç kodu
	
    private String resultMessage; // Sonuç mesajı
    

    public AddUserResult() {
	}

	// Getter ve Setter metodları
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
