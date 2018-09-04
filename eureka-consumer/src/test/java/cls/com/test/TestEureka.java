package cls.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestEureka {
	@Autowired
	RestTemplate restTemplate;
	@Test
	public void show (){
		String msg = restTemplate.getForObject("http://eureka-provider/provider?msg={1}", String.class,"Hello world !");;
		System.out.println(msg);
	}
}
