package cat.itacademy.barcelonaactiva.cordero.claudio.S04T02N02CorderoClaudio.model.security;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptService {

	
	public String getUnencryptedValue(String property) {

		BasicTextEncryptor decryptor = new BasicTextEncryptor();
		decryptor.setPassword(System.getProperty("jasypt.encryptor.password"));  		
		return decryptor.decrypt(property);
	}
}
