package pack2;

import org.testng.annotations.Test;

public class contactTest {
	
	@Test
	public void createcontactTest()

	{
		String br = System.getProperty("browser");
		String ur=System.getProperty("url");
		String un=System.getProperty("username");
		String pas=System.getProperty("password");
		System.out.println(ur);
		System.out.println(un);
		System.out.println(br);	
		System.out.println(pas);
		}
	@Test
	public void modifycontact()
	{
		System.out.println("modify");
	}
}
