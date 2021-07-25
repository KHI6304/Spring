package testPjt001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk tw = ctx.getBean("tWalk", TransportationWalk.class);
		tw.move();
		
		ctx.close();
	}
}