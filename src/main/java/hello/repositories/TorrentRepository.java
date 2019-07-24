package hello.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.beans.Torrent;

@Repository
public interface TorrentRepository extends CrudRepository<Torrent, Integer> {

}