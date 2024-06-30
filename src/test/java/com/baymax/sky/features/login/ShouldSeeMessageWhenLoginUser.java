package com.baymax.sky.features.login;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ShouldSeeMessageWhenLoginUser extends WebHookLogIn {

    @WithTag("TC01")
   // @Test
    public void login_valid_user() {

        hanh.attemptsTo(
                Open.url(Elements.URL_AUTH_VALID),
                Ensure.that(Elements.MESANGE_LOGIN_VALID).text().contains("Congratulations! You must have the proper credentials.")

        );
    }
    @WithTag("TC02")
    @Test
    public void login_invalid_user() {

        hanh.attemptsTo(
                Open.url(Elements.URL_AUTH_INVALID),
                Ensure.that(Elements.MESANGE_LOGIN_VALID).isNotDisplayed()

        );
    }
}

