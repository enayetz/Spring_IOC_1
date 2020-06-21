package com.nt.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String arg[]) {

		// two types of Spring container: i) beanfactory ii) applicationcontext
		
		// 1. using 'beanfactory' Spring container
		Resource resource = new FileSystemResource("src/main/resources/appContext1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		WishGenerator generator = (WishGenerator) factory.getBean("w");
		generator.generateMsg("Enayet");

		// 2. using 'applicationcontext' Spring container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/appContext1.xml");
		WishGenerator wishObj = (WishGenerator) ctx.getBean("w");
		wishObj.generateMsg("Reza");

		// 3. Employee class value set in xml file.
		Resource rsc = new FileSystemResource("src/main/resources/appContext2.xml");
		BeanFactory fac = new XmlBeanFactory(rsc);
		Employee empObj = (Employee) fac.getBean("emp");
		System.out.println(empObj.getId() + " " + empObj.getName() + " " + empObj.getSal());

		// 4. Address inside Employee
		System.out.println(empObj.getAdr().getCity() + " " + empObj.getAdr().getState());

	}

}
