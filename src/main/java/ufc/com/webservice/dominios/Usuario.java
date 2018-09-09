package ufc.com.webservice.dominios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Document
public class Usuario {

    @Id
    private String id;
    @NotNull
    private String nome;
    @NotNull
    private String email;
    @NotNull
    private String login;
    @NotNull
    private String senha;

    private List<AmbienteVirtual> virtualList =  new ArrayList<>();

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<AmbienteVirtual> getVirtualList() {
        return virtualList;
    }

    public void setVirtualList(List<AmbienteVirtual> virtualList) {
        this.virtualList = virtualList;
    }

    @Override
    public String toString() {
        return "{"+"id: "+getId()+" nome: "+getNome()+" email :"+getEmail()+"}";
    }
}
