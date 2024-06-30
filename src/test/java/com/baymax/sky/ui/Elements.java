package com.baymax.sky.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.w3c.dom.css.Counter;

public class Elements {
    public static final Target ADD_REMOVE_MENU =
            Target.the("Add Remove Elements").
                    located(By.linkText("Add/Remove Elements"));

    public static final Target ADD_ELEMENT_BUTTON =
            Target.the("Add the element").
                    locatedBy("//button[text()='Add Element']");

    public static final Target DELETE_ELEMENT_BUTTON =
            Target.the("Delete element").
                    locatedBy("//button[@onclick='deleteElement()']");

    public static final String URL="https://the-internet.herokuapp.com/";

    public static final String URL_AUTH_VALID="http://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static final String URL_AUTH_INVALID="http://admin1:admin@the-internet.herokuapp.com/basic_auth";

    public static final Target BASIC_AUTH_MENU =
            Target.the("Basic Auth Menu").
                    located(By.linkText("Basic Auth"));

    public static final Target MESANGE_LOGIN_VALID=
            Target.the("congratulations text").
                    located(By.id("content"));
}
