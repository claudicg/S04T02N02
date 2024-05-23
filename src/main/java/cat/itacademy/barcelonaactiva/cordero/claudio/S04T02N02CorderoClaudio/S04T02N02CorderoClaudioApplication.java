package cat.itacademy.barcelonaactiva.cordero.claudio.S04T02N02CorderoClaudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class S04T02N02CorderoClaudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N02CorderoClaudioApplication.class, args);
	}
}
