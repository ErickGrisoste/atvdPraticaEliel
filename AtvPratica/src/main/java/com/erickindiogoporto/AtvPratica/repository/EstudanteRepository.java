package com.erickindiogoporto.AtvPratica.repository;

import com.erickindiogoporto.AtvPratica.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
