package ufc.com.webservice.dominios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ufc.com.webservice.enums.TipoMidia;



@Document
public class Midias {

    @Id
    private String id;
    TipoMidia tipoMidia;
    String caminhoParaMidia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoMidia getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(TipoMidia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public String getCaminhoParaMidia() {
        return caminhoParaMidia;
    }

    public void setCaminhoParaMidia(String caminhoParaMidia) {
        this.caminhoParaMidia = caminhoParaMidia;
    }
}
