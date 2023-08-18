package SampleSpringApp.Deviceapp;

/**
 * Hello world!
 * 
 *
 */
import com.mybean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
        Technician t1=context.getBean(Technician.class,"technician1");
        System.out.println(t1);
        Device d1=context.getBean(Device.class,"device1");
        System.out.println(d1);
        Location l1=context.getBean(Location.class,"location1");
        System.out.println(l1);
        
        
    }
}
