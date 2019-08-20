package com.stackroute.repository;
import com.stackroute.domain.Track;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
//implementing the cassandra repository
@Repository
public interface TrackRepository extends CassandraRepository<Track, Integer> {

    @AllowFiltering
    List<Track> getTrackByName(String name);


}
