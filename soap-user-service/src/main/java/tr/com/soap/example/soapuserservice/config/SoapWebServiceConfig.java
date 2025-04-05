package tr.com.soap.example.soapuserservice.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

import tr.com.soap.example.soapuserservice.service.UserServiceImpl;

@Configuration
@EnableWs
public class SoapWebServiceConfig {

	@Autowired private Bus bus;
	 
    @Bean
    @Qualifier("userServiceEndpoint")
    public Endpoint userServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new UserServiceImpl());
        endpoint.publish("/UserServiceWs");
        return endpoint;
    }
    
    
}
