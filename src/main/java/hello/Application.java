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
import hello.beans.PageData;
import hello.beans.Torrent;
import hello.beans.YTSResponse;
import hello.repositories.MovieRepository;
import hello.repositories.TorrentRepository;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(MovieRepository mr, TorrentRepository tr) {
		return (args) -> {

            //headers
            HttpHeaders headers = new HttpHeaders();
            headers.set("User-agent", "SomeUserAgent");
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            
            int page = 0;
            int moviesSaved = 0;
            int totalMovies = -1;
            int totalPercentComplete = 0;
            RestTemplate rt = new RestTemplate();
            PageData data = null;
            do{
                //make the api call
                data = rt.exchange("https://yts.lt/api/v2/list_movies.json?limit=50&page=" + page, HttpMethod.GET, entity, YTSResponse.class).getBody().getData();
                totalMovies = data.getMovieCount();
                if(data.getMovies() != null){
                    //save data
                    for(Movie x : data.getMovies()){
                        for(Torrent y : x.getTorrents()){
                            y.setMovie(x);
                            tr.save(y);
                        }
                        mr.save(x);
                        moviesSaved++;
                        int newTotalPercentComplete = (moviesSaved / totalMovies) * 100;
                        if(newTotalPercentComplete > totalPercentComplete){
                            totalPercentComplete = newTotalPercentComplete;
                            log.info(totalPercentComplete + " % done");
                        }
                    }
                    page++;
                }
            }while(data.getMovies() != null);
		};
	}
}