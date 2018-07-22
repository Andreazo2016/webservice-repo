package ufc.com.webservice.dominios;

import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;
@Document
public class MetaDados {

    private Integer id;
    private Double temperatura;
    private Double latitude;
    private Double longitude;
    private List<Midias> midias = new ArrayList<>();

    public MetaDados( Double temperatura, Double latitude, Double longitude) {
        this.temperatura = temperatura;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<Midias> getMidias() {
        return midias;
    }

    public void setMidias(List<Midias> midias) {
        this.midias = midias;
    }
}
