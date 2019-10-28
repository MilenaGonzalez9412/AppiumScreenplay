package co.com.appium.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.appium.userinterfaces.CalculatorUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Calculate implements Task {
    //Here we have the steps that our automation is going to make.
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_3),
                Click.on(BUTTON_PLUS),
                Click.on(BUTTON_5),
                Click.on(BUTTON_EQUAL)
        );
    }

    public static Calculate theApp(){
        return instrumented(Calculate.class);
    }
}
