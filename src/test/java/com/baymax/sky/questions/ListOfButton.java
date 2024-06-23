package com.baymax.sky.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class ListOfButton {

    public static Question<Integer> size() {
        return actor ->  BrowseTheWeb.as(actor).findAll("//button[@class='added-manually']").size();
    }


}
