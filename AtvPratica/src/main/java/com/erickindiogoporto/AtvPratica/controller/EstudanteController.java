package com.erickindiogoporto.AtvPratica.controller;

import com.erickindiogoporto.AtvPratica.model.EstudanteModel;
import com.erickindiogoporto.AtvPratica.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    private ResponseEntity<EstudanteModel> salvarEstudante(@RequestBody EstudanteModel estudanteModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(estudanteService.salvarEstudante(estudanteModel));
    }

    @GetMapping
    private ResponseEntity<List<EstudanteModel>> listarEstudantes(){
        return ResponseEntity.ok(estudanteService.listarEstudantes());
    }

    @GetMapping("/{id}")
    private ResponseEntity<EstudanteModel> buscarEstudantePorId(@PathVariable Long id){
        return ResponseEntity.ok(estudanteService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<HttpStatus> deletarEstudantes(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
        return ResponseEntity.noContent().build();
    }


}
