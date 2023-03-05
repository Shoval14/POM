package Tests;
import PageObject.LoginPage;
import PageObject.SignUpPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class BaseTest {

        static WebDriver driver = null;
        public static ExtentReports extent;
        public static ExtentTest myTests;
        private static String reportFilePath = "C:\\Users\\shova\\OneDrive\\שולחן העבודה\\קורס אוטומציה\\selenium\\BuyMe.html";
        private static String ImagesPath = "C:\\Users\\shova\\OneDrive\\שולחן העבודה\\קורס אוטומציה\\selenium\\ImagesPath";
        static LoginPage loginPage;
        static SignUpPage signUpPage;

        @BeforeClass
        public static void setUp() throws ParserConfigurationException, IOException, SAXException {
                extent = new ExtentReports(reportFilePath);
                myTests = extent.startTest("TestDemo");
                String website = readFromFile("browser");

                if (website.equals("chrome")) {
                        System.setProperty("WebDriver.chrome.driver", "C:/Users/shova/OneDrive/שולחן העבודה/קורס אוטומציה/selenium /chromedriver");
                        driver = new ChromeDriver();
                } else if (website.equals("firefox")) {
                        System.setProperty("WebDriver.firefox.driver", "C://Users//shova//OneDrive//שולחן העבודה//קורס אוטומציה//selenium//geckodriver-v0.32.2-win32");
                        driver = new FirefoxDriver();
                }

                loginPage = new LoginPage(driver);
                signUpPage = new SignUpPage(driver);
        }

        public static String readFromFile(String kayData) throws ParserConfigurationException, IOException, SAXException {
                File xmlFile = new File("C:/Users/shova/config.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                return doc.getElementsByTagName(kayData).item(0).getTextContent();
        }

        private static String takeScreenShot(String ImagesPath) {
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
                File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
                File destinationFile = new File(ImagesPath + ".png");
                try {
                        FileUtils.copyFile(screenShotFile, destinationFile);
                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }
                return ImagesPath + ".png";
        }

        @AfterClass
        public static void close() {
                driver.close();
                driver.quit();
                extent.flush();
        }
}