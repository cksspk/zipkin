package per.cks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class ZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
    }
    
    
    @Bean
    public RestTemplate getRest() {
    	return new RestTemplate();
    }
    
    @RequestMapping("/hi")
    @ResponseBody
    public String getMsg() {
    	return "123 this is client 8082";
    }
    
    
    
    @Autowired
    RestTemplate restT;
    
    @RequestMapping("router")
    @ResponseBody
    public String router() {
    	String str = restT.getForObject("http://localhost:8081/hi", String.class);
    	System.err.println("访问其他服务");
    	return "访问 8081 返回"+str;
    }
}
