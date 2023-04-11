import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class appiumodev {


    private AppiumDriver driver;


    @BeforeEach

    public void before() throws MalformedURLException {
        {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("platformVersion", "11.0");
            caps.setCapability("deviceName", "samsung");
            caps.setCapability("udid", "RF8R10PNZKY");
            caps.setCapability("app", "/opt/sahibinden/imdb.apk");
            caps.setCapability("appActivity", "com.imdb.mobile.HomeActivity");
            caps.setCapability("newCommandTimeout", "600");
            caps.setCapability("autoGrantPermissions", true);
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);


        }
    }
        @AfterEach
        public void after () {
            if (null != driver) {
                driver.quit();
            }
        }


        @Test
        public void testFilter () {

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")).click();
            driver.findElement(By.id("navigation_search_browse")).click();
            WebElement search = driver.findElement(By.id("search_src_text"));
            search.click();
            search.sendKeys("Hobbit");
            WebElement hobbit2014Film = driver.findElement(By.xpath("//*[@text='The Hobbit:The Battle of the Five Armies ']"));
            hobbit2014Film.click();
            String filmTitle = driver.findElement(By.id("title")).getText();
            filmTitle.equals(true);
            Assertions.assertTrue(filmTitle.equals(true));

        }

        @Test
        public void testSearch () {

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")).click();
            driver.findElement(By.id("navigation_search_browse")).click();

            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.view.ViewGroup/android.widget.TextView")).click();
            driver.findElement(By.xpath("//android.widget.TextView[@text='Top 250 movies']")).click();
            List<String> list1 = new ArrayList<>();
            list1.add(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText());
            list1.add(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText());
            list1.add(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText());
            driver.findElement(By.id("com.imdb.mobile:id/refine_button")).click();
            driver.findElement(By.xpath("//*[@text='IMDb Puanı']")).click();
            driver.findElement(By.xpath("//*[@text='Puanlama Sayısı']")).click();
            driver.navigate().back();
            List<String> list2 = new ArrayList<>();
            list2.add(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText());
            list2.add(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText());
            for (String movie : list1) {
                for (String movie2 : list2)
                    if (movie.contains(movie2)) {
                        System.out.println("İki Listede Yer Alan Film:" + movie);
                    }

            }
        }
    }


