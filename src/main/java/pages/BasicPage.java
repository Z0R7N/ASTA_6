package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButton(String text){
        $(By.cssSelector("#LoginForm_save")).click();
    }
    public void clickLink(String text) {
        $(By.xpath("//h2[text()='" + text + "']/..")).click();
    }

    public void contentVisible(String text){
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
