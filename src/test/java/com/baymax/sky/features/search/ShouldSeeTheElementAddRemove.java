package com.baymax.sky.features.search;

import com.baymax.sky.tasks.NavigateTo;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.screenplay.ensure.Ensure;

import com.baymax.sky.ui.Elements;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheElementAddRemove extends WebHook {

    @WithTag("TC01")
    @Test
    public void add_element() {

        hanh.attemptsTo(
                NavigateTo.theElements(),
                Ensure.that(Elements.DELETE).isDisplayed()

        );
    }
    @WithTag("TC02")
    @Test
    public void delete_element() {

        hanh.attemptsTo(
                NavigateTo.theElements(),
                Click.on(Elements.DELETE),
                Ensure.that(Elements.DELETE).isNotDisplayed()
        );

    }
}