import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("TheLordOfTheRings")
public class AuthTest {
    @Test
    @Story("Авторизация")
    @DisplayName("Успешная авторизация:")
    public void shouldAuthorizeTest() {
        step("Открыть главную страницу Github",() -> {
                open("https://github.com/");
            });
        step("Кликнуть на кнопку sign in на главной странице",() -> {
                TestPages.mainPage.mainSignInButton().click();
            });
        step("Ввести логин в инпут логина",() -> {
                TestPages.signInPage.loginField().sendKeys("e.yargaeva.kazanexpress@gmail.com");
            });
        step("Ввести пароль в инпут пароля",() -> {
                TestPages.signInPage.passwordField().sendKeys("11111111111");
            });
        step("Кликнуть на кнопку sign in на странице логина",() -> {
                TestPages.signInPage.loginSignInButton().click();
            });
        step("Развернуть меню пользователя",() -> {
                TestPages.mainPage.dropdownProfileMenu().click();
            });
        step("Нажать на кнопку Your profile в меню",() -> {
                TestPages.mainPage.dropdownProfileButton().click();
            });
        step("Проверить, что отображается страница профиля пользователя, убедившись, что есть блок со статистикой",() -> {
                TestPages.profilePage.blockYearlyStatistics().shouldBe(visible);
            });
    }
}