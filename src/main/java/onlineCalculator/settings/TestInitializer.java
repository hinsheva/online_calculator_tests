package onlineCalculator.settings;

import onlineCalculator.elements.OnlineCalculatorWebElementsHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestInitializer {
    private static WebDriver driver;
    public static OnlineCalculatorWebElementsHelper calcElement;

    @BeforeAll
    static void setUp() {
        if (calcElement == null) {
            setDriver();
            openOnlineCalculatorPage();
            resizeBrowserWindow();
            setCalculatorModePage("http://www.calculatoria.com/scientific-online-calculator/");

            calcElement = new OnlineCalculatorWebElementsHelper(driver);
        }
    }

    private static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    private static void openOnlineCalculatorPage() {
        driver.navigate().to("http://www.calculatoria.com/");
    }

    private static void resizeBrowserWindow() {
        WebDriver.Options manage = driver.manage();
        manage.window().maximize();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    private static void setCalculatorModePage(String modeUrl) {
        driver.navigate().to(modeUrl);
    }

    @AfterEach
    void clearInput() {
        calcElement.clearAll();
    }

    @AfterAll
    static void tearDown() {
        driver.close();
    }
}