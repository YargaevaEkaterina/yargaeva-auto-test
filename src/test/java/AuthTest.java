import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {
    @Test
    public void shouldAuthorizeTest() {
        //Открывать страницу github
        open("https://github.com/");
        //Кликнуть на sign in
        $("[href='/login']").click();
        //Ввести логин и пароль
        $("[id='login_field']").sendKeys("e.yargaeva.kazanexpress@gmail.com");
        $("[id='password']").sendKeys("1111111111Kk.");
        //Нажать sign in
        $(".js-sign-in-button").click();
        //Развернуть меню пользователя
        $("[aria-label='View profile and more']").click();
        //Нажать Your profile в меню
        $("[data-ga-click='Header, go to profile, text:your profile']").click();
        //Проверить, что отображается страница профиля ппользователя, убедившись, что есть блок со статистикой
        $(".js-yearly-contributions").shouldBe(visible);

    }
}