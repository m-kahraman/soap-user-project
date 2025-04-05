package tr.com.soap.example.soapuserservice.service;

import tr.com.soap.example.soapuserservice.model.AddUserResult;
import tr.com.soap.example.soapuserservice.model.GetAllUsersResult;
import tr.com.soap.example.soapuserservice.model.SayHelloResult;

public interface UserService {
	public AddUserResult addUser(String name, String surname);
	public GetAllUsersResult getAllUsers();
	
	public SayHelloResult sayHello(String name);

}
