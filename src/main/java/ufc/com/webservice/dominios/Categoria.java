package ufc.com.webservice.dominios;

import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Document
public class Categoria {

    private Integer id;
    private String nome;
    List<AmbienteVirtual> ambienteVirtuals = new ArrayList<>();

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AmbienteVirtual> getAmbienteVirtuals() {
        return ambienteVirtuals;
    }

    public void setAmbienteVirtuals(List<AmbienteVirtual> ambienteVirtuals) {
        this.ambienteVirtuals = ambienteVirtuals;
    }
}
