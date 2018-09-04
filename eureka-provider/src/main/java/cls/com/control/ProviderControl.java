package cls.com.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderControl {
	@RequestMapping("provider")
	public String provider(String msg){
		return msg;
	}
}
