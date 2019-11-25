import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SomeTests {
    @Test
    @DisplayName("Positive test")
    void positiveTest() {
        open("https://market.yandex.ru/");
        $("#header-search").val("холодильник").pressEnter();
        $(".link.n-link_theme_blue.link_type_cpc").click();
        $(withText("Холодильник")).should(exist);
//        $(withText("С этим товаром смотрят")).shouldBe(visible);


        //$(byText("Холодильник ATLANT ХМ 4208-000")).should(exist);


    }
}