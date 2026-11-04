package com.todocodearmy.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.todocodearmy.envios.model.Envio;
@Repository
public interface IEnvioRepository extends JpaRepository<Envio, Long > {

}
