package pack1;

import org.testng.annotations.Test;

public class orgTest {
	
	@Test
	public void createorgTest()
	{
		System.out.println("create org");
		String br = System.getProperty("browser");
		String ur=System.getProperty("url");
		String un=System.getProperty("username");
		String pas=System.getProperty("password");
		System.out.println(ur);
		System.out.println(un);
		System.out.println(br);	
		System.out.println(pas);
		System.out.println("pas");
	}
	

	@Test
	public void modifyorgTest()
	{
		System.out.println("modifyorgTest org");
	}

	@Test
	public void deleteorgTest()
	{
		System.out.println("deleteorgTest");
	
	}
	


}
