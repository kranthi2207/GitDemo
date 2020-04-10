package MasterGroup;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void Nativeandroid() {
System.out.println("Nativeandroid");	
}
	
	@Test(groups = "smoke")
	public void iOSApps() {
		
		System.out.println("iOSApps");
		
	}

}
