package com.baymax.sky.features.login;

import com.baymax.sky.tasks.AddAnElement;
import com.baymax.sky.tasks.DeleteAnElement;
import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WhenLoginAsInvalidUser extends WebHookLogIn {

    @WithTag("TC01")
    @Test
    public void login_invalid_user() {

         hanh.attemptsTo(
                NavigateTo.theButtonBasicAuthManagement()

               // Ensure.that(ListOfButton.size()).isEqualTo(times)

        );
    }

}