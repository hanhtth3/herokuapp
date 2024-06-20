package com.baymax.sky.features.search;

import com.baymax.sky.tasks.AddAnElement;
import com.baymax.sky.tasks.DeleteAnElement;
import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.ui.Elements;
import com.openhtmltopdf.css.parser.CounterData;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import  net.serenitybdd.screenplay.Performable;


@RunWith(SerenityRunner.class)
public class ShouldSeeMultiElements extends WebHook {

    public static final int countElement;

    @WithTag("TC01")
    @Test
    public void add_element() {

        hanh.attemptsTo(
                NavigateTo.theElementPage(),
                AddAnElement.theAddElementButton(),
                AddAnElement.theAddElementButton(),
                AddAnElement.theAddElementButton(),
                Ensure.that(Elements.DELETE_ELEMENT_BUTTON).isDisplayed()

        );
    }

}