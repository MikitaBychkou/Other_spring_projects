package myProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1=music1;
        this.music2=music2;
    }


/*    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {  //внедрение конструктором
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }*/

/*        @Autowired
    public MusicPlayer( Music music){ /внедрение конструктором
        this.music=music;
    }*/

/*
    @Autowired
    public void setMusic(Music music) { // внедрение сеттером
        this.music = music;
    }
*/

    public String playMusic(String genre){
        Genre genre1=Genre.valueOf(genre);
        if(genre1.equals(Genre.CLASSICAL)){
            return music2.getMusic().get((int)(Math.random()*3));
        }else return music1.getMusic().get((int)(Math.random()*3));
    }
}
