package com.Gym.Gym_web_v2.negocio.fachada;

import com.Gym.Gym_web_v2.dto.EntrenadorDTO;
import com.Gym.Gym_web_v2.negocio.EntrenadorNegocio;

import java.io.Serializable;

public class EntrenadorFacade implements Serializable {

    private EntrenadorNegocio negocio;

    public EntrenadorFacade(){
        negocio = new EntrenadorNegocio();
    }

    public boolean add(EntrenadorDTO entrenador){
        return negocio.add(entrenador);
    }

    public String login(EntrenadorDTO entrenador) { return negocio.login(entrenador); }
}
