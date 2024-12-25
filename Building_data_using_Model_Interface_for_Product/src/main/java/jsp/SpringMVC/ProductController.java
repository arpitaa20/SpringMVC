package jsp.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/product")
	public String showProductDetails(Model m) {
		m.addAttribute("productId","101");
		m.addAttribute("productName","mobile");
		m.addAttribute("productPrie","15000");
		return "product.jsp";
	}

}
