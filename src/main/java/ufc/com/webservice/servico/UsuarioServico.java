package ufc.com.webservice.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufc.com.webservice.dominios.Usuario;
import ufc.com.webservice.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }
    public Usuario resgatarUsuarioPeloEmail(String email){
        return usuarioRepositorio.findByEmail(email);
    }
    public Usuario atualizarUsuario(Usuario usuario){
        return salvarUsuario(usuario);
    }
}
