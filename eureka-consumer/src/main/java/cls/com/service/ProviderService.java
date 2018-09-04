package cls.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProviderService {
	@Autowired
	RestTemplate restTemplate;
	public String provider(String msg){
		return restTemplate.getForObject("http://eureka-provider/provider?msg={1}", String.class,msg);
	}
}
