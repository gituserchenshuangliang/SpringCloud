package cls.com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cls.com.service.ProviderService;

@RestController
public class ConsumerControl {
	@Value("${server.port}")
	private String port;
	@Autowired
	ProviderService p;
	
	@RequestMapping("consumer")
	public String consumer(String msg){
		return p.provider(msg);
	}
	
	@RequestMapping("port")
	public String port(){
		port = "8804";
		return port;
	}
	
	@RequestMapping("hello")
	public String hello(){
		System.out.println("-------");
		return "hello world !";
	}
}
