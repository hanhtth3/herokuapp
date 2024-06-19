package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class NavigateTo {
    @NotNull
    public static Performable theElements() {
        return Task.where("{0} add the Element.", actor -> actor.attemptsTo(
                Open.url(Elements.URL),
                Click.on(Elements.ADD_REMOVE),
                Click.on(Elements.ADD_ELEMENT)

        ));
    }
}
