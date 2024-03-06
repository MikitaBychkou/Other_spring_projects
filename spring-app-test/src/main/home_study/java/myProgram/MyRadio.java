package myProgram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MyRadio {
@Value("${myRadio.name}")
	private String name;
@Value("${myRadio.volume}")
	private int volume;

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}
	@PostConstruct
	public  void doMyInit(){
		System.out.println("Init");
	}
	@PreDestroy
	public  void doMyDestroy(){
		System.out.println("Destroy");
	}

}
