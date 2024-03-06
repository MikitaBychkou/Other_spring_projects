package home_study;

import org.springframework.stereotype.Component;


public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Hit the road Jack";
    }
}
