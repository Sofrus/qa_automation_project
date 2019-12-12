import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Vtargete {
    @Test
    @DisplayName("Positive test")
    void positiveTest() {
        open("https://stage.vtargete.ru/login/vk");

        $(byName("email")).setValue("sofrus@gmail.com");
        $(byName("pass")).setValue("Rst060985V").pressEnter();

        open("http://stage.vtargete.ru/branch/FRONT-26-create-col-def-by-user/tool/#/1605539798/null/1013857273");

        sleep(3000);

//        $$(".el-button.el-button--default.el-button--mini").get(1).click();
        $(".ag-column-select-panel .el-button--mini").click();

//        $$(".el-input__inner").get(3).setValue("Test4");
        $(".el-dialog .el-input__inner[type='string']").setValue("Test6");

        $(".is-empty2").setValue("@");

//        $$(".suggestion-list__item").get(2).click();
        $(".suggestion-list__item", 2).click();

//        $$(".el-button.el-button--primary.el-button--mini").get(3).click();
        $(byText("Сохранить")).click();

        refresh();
        $(withText("Test6")).should(exist);
        sleep(3000);


    }


}
