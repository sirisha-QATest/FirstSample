package siriSeconMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExampleTest {
	
	@Test(dataProvider="getdata")
	public  void dpExp(String t1, String t2)
	
	{
		
		System.out.println(t1);
		System.out.println(t2);
		
		

	}
	
	@DataProvider
	public Object[][] getdata()
	
	{
		
		Object[][] data= new Object[3][2];
		
		data[0][0]= "first User";
		data[0][1]="first Password";
		
	    data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;

}}
