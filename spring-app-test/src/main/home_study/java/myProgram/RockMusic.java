package myProgram;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component //можно в скобках указать id (по умолчанию как название класса только с маленькой буквы)
public class RockMusic implements Music {
    List<String> music=new ArrayList<>(Arrays.asList("Hungarian Rhapsody","Stairway to Heaven","Hotel California"));
    @Override
    public List<String> getMusic() {
        return music;
    }
}
