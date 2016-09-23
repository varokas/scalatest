import java.net.URL

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.{DesiredCapabilities, RemoteWebDriver}
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FlatSpec, Matchers}

class GoogleSpec extends FlatSpec with Matchers with WebBrowser {
  implicit val webDriver: WebDriver = new RemoteWebDriver(
    new URL("http://139.59.226.188:31961/wd/hub"),
    new DesiredCapabilities("chrome", null, null)
  )

  val host = "http://www.google.com"

  "The google home page" should "have the correct title" in {
    go to (host)
    pageTitle should be("Google")
    quit()
  }
}