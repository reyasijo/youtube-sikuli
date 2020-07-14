import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class YoutubeVideoTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/reya/Documents/Selenium/Drivers/chromedriver 4");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=jENjATC1ch0"); 
		//Thread.sleep(10000);
		//Create object for screen class
		System.out.println("line1....");
		Screen s=new Screen();
		System.out.println("line2....");
		Pattern pause=new Pattern("Youtube_pause.png");
		s.wait(pause,5000);
		s.click();
		s.click();
		System.out.println("Paused.....");
		
		/*Pattern play=new Pattern("/Users/reya/Documents/selenium2019/workspace/Youtube_Sikuli/Youtube_play.png");
		s.wait(play,5000);
		s.click();
		System.out.println("Playing again.....");*/
	}

}
