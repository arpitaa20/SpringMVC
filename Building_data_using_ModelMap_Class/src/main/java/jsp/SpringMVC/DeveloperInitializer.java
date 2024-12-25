package jsp.SpringMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DeveloperInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {DeveloperConfg.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
