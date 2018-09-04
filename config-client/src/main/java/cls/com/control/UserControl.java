package cls.com.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {
	@Value("${name}")
	String name;

	@Value("${pwd}")
	String pwd;

	@RequestMapping("/getUserName")
	public String getUsername() {
		return "姓名:" + name + ",密码" + pwd;
	}
}
