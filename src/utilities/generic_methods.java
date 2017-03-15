package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by I077653 on 3/12/2017.
 */
public class generic_methods {
    public void calling_selenium_server() throws MalformedURLException
    {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        //capabilities.setPlatform(Platform.WINDOWS);
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
    }
}
