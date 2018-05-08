package mango.demo.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mango.demo.service.DemoService;

/**
 * @author Ricky Fung
 */
public class BenchmarkTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:mango-client.xml");

		DemoService service = (DemoService) ctx.getBean("demoService");

		service.hello("rpc");
		System.out.println("echo:" + service.echo("rpc"));

		List<String> hobbies = new ArrayList<>();
		hobbies.add("NBA");
		hobbies.add("Reading");
		Map<String, String> map = service.introduce("hh", hobbies);
		System.out.println("map:" + map);
	}
}
