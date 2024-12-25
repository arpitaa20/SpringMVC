package jsp.SpringMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ShopInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ShopConfg.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
