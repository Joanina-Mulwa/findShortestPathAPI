package shortestPath.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import shortestPath.domain.ShortestPath;
import shortestPath.service.ShortestPathService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class ShortestPathResource {

    private final ShortestPathService shortestPathService;

    public ShortestPathResource(ShortestPathService shortestPathService) {
        this.shortestPathService = shortestPathService;
    }

//    @PostMapping("/save")
//    public ShortestPath save(ShortestPath shortestPath){
//        log.debug("REST request to find length");
//        return shortestPathService.save(shortestPath);
//    }

    @GetMapping("/findShortestPath")
    public ShortestPath findShortestPath(){
        log.debug("REST request to find length");
        return shortestPathService.findShortestPath();
    }
}
