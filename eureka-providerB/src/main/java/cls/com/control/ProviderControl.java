package cls.com.control;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderControl {
	@RequestMapping("provider")
	public String provider(String msg){
		return msg;
	}
	
	@RequestMapping("show")
	public HashMap<String, String> showMap(){
		HashMap<String, String> map = new HashMap<String, String>(10);
		map.put("name", "Marry");
		map.put("age", "24");
		map.put("hobby", "music");
		return map;
	}
}
