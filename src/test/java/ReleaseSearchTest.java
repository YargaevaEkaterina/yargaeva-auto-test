import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import java.util.stream.Stream;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Owner("TheLordOfTheRings")
public class ReleaseSearchTest {
    @BeforeEach
    public void openRepository() {
        open("https://github.com/junit-team/junit4/releases");
    }

    @ParameterizedTest(name = "{displayName} {0}")
    @Story("Поиск релизов")
    @MethodSource("positiveScenarious")
    @DisplayName("Позитивные проверки поиска по релизам:")
    public void searchTest(String type, String value) {
        step("Заполнить поле поиска по релизам и нажать enter",() -> {
                    TestPages.repositoryPage.releaseFilter().sendKeys(value);
                });

        step("Проверить что блок с карточкой релиза отображается",() -> {
                    TestPages.repositoryPage.releaseCard().shouldBe(visible);
                });

        step("Проверить что блок с карточкой релиза отображается",() -> {
            TestPages.repositoryPage.releaseName().shouldHave(text(value));
        });
        sleep(2000);
    }

    static Stream<Arguments> positiveScenarious() {
        return Stream.of(
                arguments(
                        "Поиск по номеру релиза",
                        "4.13.2\n"
                ),
                arguments(
                        "Поиск по буквам в названии",
                        "RC\n"
                )
        );
    }
}
