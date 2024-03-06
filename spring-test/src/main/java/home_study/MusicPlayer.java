package home_study;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    private List<Music> songs =new ArrayList<>();

    public MusicPlayer(List<Music> songs) {
        this.songs = songs;
    }
    /* private Music music1;
    private Music music2;


    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/

    public String playMusic() {
        Random random=new Random();
        int song=random.nextInt(4)+1;
        switch (song){
            case 1: return "Playing: " + songs.get(0).getSong() ;
            case 2: return "Playing: " + songs.get(1).getSong() ;
            case 3: return "Playing: " + songs.get(2).getSong() ;
            case 4: return "Playing: " + songs.get(3).getSong() ;
            default: return "Don't noise!!!";
        }
    }
}
