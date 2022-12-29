import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {
    @Test
    public void shouldAuthorizeTest() {
        //Открывать страницу github
        open("https://github.com/");
        //Кликнуть на sign in
        TestPages.mainPage.mainSignInButton().click();
        //Ввести логин и пароль
        TestPages.signInPage.loginField().sendKeys("e.yargaeva.kazanexpress@gmail.com");
        TestPages.signInPage.passwordField().sendKeys("11111111111");
        //Нажать sign in
        TestPages.signInPage.loginSignInButton().click();
        //Развернуть меню пользователя
        TestPages.mainPage.dropdownProfileMenu().click();
        //Нажать Your profile в меню
        TestPages.mainPage.dropdownProfileButton().click();
        //Проверить, что отображается страница профиля ппользователя, убедившись, что есть блок со статистикой
        TestPages.profilePage.blockYearlyStatistics().shouldBe(visible);

    }
}