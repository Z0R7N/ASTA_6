package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#LoginForm__username"));
    private SelenideElement passwordInput = $(By.cssSelector("#LoginForm__password"));

    public void inputLogin (String text){
        this.loginInput.val(text);
    }

    public void inputPassword (String text){
        this.passwordInput.val(text);
    }
}
