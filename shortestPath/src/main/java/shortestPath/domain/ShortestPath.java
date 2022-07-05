package shortestPath.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "tbl_shortestPath")
public class ShortestPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int length = 10;
    String paths;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void setPaths(String paths) {
        this.paths = paths;
    }

    public List<String> getPaths(){
        if(this.paths != null){
            return Arrays.asList(this.paths.split(","));
        }
        return new ArrayList<>();
    }
}
