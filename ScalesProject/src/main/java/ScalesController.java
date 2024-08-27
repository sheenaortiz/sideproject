import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ScalesController {

    private ScalesController scalesController;

    // Endpoint to get a guitar scale by key and scale type
    @GetMapping("/scales")
    public String getGuitarScale(@RequestParam String key, @RequestParam String scaleType) {
        return guitarScaleService.getScale(key, scaleType);
    }
}
