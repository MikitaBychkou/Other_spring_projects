package home_study;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList=new ArrayList<>();
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
//IoC
/*    public MusicPlayer(Music music) {
        this.music = music;
    }*/


/*    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }*/
    //1)
    public void playMusicList() {
        musicList.forEach(music -> System.out.println("Playing: "+music.getSong()));
    }
    //2)
//    public void playMusicList() {
//        musicList.forEach(music -> music.getSong());
//    }

}
