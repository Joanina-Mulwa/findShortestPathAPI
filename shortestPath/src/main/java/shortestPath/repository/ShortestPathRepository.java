package shortestPath.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import shortestPath.domain.ShortestPath;

public interface ShortestPathRepository extends JpaRepository<ShortestPath, Integer> {

}
