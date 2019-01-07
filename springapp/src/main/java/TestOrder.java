import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.service.ProductService;
import com.mtc.app.vo.Order;

public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		
		ProductService productService = applicationContext.getBean(ProductService.class);

		productService.processOrder(new Order(2342,102,15));
		
		productService.printProducts();
		
		productService.printOrders();
		
	}

}
