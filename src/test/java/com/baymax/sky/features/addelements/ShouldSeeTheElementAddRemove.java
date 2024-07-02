package com.baymax.sky.features.addelements;

import com.baymax.sky.features.WebHook;
import com.baymax.sky.questions.ListOfButton;
import com.baymax.sky.tasks.*;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.screenplay.ensure.Ensure;
import com.baymax.sky.tasks.AddAnElement;

import com.baymax.sky.ui.Elements;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheElementAddRemove extends WebHook {

    @WithTag("TC01")
    @Test
    public void add_element() {

        int times = 9;
       /* hanh.attemptsTo(
                NavigateTo.theButtonElementManagement(),
                Add.theElements(times),
                Ensure.that(ListOfButton.size()).isEqualTo(times)

        );*/

       hanh.attemptsTo(
                NavigateTo.theButtonElementManagement(),
                Add.theElements(times)

        );

        int count = hanh.asksFor(ListOfButton.size());

        hanh.attemptsTo(Ensure.that(count).isEqualTo(times));

    }
    @WithTag("TC02")
   // @Test
    public void delete_element() {

        hanh.attemptsTo(
                NavigateTo.theButtonElementManagement(),
                AddAnElement.theAddElementButton(),
                DeleteAnElement.theDeleteElementButton(),
                Ensure.that(Elements.DELETE_ELEMENT_BUTTON).isNotDisplayed()
        );

    }

}