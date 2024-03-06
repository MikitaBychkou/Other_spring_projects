package home_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("home_study")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	@Bean
	public ClassicalMusic classicalMusic(){
		return new ClassicalMusic();
	}
	@Bean
	public RockMusic rockMusic(){
		return new RockMusic();
	}
	@Bean
	public MusicPlayer musicPlayer(){
		return new MusicPlayer(songs());
	}
	@Bean
	public Computer computer(){
		return new Computer(musicPlayer());
	}
	@Bean
	public Rap rap(){
		return new Rap();
	}
	@Bean
	public List<Music> songs(){
		return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic(),rap());
	}
	@Bean JazzMusic jazzMusic(){
		return new JazzMusic();
	}

}
