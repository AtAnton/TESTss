package avtotest;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class avto {
    @Test
public void userCanLoginByUsername() {
        System.setProperty("selenide.startMaximized", "true");
    open("https://maket02.cloudpbx.rt.ru/login/");
    $(By.name("username")).setValue("johny");
    $("#submit").click();
    $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
    $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
        Selenide.sleep(1000);
}
}
