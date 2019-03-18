package per.cks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Client01Controller {

	
	@RequestMapping("hi")
	@ResponseBody
	public String getMsg() {
		return "client 01";
	}
}
