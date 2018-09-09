package ufc.com.webservice.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import ufc.com.webservice.dominios.Usuario;

public interface UsuarioRepositorio extends MongoRepository<Usuario,String> {
    Usuario findByEmail(String email);
}
