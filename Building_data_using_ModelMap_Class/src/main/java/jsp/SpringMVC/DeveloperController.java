package jsp.SpringMVC;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeveloperController {
	@GetMapping("/developer")
	public String showDetails(ModelMap m) {
		m.put("AppVersion", "WhatsApp 1.0.0");
		m.put("DeveloperName", "Arpita");
		Map<String , Double> m2 = new LinkedHashMap<String, Double>();
		m2.put("memory", 1.8);
		m2.put("RAM", 8.0);
		m.addAllAttributes(m2);
		return "developer.jsp";
		
	}

}
