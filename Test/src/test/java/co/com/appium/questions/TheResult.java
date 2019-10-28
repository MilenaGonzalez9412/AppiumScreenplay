package co.com.appium.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.appium.userinterfaces.CalculatorUI.RESULT;

public class TheResult implements Question<String> {

    //This is the expected result
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RESULT).viewedBy(actor).asString();
    }

    public static TheResult is(){
        return new TheResult();
    }
}
