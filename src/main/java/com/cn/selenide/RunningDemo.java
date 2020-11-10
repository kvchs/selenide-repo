package com.cn.selenide;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RunningDemo {

    @Test
    public void userCanLoginByUsername(){
        open("https://www.google.com");
        sleep(5000);
        $(By.name("q")).setValue("selenide").pressEnter();
        $(By.xpath("/html/body/div[7]/div[2]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/a/h3/span")).shouldHave(text("Selenide: concise UI tests in Java"));
        sleep(5000);


    }

}
