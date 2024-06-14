package edu.unisabana.model.amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasador {

  @Override
  public void amasar() {
    Logger
      .getLogger(AmasadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
  }
  
}