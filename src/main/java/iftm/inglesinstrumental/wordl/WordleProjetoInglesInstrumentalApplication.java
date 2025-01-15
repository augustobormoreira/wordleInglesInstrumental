package iftm.inglesinstrumental.wordl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WordleProjetoInglesInstrumentalApplication {

	@Bean
	public WebClient.Builder getWebClientBuilder(){
		WebClient.Builder builder = WebClient.builder();

		return builder;
	}


	public static void main(String[] args) {
		SpringApplication.run(WordleProjetoInglesInstrumentalApplication.class, args);
	}

}
