package ufc.com.webservice.dominios;

import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Document
public class AmbienteVirtual {

    private String id;
    private String nome;
    private String descricao;
    private List<Categoria> categorias = new ArrayList<>();
    private MetaDados metaDados;

    public AmbienteVirtual( String nome, String descricao, MetaDados metaDados) {
        this.nome = nome;
        this.descricao = descricao;
        this.metaDados = metaDados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public MetaDados getMetaDados() {
        return metaDados;
    }

    public void setMetaDados(MetaDados metaDados) {
        this.metaDados = metaDados;
    }
}
