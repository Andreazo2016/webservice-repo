package ufc.com.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ufc.com.webservice.dominios.AmbienteVirtual;
import ufc.com.webservice.dominios.MetaDados;
import ufc.com.webservice.dominios.Usuario;
import ufc.com.webservice.repositorio.AmbienteVirtualRepositorio;
import ufc.com.webservice.repositorio.UsuarioRepositorio;

import java.util.Arrays;

@SpringBootApplication
public class WebserviceApplication  implements CommandLineRunner {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private AmbienteVirtualRepositorio ambienteVirtualRepositorio;
    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DELETANTO TODOS OS USUARIOS");
        usuarioRepositorio.deleteAll();
        System.out.println("ADICIONANDO USUARIOS");
       Usuario u =  usuarioRepositorio.save(new Usuario("Andreazo Silva","andreazo@gmail.com","andre","123321a"));
        usuarioRepositorio.save(new Usuario("Anderson Silva","anderson@gmail.com","ander","123321a"));
        usuarioRepositorio.save(new Usuario("Biricutico Silva","biricutico@gmail.com","biri","123321a"));

        usuarioRepositorio.findAll()
                .stream()
                .forEach( usuario ->  {
                    System.out.println(usuario.toString());
                });

             ambienteVirtualRepositorio.deleteAll();
        MetaDados metaDados = new MetaDados(100.0,23.0,89.0);
        AmbienteVirtual ambienteVirtual = new AmbienteVirtual("Alaska","AMBIENTE GELADO",metaDados);
       u.getVirtualList().add(ambienteVirtual);
       usuarioRepositorio.save(u);
        ambienteVirtualRepositorio.save(ambienteVirtual);

        Usuario us = usuarioRepositorio.findByEmail("andreazo@gmail.com");
      System.out.println(us);
        System.out.println(us.getVirtualList().get(0).getDescricao());


    }
}
