import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class JunitTest {
    @Test
    public void switchToFixtures() {
        //Открывать страницу github
        open("https://github.com/junit-team/junit4");
        //Кликнуть на branches
        TestPages.repositoryPage.buttonSwitchBranches().click();
        TestPages.repositoryPage.fixtureButton().click();
    }
}
