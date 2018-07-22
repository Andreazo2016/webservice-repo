package ufc.com.webservice.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import ufc.com.webservice.dominios.AmbienteVirtual;

public interface AmbienteVirtualRepositorio extends MongoRepository<AmbienteVirtual,String> {
}
