package ngtest_xitongxuexi.datadriver.xml;

import java.util.Map;

import org.testng.annotations.Test;

public class TestDataProvider extends TestData {
	@Test(dataProvider="providerMethod")
	public void testmethod1(Map<?,?> param){
		System.out.println("method1 received input:"+param.get("input"));
		System.out.println("method1 received button:"+param.get("button"));
	}
	@Test(dataProvider="providerMethod")
	public void testmethod2(Map<?,?> param){
		System.out.println("method2 received input:"+param.get("input"));
		System.out.println("method2 received button:"+param.get("button"));
	}
	@Test(dataProvider="providerMethod")
	public void testmethod3(Map<?,?> param){
		System.out.println("method3 received input:"+param.get("input"));
		System.out.println("method3 received button:"+param.get("button"));
	}
	@Test(dataProvider="providerMethod")
	public void testmethod4(Map<?,?> param){
		System.out.println("method4 received input:"+param.get("input"));
		System.out.println("method4 received button:"+param.get("button"));
	}
}
