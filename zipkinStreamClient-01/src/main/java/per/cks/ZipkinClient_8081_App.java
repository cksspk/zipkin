package per.cks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ZipkinClient_8081_App {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClient_8081_App.class,args);
    }
    
    
    @RequestMapping("/hi")
    @ResponseBody
    public String getMsg() {
    	return "123 this is client 8081";
    }
    
    
    
    
}
