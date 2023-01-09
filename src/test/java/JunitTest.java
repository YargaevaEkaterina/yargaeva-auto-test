import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("TheLordOfTheRings")
public class JunitTest {
    @Test
    @Story("Работа с ветками")
    @DisplayName("Переключение на ветку fixture:")
    public void switchToFixtures() {
        //Открывать страницу github
        step("Открыть страницу репозитория",() -> {
            open("https://github.com/junit-team/junit4");
        });
        //Кликнуть на branches
        step("Развернуть меню смены веток",() -> {
            TestPages.repositoryPage.buttonSwitchBranches().click();
        });
        step("Кликнуть на кнопку ветки fixture",() -> {
            TestPages.repositoryPage.fixtureButton().click();
        });
        step("Проверить что активная ветка называется fixture",() -> {
            TestPages.repositoryPage.activeBranchName().shouldHave(text("fixtures"));
        });
        }
    }

