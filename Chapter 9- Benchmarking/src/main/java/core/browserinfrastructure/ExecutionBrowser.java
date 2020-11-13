package core.browserinfrastructure;

import core.Browser;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( { ElementType.TYPE, ElementType.METHOD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutionBrowser {
    Browser browser() default Browser.Chrome;
    BrowserBehavior browserBehavior() default BrowserBehavior.RestartEveryTime;
}