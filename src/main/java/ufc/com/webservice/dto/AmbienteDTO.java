package ufc.com.webservice.dto;

import ufc.com.webservice.dominios.AmbienteVirtual;
import ufc.com.webservice.dominios.Usuario;

public class AmbienteDTO {
    private String emailUsuario;
    private AmbienteVirtual ambienteVirtual;

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public AmbienteVirtual getAmbienteVirtual() {
        return ambienteVirtual;
    }

    public void setAmbienteVirtual(AmbienteVirtual ambienteVirtual) {
        this.ambienteVirtual = ambienteVirtual;
    }
}
