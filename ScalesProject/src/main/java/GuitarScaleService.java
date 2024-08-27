import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GuitarScaleService {

    private final String API_BASE_URL = "https://api.scales-chords.com/api/scales/";

    public String getScale(String key, String scaleType) {
        String url = API_BASE_URL + "?key=" + key + "&scale=" + scaleType;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}