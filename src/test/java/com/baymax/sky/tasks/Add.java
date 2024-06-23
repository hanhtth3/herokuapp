package com.baymax.sky.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Add {
    public static Performable theElements(int n) {
        return Task.where("{0} add multi button", actor -> {

            for (int i = 1; i<=n; i++){
                actor.attemptsTo(AddAnElement.theAddElementButton());
            }

        });
    }
}
