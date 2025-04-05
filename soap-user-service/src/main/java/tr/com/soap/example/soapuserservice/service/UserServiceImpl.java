package tr.com.soap.example.soapuserservice.service;

import tr.com.soap.example.soapuserservice.model.AddUserResult;
import tr.com.soap.example.soapuserservice.model.GetAllUsersResult;
import tr.com.soap.example.soapuserservice.model.SayHelloResult;
import tr.com.soap.example.soapuserservice.model.User;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(targetNamespace = "http://soapuserservice.example.soap.com.tr", name = "UserServiceWs")
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	private List<User> users = new ArrayList<>();
	private Long counter = 1L;

	public UserServiceImpl() {

	}

	@Override
	public AddUserResult addUser(@WebParam(name = "name") @XmlElement(required = true, nillable = false) String name,
			@WebParam(name = "surname") @XmlElement(required = true, nillable = false) String surname) {
		AddUserResult result = new AddUserResult();
		try {
			if(name != null && name.length()>0 && surname != null && surname.length()>0) {
				User user = new User(counter++, name, surname);
				users.add(user);
				
				result.setResultCode("00");
				result.setResultMessage("Success");
				
				logger.info("islem basarili : UserId:" + user.getId());
				
			} else {
				result.setResultCode("99");
				result.setResultMessage("Error.ErrorMessage : "+"name ve surname alanlari bos girilemez");
			}

		} catch (Exception e) {
			result.setResultCode("99");
			result.setResultMessage("Runtime Error");
			logger.error("islem basarisiz.Hata Detayi : ", e);
		}
		return result;
	}

	@Override
	public GetAllUsersResult getAllUsers() {
		GetAllUsersResult result = new GetAllUsersResult();
		result.setResultCode("00");
		result.setResultMessage("Success");
		result.setUsers(users);
		logger.info("listeleme islemi basarili : " + result.getResultCode());
		return result;
	}


	@Override
	public SayHelloResult sayHello(
			@WebParam(name = "name") @XmlElement(required = true, nillable = false) String name) {
		SayHelloResult resp = new SayHelloResult();
		resp.setResultCode("00");
		resp.setResultMessage("Success");
		resp.setResultString("Hello "+ name);
		logger.info("sayHello methodu calisti." + "Hello "+ name);
		return resp;
	}

}
