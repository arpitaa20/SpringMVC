package jsp.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String sayhiiii() {
		return "student.jsp";
	}

}
