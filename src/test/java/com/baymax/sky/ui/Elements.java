package com.baymax.sky.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Elements {
    public static final Target ADD_REMOVE=
            Target.the("Add Remove Elements").
                    located(By.linkText("Add/Remove Elements"));

    public static final Target ADD_ELEMENT =
            Target.the("Add the element").
                    locatedBy("//button[text()='Add Element']");

    public static final Target DELETE=
            Target.the("Delete element").
                    locatedBy("//button[@onclick='deleteElement()']");

    public static final String URL="https://the-internet.herokuapp.com/";
}
