package jsp.Spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EmployeeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return  new Class[] {EmployeeConfg.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
