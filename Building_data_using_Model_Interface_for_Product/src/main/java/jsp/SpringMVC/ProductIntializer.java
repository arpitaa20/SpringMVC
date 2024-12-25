package jsp.SpringMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProductIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ProductConfg.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
