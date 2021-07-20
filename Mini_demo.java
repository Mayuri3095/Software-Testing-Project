import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_demo 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver w= new FirefoxDriver();
		
	
		w.get("http://demo.guru99.com/test/newtours/index.php\r\n");
		//scroll
		Thread.sleep(1000);
		  JavascriptExecutor js = (JavascriptExecutor) w;
		  js.executeScript("window.scrollBy(0,2000)");

		  w.manage().window().maximize();
		// register
		w.findElement(By.linkText("REGISTER")).click();
		w.findElement(By.name("firstName")).sendKeys("Mayuri");
		w.findElement(By.name("lastName")).sendKeys("Patil");
		w.findElement(By.name("phone")).sendKeys("8655762999");
		w.findElement(By.name("userName")).sendKeys("mp@gmail.com");
		w.findElement(By.name("address1")).sendKeys("Takka");
		w.findElement(By.name("city")).sendKeys("Panvel");
		w.findElement(By.name("state")).sendKeys("Maharashtra");
		w.findElement(By.name("postalCode")).sendKeys("410000");
    	Select s=new Select(w.findElement(By.name("country")));
    	s.selectByValue("INDIA");
		w.findElement(By.name("email")).sendKeys("mp@gmail.com");
		w.findElement(By.name("password")).sendKeys("12345");
		w.findElement(By.name("confirmPassword")).sendKeys("12345");
		w.findElement(By.name("submit")).click();
		System.out.println(w.getTitle());


		w.findElement(By.linkText("sign-in")).click();
		w.findElement(By.name("userName")).sendKeys("mp@gmail.com");
		w.findElement(By.name("password")).sendKeys("12345");
		w.findElement(By.name("submit")).click();
		System.out.println(w.findElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText());
		
		
		w.findElement(By.linkText("SIGN-OFF")).click();
		//w.get("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");
		System.out.println("Login page done");

        w.findElement(By.name("userName")).sendKeys("123");
		w.findElement(By.name("password")).sendKeys("123");
		w.findElement(By.name("submit")).click();
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		w.navigate().back();
		System.out.println("Login Successfully");

		//flight
        w.findElement(By.linkText("Flights")).click();		
		w.findElement(By.name("tripType")).click();
		Select s1=new Select(w.findElement(By.name("passCount")));
    	s1.selectByValue("1");
    	Select p=new Select(w.findElement(By.name("fromPort")));
    	p.selectByValue("New York");
    	Select p1=new Select(w.findElement(By.name("fromMonth")));
    	p1.selectByValue("6");
    	Select p2=new Select(w.findElement(By.name("fromDay")));
    	p2.selectByValue("15");
    	Select p3=new Select(w.findElement(By.name("toPort")));
    	p3.selectByValue("Paris");
    	Select p4=new Select(w.findElement(By.name("toMonth")));
    	p4.selectByValue("7");
    	Select p5=new Select(w.findElement(By.name("toDay")));
    	p5.selectByValue("20");
    	
    	w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
    	
    	Select p6=new Select(w.findElement(By.name("airline")));
    	p6.selectByVisibleText("Unified Airlines");
    	
    	w.findElement(By.name("findFlights")).click();
    	w.navigate().to("http://demo.guru99.com/test/newtours/index.php\r\n");
    	Thread.sleep(2000);
    	System.out.println("Flight booking done");
    	
     	
       	//Car Rentals
       	w.findElement(By.linkText("Car Rentals")).click();
    	System.out.println("Car rentals");
    	w.navigate().back();
    		
    	//Cruises	
    	w.findElement(By.linkText("Cruises")).click();
    	System.out.println("cruises");
    	w.navigate().back();
    		
    	//Destinations	
    	w.findElement(By.linkText("Destinations")).click();
    	System.out.println("Destinations");
    	w.navigate().back();
    		
    	//Vacations	
    	w.findElement(By.linkText("Vacations")).click();
    	System.out.println("Vacations");
    	w.navigate().back();
    	
		//Selenium
    	w.findElement(By.linkText("Selenium")).click();	
    	w.findElement(By.linkText("Yahoo")).click();
		System.out.println(w.getTitle());
    	System.out.println("selenium");
    	w.navigate().back();
    	
    	//Radio & Checkbox Demo
    	w.findElement(By.linkText("Selenium")).click();	
    	w.findElement(By.linkText("Radio & Checkbox Demo")).click();
    	w.findElement(By.id("vfb-7-2")).click();
    	w.findElement(By.id("vfb-6-2")).click();
		System.out.println(w.getTitle());
    	Thread.sleep(2000);
    	System.out.println("Radio & Checkbox Demo");
    	w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
    	
    	//Table Demo
    	w.findElement(By.linkText("Table Demo")).click();
    	w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).click();
		System.out.println(w.getTitle());
    	System.out.println("Table Demo");
    	//Table function is not working
    	
    	//Accessing Link
    	w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
    	//List of tags
    	List<WebElement> L=w.findElements(By.tagName("a"));
		System.out.println("the total tagnames are " +L.size());
		List<WebElement> M=w.findElements(By.tagName("input"));
		System.out.println("the tolat input tags " +M.size());
    	w.findElement(By.linkText("Accessing Link")).click();
    	w.findElement(By.linkText("click here")).click();
		System.out.println(w.getTitle());
    	System.out.println("Accessing Link");
    	w.navigate().back();
		
		//Delete Customer Form
    	w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
    	w.findElement(By.linkText("Delete Customer Form")).click();
    	w.findElement(By.name("cusid")).sendKeys("  ");
		System.out.println(w.getTitle());
    	w.findElement(By.name("submit")).click();
    	Thread.sleep(2000);
    	Alert a1 = w.switchTo().alert();
    	System.out.println(a1.getText());
    	a1.accept();
    		//a1.dismiss();
    	Thread.sleep(2000);
    	Alert a2 = w.switchTo().alert();
    	System.out.println(a2.getText());
    	a2.accept();
    	System.out.println("Delete Customer Form");
    	// Blank deleted successfully is defect
    	
    	w.navigate().back();
    	//Insurance Project
    	w.findElement(By.linkText("Insurance Project")).click();
		System.out.println(w.getTitle());
    	w.findElement(By.id("email")).sendKeys("  ");
    	w.findElement(By.id("password")).sendKeys("  ");
    	w.findElement(By.name("submit")).click();
    	System.out.println("Insurance Project");
    	//Blank data accepted and Login Successfully
    	 
    	 
    	//Agile Project
    	w.findElement(By.linkText("Agile Project")).click();
    	w.findElement(By.name("uid")).sendKeys("1303");
    	w.findElement(By.name("password")).sendKeys("Guru99");
		System.out.println(w.getTitle());
    	w.findElement(By.name("btnLogin")).click();
    	Thread.sleep(2000);
    	w.findElement(By.linkText("Log out")).click();
    	Alert a3 = w.switchTo().alert();
    	System.out.println(a3.getText());
    	a3.accept();
    	System.out.println("Agile Project");
    	w.navigate().back();
    	
    	
    	
    	//Security Project
		w.findElement(By.linkText("Security Project")).click();
		w.findElement(By.name("uid")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		System.out.println(w.getTitle());
		w.findElement(By.name("btnLogin")).click();
		System.out.println("Security Project");
		Alert a4 = w.switchTo().alert();
    	System.out.println(a4.getText());
    	a4.accept();
    	w.navigate().back();
    	
    	//Telecom Project
    	w.findElement(By.linkText("Telecom Project")).click();
    	w.findElement(By.linkText("Add Customer")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/form[1]/div[1]/div[2]/label[1]")).click();
    	w.findElement(By.id("fname")).sendKeys("Mayuri");
    	w.findElement(By.id("lname")).sendKeys("P");
    	w.findElement(By.id("email")).sendKeys("mpatil@com.go");
    	w.findElement(By.name("addr")).sendKeys("Panvel 410206");
    	w.findElement(By.id("telephoneno")).sendKeys("123456");
    	Thread.sleep(2000);
    	w.findElement(By.name("submit")).click();
		System.out.println(w.getTitle());
    	// Accepting invalid mobile number.
    	w.navigate().back();
    	
    	//Payment Gateway Project
    	w.findElement(By.linkText("Payment Gateway Project")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]")).click();
    	w.findElement(By.id("card_nmuber")).sendKeys("1254546468465213");
    	Select m =new Select(w.findElement(By.name("month")));
    	m.selectByValue("3");
    	Select Y=new Select(w.findElement(By.name("year")));
    	Y.selectByValue("2017");
    	//Accepting Invalid card year(Expired card details)
    	w.findElement(By.id("cvv_code")).sendKeys("025");
		System.out.println(w.getTitle());
		Thread.sleep(2000);
    	w.findElement(By.name("submit")).click();
    	System.out.println("Order has been placed");
    	
    	//Bank Project
    	w.findElement(By.linkText("Bank Project")).click();
    	w.findElement(By.name("uid")).sendKeys("mngr341826");
		w.findElement(By.name("password")).sendKeys("atEdAge");
		w.findElement(By.name("btnLogin")).click();
		System.out.println(w.getTitle());
		w.findElement(By.linkText("Log out")).click();
		System.out.println("Bank Project");
		Thread.sleep(2000);
		w.navigate().back();
		w.navigate().back();

	}

}
