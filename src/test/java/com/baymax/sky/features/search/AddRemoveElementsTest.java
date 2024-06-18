package com.baymax.sky.features.search;

import com.baymax.sky.tasks.OpenTheApplication;
import com.baymax.sky.tasks.Search;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class AddRemoveElementsTest {

    public static final String URL="https://the-internet.herokuapp.com/";
    public static final Target ADD_REMOVE=
            Target.the("Add Remove Elements").
                    located(By.linkText("Add/Remove Elements"));
    public static final Target ADD_ELEMENT =
            Target.the("Add the element").
                    located(By.name("Add Element"));
    public static final Target DELETE=
            Target.the("Delete element").
                    located(By.className("added-manually"));
    Actor hanh = Actor.named("Hanh");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        hanh.can(BrowseTheWeb.with(herBrowser));
    }

    @WithTag("TC01")
    @Test
    public void add_elements() {

        hanh.attemptsTo(
                Open.url(URL),
                Click.on(ADD_REMOVE),
                Click.on(ADD_ELEMENT)

        );
    }
        @WithTag("TC02")
        @Test
        public void delete_elements() {

            hanh.attemptsTo(
                    Open.url(URL),
                    Click.on(ADD_REMOVE),
                    Click.on(DELETE)

            );

    }
}