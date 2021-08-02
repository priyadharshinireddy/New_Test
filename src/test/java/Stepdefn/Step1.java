package Stepdefn;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Step1 {
		
		WebDriver d1;

		
		@Given("Open chrome and url of the application")
		public void open_chrome_and_url_of_the_application() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			d1=new ChromeDriver();
			d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&prevRID=TEEX3JEPBY2174BC4GDH&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");	
			
		}
			
			@When("Enter Username and password")
			public void enter_username_and_password() {
				d1.findElement(By.id("ap_customer_name")).sendKeys("user_name");
		        d1.findElement(By.id("ap_password")).sendKeys("password");
		        
		        d1.findElement(By.id("continue")).click();
			}
		        @Then("Login to account")
		        public void login_to_account() {
		           
		        }

				
			    
			
		}
		


