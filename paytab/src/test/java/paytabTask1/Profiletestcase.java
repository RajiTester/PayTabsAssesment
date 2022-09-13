package paytabTask1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Profiletestcase {
	WebDriver driver;


	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\OLD_SETUP_SEL&JAVA\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);

	}

	@Test
	public void login() throws InterruptedException, AWTException
	{

		PageFactory.initElements(driver, LogintestObject.class);
		LogintestObject.txtUsername.sendKeys("Admin");
		LogintestObject.txtPassword.sendKeys("admin123");
		LogintestObject.btnLogin.click();

		LogintestObject.adminMenuList.click();
		LogintestObject.addUserbtn.click();
		LogintestObject.useroledrpdwn.click();
		Thread.sleep(5000);
		LogintestObject.essrole.click();
		Thread.sleep(5000);
		LogintestObject.statusdrpdwn.click();
		Thread.sleep(5000);
		LogintestObject.enablestatus.click();
		LogintestObject.usrnme.sendKeys("rajeso");
		Thread.sleep(3000);
		LogintestObject.psdwd.sendKeys("Rajesh@123");
		LogintestObject.confrmpsdwd.sendKeys("Rajesh@123");
		Thread.sleep(3000);
		LogintestObject.emplyename.sendKeys("mo");
		Thread.sleep(2000);
		LogintestObject.empyhintlists.click();
		LogintestObject.savebtn.click();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		LogintestObject.myInfoBtn.click();
		Thread.sleep(3000);
		LogintestObject.firstname.sendKeys(Keys.CONTROL,"A");
		LogintestObject.firstname.sendKeys("raj");
		LogintestObject.middlename.sendKeys(Keys.CONTROL,"A");
		LogintestObject.middlename.sendKeys("kumar");
		LogintestObject.lastname.sendKeys(Keys.CONTROL,"A");
		LogintestObject.lastname.sendKeys("raj");
		LogintestObject.emplyID.sendKeys(Keys.CONTROL,"A");
		LogintestObject.emplyID.sendKeys("sind34");

		LogintestObject.drivinglic.sendKeys(Keys.CONTROL,"A");
		LogintestObject.drivinglic.sendKeys("25324546df");
		LogintestObject.licexpiredate.sendKeys(Keys.CONTROL,"A");
		LogintestObject.licexpiredate.sendKeys("2033-06-01");


		LogintestObject.ssntxtbox.sendKeys(Keys.CONTROL,"A");
		LogintestObject.ssntxtbox.sendKeys("sd34");
		LogintestObject.sintxtbox.sendKeys(Keys.CONTROL,"A");
		LogintestObject.sintxtbox.sendKeys("sind34");
		LogintestObject.nationality.sendKeys(Keys.CONTROL,"A");
		LogintestObject.nationality.sendKeys("Indian");

		LogintestObject.dob.sendKeys(Keys.CONTROL,"A");
		LogintestObject.dob.sendKeys("1993-06-01");

		LogintestObject.bloodgroup.click();
		Thread.sleep(2000);
		LogintestObject.grpblood.click();

		LogintestObject.cussavebtn.click();
		Thread.sleep(5000);
		LogintestObject.addatchmnt.click();
		LogintestObject.browsebtn.click();
		Thread.sleep(5000);

		String file="C:\\Users\\rajeshraji\\Desktop\\RAJESH KUMAR-QA";

		StringSelection selectionfile=new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectionfile, null);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 10); WebElement element1 =
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("essrole")));
		 * element1.click();
		 */
		LogintestObject.finalsavebtn.click();

	}

	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}


}
