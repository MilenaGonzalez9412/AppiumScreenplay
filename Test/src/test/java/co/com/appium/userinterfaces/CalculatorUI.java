package co.com.appium.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorUI extends PageObject {

    //This is the mapping of the elements of the application with which we will interact.

    public static Target BUTTON_3 = Target.the("Button three").located(By.id("com.google.android.calculator:id/digit_3"));
    public static Target BUTTON_PLUS = Target.the("Button plus").located(By.id("com.google.android.calculator:id/op_add"));
    public static Target BUTTON_5 = Target.the("Button five").located(By.id("com.google.android.calculator:id/digit_5"));
    public static Target BUTTON_EQUAL = Target.the("Button equal").located(By.id("com.google.android.calculator:id/eq"));
    public static Target RESULT = Target.the("The result").located(By.id("com.google.android.calculator:id/result_final"));
}
