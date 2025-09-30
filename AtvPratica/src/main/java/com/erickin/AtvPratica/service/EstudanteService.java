package com.erickin.AtvPratica.service;

import com.erickin.AtvPratica.model.EstudanteModel;
import com.erickin.AtvPratica.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel salvarEstudante(EstudanteModel novoEstudante){
        return estudanteRepository.save(novoEstudante);
    }

    public List<EstudanteModel> listarEstudantes(){
        return estudanteRepository.findAll();
    }


    public EstudanteModel buscarPorId(Long id){
        return estudanteRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Estudante não encontrado."));
    }

    public EstudanteModel editarEstudante(Long id, EstudanteModel estudante){
        EstudanteModel estudanteEncontrado = buscarPorId(id);

        estudanteEncontrado.setEmail(estudante.getEmail());
        estudanteEncontrado.setNome(estudante.getNome());
        estudanteEncontrado.setIdade(estudante.getIdade());

        return estudanteRepository.save(estudanteEncontrado);
    }

    public void deletarEstudante(Long id){
        EstudanteModel estudanteDeletado = buscarPorId(id);
        estudanteRepository.delete(estudanteDeletado);
    }



}
