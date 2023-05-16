package doughs;

import org.springframework.stereotype.Component;

@Component("shortbread")
public class Shortbread implements Dough {
    @Override
    public String getName() {
        return "Песочное";
    }
}
