package home_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //без XML файла, только с классом(@Configuration)
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer=context.getBean("computer",Computer.class);
        System.out.println(computer);

//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());




        context.close();
    }
}
