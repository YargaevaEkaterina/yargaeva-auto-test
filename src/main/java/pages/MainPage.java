package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement mainSignInButton() {
        return $("[href='/login']").as("кнопка логина на главной странице");
    }

    public SelenideElement dropdownProfileMenu() {
        return $("[aria-label='View profile and more']").as("дропдаун меню профиля");
    }

    public SelenideElement dropdownProfileButton() {
        return $("[data-ga-click='Header, go to profile, text:your profile']").as("кнопка профиля в дропдауне профиля");
    }
}
