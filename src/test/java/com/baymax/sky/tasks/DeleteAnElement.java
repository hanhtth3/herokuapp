package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.jetbrains.annotations.NotNull;

public class DeleteAnElement {
    @NotNull
    public static Performable theDeleteElementButton() {
        return Task.where("{0} delete the Element.", actor -> actor.attemptsTo(
               Click.on(Elements.DELETE_ELEMENT_BUTTON)
                )
        );
    }
}
