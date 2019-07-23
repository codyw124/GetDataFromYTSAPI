package hello.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.beans.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}