package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    public SelenideElement loginField() {
        return $("[id='login_field']").as("поле логина");
    }

    public SelenideElement passwordField() {
        return $("[id='password']").as("поле пароля");
    }

    public SelenideElement loginSignInButton() {
        return $(".js-sign-in-button").as("кнопка логина на странице логина");
    }
}
