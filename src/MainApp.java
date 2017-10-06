import javax.naming.Context;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean_definition_inheritance.HelloBangladesh;
import bean_definition_inheritance.HelloWorld;
import inner_bean.SpellChecker;
import inner_bean.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*
		 * HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		 * 
		 * System.out.println(obj.getMessage());
		 * System.out.println(obj.getId());
		 */

		
/*		beanInheritance(context);*/
		
	
		innerRelation(context);
		
		context.registerShutdownHook();
	}
	
	
	private static void beanInheritance(AbstractApplicationContext context){
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("bean_inheritance");
		helloWorld.getMessage1();
		helloWorld.getMessage2();
		

		HelloBangladesh bangladesh=(HelloBangladesh) context.getBean("bean_inheritance_2");
		bangladesh.getMessage1();
		bangladesh.getMessage2();
		bangladesh.getMessage3();
	}
	
	private static void innerRelation(AbstractApplicationContext context){
		TextEditor spellChecker=(TextEditor)context.getBean("inner_class");
		spellChecker.spellCheck();
	}

}