package ufc.com.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ufc.com.webservice.dto.AmbienteDTO;
import ufc.com.webservice.servico.AmbienteServico;

@RestController
public class ContribuirdorController {

    @Autowired
    private AmbienteServico ambienteServico;

    public ResponseEntity<?> criarNovoAmbiente(@RequestBody AmbienteDTO request){
        return new ResponseEntity<>( ambienteServico.salvarAmbiente(request.getEmailUsuario(),request.getAmbienteVirtual()),HttpStatus.CREATED);
    }
}
