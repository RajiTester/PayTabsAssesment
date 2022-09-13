package paytabTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LogintestObject {
	WebDriver driver;
	@FindBy(name = "username")
	public static WebElement txtUsername;
	@FindBy(name = "password")
	public static WebElement txtPassword;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public static WebElement btnLogin;
	@FindBy(xpath =  "//aside/nav/div[2]/ul/li[1]/a/span")
	public static WebElement adminMenuList;
	@FindBy(xpath =  "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public static WebElement addUserbtn;
	@FindBy(xpath =  "//div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")
	public static WebElement useroledrpdwn;
	@FindBy(xpath = "//*[contains(text(),'ESS')]")
	public static WebElement essrole;
	@FindBy(xpath =  "//div[1]/div/div[3]/div/div[2]/div/div/div[2]")
	public static WebElement statusdrpdwn;
	@FindBy(xpath = "//*[contains(text(),'Enabled')]")
	public static WebElement enablestatus;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public static WebElement emplyename;
	@FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/input")
	public static WebElement usrnme;
	@FindBy(xpath = "//form/div[2]/div/div[1]/div/div[2]/input")
	public static WebElement psdwd;
	@FindBy(xpath = "//form/div[2]/div/div[2]/div/div[2]/input")
	public static WebElement confrmpsdwd;
	@FindBy(xpath = "//*[contains(text(),'David  Morris')]")
	public static WebElement empyhintlists;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement savebtn;


	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	public static WebElement myInfoBtn;

	@FindBy(xpath = "//input[@name='firstName']")
	public static WebElement firstname;

	@FindBy(xpath = "//input[@name='middleName']")
	public static WebElement middlename;

	@FindBy(xpath = "//input[@name='lastName']")
	public static WebElement lastname;


	@FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[2]/input")
	public static WebElement emplyID;


	@FindBy(xpath = "//div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
	public static WebElement drivinglic;

	@FindBy(xpath = "//form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
	public static WebElement licexpiredate;



	@FindBy(xpath = "//div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")
	public static WebElement ssntxtbox;
	@FindBy(xpath = "//form/div[2]/div[3]/div[2]/div/div[2]/input")
	public static WebElement sintxtbox;
	@FindBy(xpath = "//form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
	public static WebElement nationality;

	@FindBy(xpath = "//form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
	public static WebElement dob;

	@FindBy(xpath = "//form/div[1]/div/div/div/div[2]/div/div/div[2]")
	public static WebElement bloodgroup;

	@FindBy(xpath = "//*[contains(text(),'B+')]")
	public static WebElement grpblood;


	@FindBy(xpath = "//div/div[2]/div[2]/div/form/div[2]/button")
	public static WebElement cussavebtn;
	@FindBy(xpath = "//div/div/div[2]/div[3]/div[1]/div/button")
	public static WebElement addatchmnt;


	@FindBy(xpath = "//*[contains(text(),'Browse')]")
	public static WebElement browsebtn;



	@FindBy(xpath = "//div/div/div[2]/div[3]/div/form/div[3]/button[2]")
	public static WebElement finalsavebtn;









	/*
	 * @FindBy(xpath = "//div[1]/header/div[1]/div[2]/ul/li/span/i") public static
	 * WebElement profiledrp;
	 * 
	 * @FindBy(xpath = "//*[contains(text(),'LogOut')]") public static WebElement
	 * logOut;
	 */

}
