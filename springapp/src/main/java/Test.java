import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.SampleService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		
		SampleService sampleService = applicationContext.getBean(SampleService.class);
		
		System.out.println(sampleService.greet());

	}

}
