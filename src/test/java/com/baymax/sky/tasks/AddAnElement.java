package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;
import com.baymax.sky.tasks.NavigateTo;

public class AddAnElement {
    @NotNull
    public static Performable theAddElementButton() {
        return Task.where("{0} add the Element.", actor -> actor.attemptsTo(
              // NavigateTo.theElementPage(),
                Click.on(Elements.ADD_ELEMENT_BUTTON)
                )
        );
    }
}
