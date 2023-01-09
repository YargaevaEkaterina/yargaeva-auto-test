package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {
    public SelenideElement buttonSwitchBranches() {
        return $("#branch-select-menu").as("кнопка переключения веток");
    }

    public SelenideElement fixtureButton() {
        return $("[href='https://github.com/junit-team/junit4/tree/fixtures']").as("кнопка ветки фикстур");
    }

    public SelenideElement activeBranchName() {
        return $( "[class='css-truncate-target']").as("название текущей ветки");
    }

    public SelenideElement releaseFilter() {
        return $("#release-filter").as("инпут поиска по релизам");
    }

    public SelenideElement releaseCard() {
        return $("[data-test-selector='release-card']").as("карточка релиза");
    }

    public SelenideElement releaseName() {
        return $(".hx_keyword-hl").as("наименование релиза");
    }
}
