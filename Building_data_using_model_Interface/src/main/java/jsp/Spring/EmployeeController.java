package jsp.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	@GetMapping("/employee")
	public String showdetails(Model model) {
		model.addAttribute("MyName", "Arpita");
		model.addAttribute("MyAge", "22");
		return "employee.jsp";
	}
}
