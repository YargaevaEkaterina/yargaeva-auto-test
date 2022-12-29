package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement blockYearlyStatistics() {
        return $(".js-yearly-contributions").as("блок статистики пользователя");
    }
}
