package doughs;

import org.springframework.stereotype.Component;

@Component("yeast")
public class Yeast implements Dough {
    @Override
    public String getName() {
        return "Дрожжевое";
    }
}
