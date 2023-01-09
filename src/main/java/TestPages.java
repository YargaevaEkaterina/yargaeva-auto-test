import pages.MainPage;
import pages.ProfilePage;
import pages.RepositoryPage;
import pages.SignInPage;

public final class TestPages {
    public static final MainPage mainPage = new MainPage();
    public static final ProfilePage profilePage = new ProfilePage();

    public static final SignInPage signInPage = new SignInPage();

    public static final RepositoryPage repositoryPage = new RepositoryPage();

    private TestPages() {
    }
}
