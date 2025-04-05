package tr.com.soap.example.soapuserservice.model;

import java.util.List;

public class GetAllUsersResult {

    private String resultCode;   // Sonuç kodu
    private String resultMessage; // Sonuç mesajı
    private List<User> users;    // Kullanıcılar listesi

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
