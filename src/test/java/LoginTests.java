import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    @DisplayName("Positive test")
    void positiveTest() {
        open("https://www.moscowbooks.ru/");
        $("#loginLink").click();
        $("#Email_auth").val("sofrus@gmail.com").pressTab();
        $("#Password").val("123456").pressEnter();
        $(withText("Выйти")).should(exist);
        $(withText("sofrus@gmail.com")).should(exist);

    }
}