
import com.indasil.pyjamastore.domain.Order;
import com.indasil.pyjamastore.spring.ConstructorOrderService;
import com.indasil.pyjamastore.spring.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ady on 1/29/17.
 */
public class TestSpring {

    public static void main(String [] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"/pyjama.xml"});

        OrderService orderService = (OrderService) applicationContext.getBean("orderService");

        orderService.placeOrder(new Order());

        ConstructorOrderService constructorOrderService = (ConstructorOrderService) applicationContext.getBean("constructorOrderService");

        constructorOrderService.placeOrder(new Order());

    }
}
