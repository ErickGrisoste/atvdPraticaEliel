package com.erickin.AtvPratica.repository;

import com.erickin.AtvPratica.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
