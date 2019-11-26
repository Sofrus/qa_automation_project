import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    @DisplayName("Search yandex test")
    void positiveTest() {
        open("https://www.google.com/");
        $(".gLFyf.gsfi").val("yandex").pressEnter();
        $(withText("Яндекс")).should(exist);



    }
}