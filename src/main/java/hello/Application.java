package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import hello.beans.Movie;
import hello.beans.YTSResponse;
import hello.repositories.MovieRepository;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(MovieRepository repository) {
		return (args) -> {

            HttpHeaders headers = new HttpHeaders();
            headers.set("User-agent", "SomeUserAgent");
            HttpEntity<String> entity = new HttpEntity<String>(headers);
    
            RestTemplate rt = new RestTemplate();
            YTSResponse result = rt.exchange("https://yts.lt/api/v2/list_movies.json", HttpMethod.GET, entity, YTSResponse.class).getBody();
    
            for(Movie x : result.getData().getMovies()){
                repository.save(x);
            }
            log.info(result.toString());
		};
	}
}