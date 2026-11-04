package com.todocodearmy.envios.service;

import com.todocodearmy.envios.repository.IEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EnvioService implements IEnvioService{
    @Autowired
    private IEnvioRepository envioRepository;


}
