package myProgram;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

//      ClassicalMusic classicalMusic=context.getBean("classicalMusic",ClassicalMusic.class);
//      Music rockMusic=context.getBean("rockMusic", RockMusic.class);
//        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();


//        Computer computer=context.getBean("computer",Computer.class);
//        System.out.println(computer);

        MyRadio myRadio1=context.getBean("myRadio",MyRadio.class);
        System.out.println("MyRadio 1 - name: "+myRadio1.getName()+", volume: "+myRadio1.getVolume());





      context.close();
    }
}
