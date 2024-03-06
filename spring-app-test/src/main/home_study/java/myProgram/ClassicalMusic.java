package myProgram;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> music=new ArrayList<>(Arrays.asList("Лунная соната","Четыре времени года","Турецкий марш"));
    private ClassicalMusic(){

    }
   public static ClassicalMusic getClassicalMusic(){
            return new ClassicalMusic();
   }
    public void doMyInit(){
        System.out.println("init");
    }
    public void doMyDestroy(){
        System.out.println("destroy");
    }
    @Override
    public List<String> getMusic() {
        return music;
    }
}

