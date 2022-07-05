package shortestPath.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shortestPath.domain.ShortestPath;
import shortestPath.repository.ShortestPathRepository;

import java.util.List;

@Service
@Slf4j
public class ShortestPathService {
    private  final ShortestPathRepository shortestPathRepository;

    public ShortestPathService(ShortestPathRepository shortestPathRepository) {
        this.shortestPathRepository = shortestPathRepository;
    }

//    public ShortestPath save(ShortestPath shortestPath){
//        log.debug("Request to find the length of shortest path");
//        return shortestPathRepository.save(shortestPath);
//    }

    public ShortestPath findShortestPath(){
        log.debug("Request to find the length of shortest path");
        return (ShortestPath) shortestPathRepository.findAll();
    }
}
