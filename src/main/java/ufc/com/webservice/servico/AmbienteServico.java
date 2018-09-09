package ufc.com.webservice.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufc.com.webservice.dominios.AmbienteVirtual;
import ufc.com.webservice.dominios.Usuario;
import ufc.com.webservice.dto.AmbienteDTO;
import ufc.com.webservice.repositorio.AmbienteVirtualRepositorio;
import ufc.com.webservice.repositorio.UsuarioRepositorio;

import java.util.Optional;

@Service
public class AmbienteServico {
    @Autowired
    private UsuarioServico usuarioServico;
    @Autowired
    private AmbienteVirtualRepositorio ambienteVirtualRepositorio;

    public Usuario salvarAmbiente(String  email, AmbienteVirtual ambienteVirtual){
        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioServico.resgatarUsuarioPeloEmail(email));

        if(!usuarioOptional.isPresent()){

        }
        AmbienteVirtual virtual = ambienteVirtualRepositorio.save(ambienteVirtual);
        usuarioOptional.get().getVirtualList().add(virtual);
        return usuarioServico.atualizarUsuario(usuarioOptional.get());

    }
}
